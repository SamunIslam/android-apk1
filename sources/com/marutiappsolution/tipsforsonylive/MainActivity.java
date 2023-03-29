package com.marutiappsolution.tipsforsonylive;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

/* loaded from: classes.dex */
public class MainActivity extends AppCompatActivity {
    Context context;
    Intent intent;
    AdView mAdView;
    private InterstitialAd mInterstitialAdMob;

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        this.context = this;
        this.mInterstitialAdMob = showAdmobFullAd();
        loadAdmobAd();
        MobileAds.initialize(this, getString(R.string.Admob_Banner));
        this.mAdView = (AdView) findViewById(R.id.adView);
        this.mAdView.loadAd(new AdRequest.Builder().build());
    }

    public void one(View view) {
        Intent intent = new Intent(this, DetailsActivity.class);
        this.intent = intent;
        intent.putExtra("pos", "0");
        startActivity(this.intent);
        showInterstitial();
    }

    public void two(View view) {
        Intent intent = new Intent(this, DetailsActivity.class);
        this.intent = intent;
        intent.putExtra("pos", "1");
        startActivity(this.intent);
        showInterstitial();
    }

    public void three(View view) {
        Intent intent = new Intent(this, DetailsActivity.class);
        this.intent = intent;
        intent.putExtra("pos", "2");
        startActivity(this.intent);
        showInterstitial();
    }

    public void four(View view) {
        Intent intent = new Intent(this, DetailsActivity.class);
        this.intent = intent;
        intent.putExtra("pos", "3");
        startActivity(this.intent);
        showInterstitial();
    }

    public void five(View view) {
        Intent intent = new Intent(this, DetailsActivity.class);
        this.intent = intent;
        intent.putExtra("pos", "4");
        startActivity(this.intent);
        showInterstitial();
    }

    public void six(View view) {
        Intent intent = new Intent(this, DetailsActivity.class);
        this.intent = intent;
        intent.putExtra("pos", "5");
        startActivity(this.intent);
        showInterstitial();
    }

    public void seven(View view) {
        Intent intent = new Intent(this, DetailsActivity.class);
        this.intent = intent;
        intent.putExtra("pos", "6");
        startActivity(this.intent);
        showInterstitial();
    }

    private InterstitialAd showAdmobFullAd() {
        InterstitialAd interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId(getResources().getString(R.string.Admob_interstitial));
        interstitialAd.setAdListener(new AdListener() { // from class: com.marutiappsolution.tipsforsonylive.MainActivity.1
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

    private void showInterstitial() {
        InterstitialAd interstitialAd = this.mInterstitialAdMob;
        if (interstitialAd == null || !interstitialAd.isLoaded()) {
            return;
        }
        this.mInterstitialAdMob.show();
    }
}
