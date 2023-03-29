package com.marutiappsolution.tipsforsonylive;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class splash extends AppCompatActivity {
    private static final int REQ_CODE_PERMISSOINS = 111;
    private InterstitialAd mInterstitialAdMob;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        super.onCreate(bundle);
        setContentView(R.layout.activity_splash);
        this.mInterstitialAdMob = showAdmobFullAd();
        loadAdmobAd();
        if (Build.VERSION.SDK_INT >= 23) {
            checkMultiplePermissions();
        } else {
            new Handler().postDelayed(new Runnable() { // from class: com.marutiappsolution.tipsforsonylive.splash.1
                @Override // java.lang.Runnable
                public void run() {
                    splash.this.HomeScreen();
                }
            }, 6000L);
        }
    }

    private InterstitialAd showAdmobFullAd() {
        InterstitialAd interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId(getResources().getString(R.string.Admob_interstitial));
        interstitialAd.setAdListener(new AdListener() { // from class: com.marutiappsolution.tipsforsonylive.splash.2
            @Override // com.google.android.gms.ads.AdListener
            public void onAdClosed() {
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdOpened() {
            }
        });
        return interstitialAd;
    }

    private void loadAdmobAd() {
        this.mInterstitialAdMob.loadAd(new AdRequest.Builder().build());
    }

    private void showAdmobInterstitial() {
        InterstitialAd interstitialAd = this.mInterstitialAdMob;
        if (interstitialAd == null || !interstitialAd.isLoaded()) {
            return;
        }
        this.mInterstitialAdMob.show();
    }

    private void checkMultiplePermissions() {
        if (Build.VERSION.SDK_INT >= 23) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (!addPermission(arrayList2, "android.permission.READ_EXTERNAL_STORAGE")) {
                arrayList.add("Read Storage");
            }
            if (!addPermission(arrayList2, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                arrayList.add("Write Storage");
            }
            if (arrayList2.size() > 0) {
                requestPermissions((String[]) arrayList2.toArray(new String[arrayList2.size()]), 111);
            } else {
                new Handler().postDelayed(new Runnable() { // from class: com.marutiappsolution.tipsforsonylive.splash.3
                    @Override // java.lang.Runnable
                    public void run() {
                        splash.this.HomeScreen();
                    }
                }, 6000L);
            }
        }
    }

    private boolean addPermission(List<String> list, String str) {
        if (Build.VERSION.SDK_INT < 23 || checkSelfPermission(str) == 0) {
            return true;
        }
        list.add(str);
        return shouldShowRequestPermissionRationale(str);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 111) {
            HashMap hashMap = new HashMap();
            hashMap.put("android.permission.WRITE_EXTERNAL_STORAGE", 0);
            hashMap.put("android.permission.READ_EXTERNAL_STORAGE", 0);
            for (int i2 = 0; i2 < strArr.length; i2++) {
                hashMap.put(strArr[i2], Integer.valueOf(iArr[i2]));
            }
            if (((Integer) hashMap.get("android.permission.READ_EXTERNAL_STORAGE")).intValue() == 0 && ((Integer) hashMap.get("android.permission.WRITE_EXTERNAL_STORAGE")).intValue() == 0) {
                new Handler().postDelayed(new Runnable() { // from class: com.marutiappsolution.tipsforsonylive.splash.4
                    @Override // java.lang.Runnable
                    public void run() {
                        splash.this.HomeScreen();
                    }
                }, 6000L);
                return;
            } else if (Build.VERSION.SDK_INT >= 23) {
                Toast.makeText(getApplicationContext(), "My App cannot run without Storage Permissions.\nRelaunch My App or allow permissions in Applications Settings", 1).show();
                finish();
                return;
            } else {
                return;
            }
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void HomeScreen() {
        startActivity(new Intent(this, StartActivity.class));
        showAdmobInterstitial();
        finish();
    }
}
