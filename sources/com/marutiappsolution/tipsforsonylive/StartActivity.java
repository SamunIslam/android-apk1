package com.marutiappsolution.tipsforsonylive;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public class StartActivity extends AppCompatActivity {
    Context context;
    Intent intent;
    private InterstitialAd mInterstitialAdMob;
    ImageView more;
    private UnifiedNativeAd nativeAd;
    ImageView privacy;
    ImageView rate;
    ImageView share;
    ImageView start;

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.activity_start);
        this.context = this;
        this.start = (ImageView) findViewById(R.id.start);
        this.rate = (ImageView) findViewById(R.id.rate);
        refreshAd();
        this.more = (ImageView) findViewById(R.id.more);
        this.privacy = (ImageView) findViewById(R.id.privacy);
        this.share = (ImageView) findViewById(R.id.share);
        this.mInterstitialAdMob = showAdmobFullAd();
        loadAdmobAd();
        this.share.setOnClickListener(new View.OnClickListener() { // from class: com.marutiappsolution.tipsforsonylive.StartActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                StartActivity.this.share();
            }
        });
        this.rate.setOnClickListener(new View.OnClickListener() { // from class: com.marutiappsolution.tipsforsonylive.StartActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                StartActivity startActivity = StartActivity.this;
                startActivity.gotoStore("market://details?id=" + StartActivity.this.getPackageName());
            }
        });
        this.more.setOnClickListener(new View.OnClickListener() { // from class: com.marutiappsolution.tipsforsonylive.StartActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (globals.CheckNet(StartActivity.this).booleanValue() && globals.publisherlinksssssssssss != null) {
                    StartActivity.this.gotoStore(globals.publisherlinksssssssssss);
                } else {
                    Toast.makeText(StartActivity.this, "No Internet Connection..", 0).show();
                }
            }
        });
        this.privacy.setOnClickListener(new View.OnClickListener() { // from class: com.marutiappsolution.tipsforsonylive.StartActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (globals.CheckNet(StartActivity.this).booleanValue() && globals.privacyPolicyssssssssss != null) {
                    StartActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(globals.privacyPolicyssssssssss)));
                    return;
                }
                Toast.makeText(StartActivity.this.getApplicationContext(), "Please Check Internet Connection", 0).show();
            }
        });
        this.start.setOnClickListener(new View.OnClickListener() { // from class: com.marutiappsolution.tipsforsonylive.StartActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                StartActivity.this.startActivity(new Intent(StartActivity.this, MainActivity.class));
                StartActivity.this.showAdmobInterstitial();
            }
        });
    }

    private void refreshAd() {
        AdLoader.Builder builder = new AdLoader.Builder(this, getResources().getString(R.string.Admob_Native));
        builder.forUnifiedNativeAd(new UnifiedNativeAd.OnUnifiedNativeAdLoadedListener() { // from class: com.marutiappsolution.tipsforsonylive.StartActivity.6
            @Override // com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener
            public void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiedNativeAd) {
                if (StartActivity.this.nativeAd != null) {
                    StartActivity.this.nativeAd.destroy();
                }
                StartActivity.this.nativeAd = unifiedNativeAd;
                FrameLayout frameLayout = (FrameLayout) StartActivity.this.findViewById(R.id.fl_adplaceholder);
                UnifiedNativeAdView unifiedNativeAdView = (UnifiedNativeAdView) StartActivity.this.getLayoutInflater().inflate(R.layout.admob_native, (ViewGroup) null);
                StartActivity.this.populateUnifiedNativeAdView(unifiedNativeAd, unifiedNativeAdView);
                frameLayout.removeAllViews();
                frameLayout.addView(unifiedNativeAdView);
            }
        });
        builder.withNativeAdOptions(new NativeAdOptions.Builder().setVideoOptions(new VideoOptions.Builder().build()).build());
        builder.withAdListener(new AdListener() { // from class: com.marutiappsolution.tipsforsonylive.StartActivity.7
            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(int i) {
            }
        }).build().loadAd(new AdRequest.Builder().build());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        UnifiedNativeAd unifiedNativeAd = this.nativeAd;
        if (unifiedNativeAd != null) {
            unifiedNativeAd.destroy();
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void populateUnifiedNativeAdView(UnifiedNativeAd unifiedNativeAd, UnifiedNativeAdView unifiedNativeAdView) {
        unifiedNativeAdView.setMediaView((MediaView) unifiedNativeAdView.findViewById(R.id.ad_media));
        unifiedNativeAdView.setHeadlineView(unifiedNativeAdView.findViewById(R.id.ad_headline));
        unifiedNativeAdView.setBodyView(unifiedNativeAdView.findViewById(R.id.ad_body));
        unifiedNativeAdView.setCallToActionView(unifiedNativeAdView.findViewById(R.id.ad_call_to_action));
        unifiedNativeAdView.setIconView(unifiedNativeAdView.findViewById(R.id.ad_app_icon));
        unifiedNativeAdView.setPriceView(unifiedNativeAdView.findViewById(R.id.ad_price));
        unifiedNativeAdView.setStarRatingView(unifiedNativeAdView.findViewById(R.id.ad_stars));
        unifiedNativeAdView.setStoreView(unifiedNativeAdView.findViewById(R.id.ad_store));
        unifiedNativeAdView.setAdvertiserView(unifiedNativeAdView.findViewById(R.id.ad_advertiser));
        ((TextView) unifiedNativeAdView.getHeadlineView()).setText(unifiedNativeAd.getHeadline());
        if (unifiedNativeAd.getBody() == null) {
            unifiedNativeAdView.getBodyView().setVisibility(4);
        } else {
            unifiedNativeAdView.getBodyView().setVisibility(0);
            ((TextView) unifiedNativeAdView.getBodyView()).setText(unifiedNativeAd.getBody());
        }
        if (unifiedNativeAd.getCallToAction() == null) {
            unifiedNativeAdView.getCallToActionView().setVisibility(4);
        } else {
            unifiedNativeAdView.getCallToActionView().setVisibility(0);
            ((Button) unifiedNativeAdView.getCallToActionView()).setText(unifiedNativeAd.getCallToAction());
        }
        if (unifiedNativeAd.getIcon() == null) {
            unifiedNativeAdView.getIconView().setVisibility(8);
        } else {
            ((ImageView) unifiedNativeAdView.getIconView()).setImageDrawable(unifiedNativeAd.getIcon().getDrawable());
            unifiedNativeAdView.getIconView().setVisibility(0);
        }
        if (unifiedNativeAd.getPrice() == null) {
            unifiedNativeAdView.getPriceView().setVisibility(4);
        } else {
            unifiedNativeAdView.getPriceView().setVisibility(0);
            ((TextView) unifiedNativeAdView.getPriceView()).setText(unifiedNativeAd.getPrice());
        }
        if (unifiedNativeAd.getStore() == null) {
            unifiedNativeAdView.getStoreView().setVisibility(4);
        } else {
            unifiedNativeAdView.getStoreView().setVisibility(0);
            ((TextView) unifiedNativeAdView.getStoreView()).setText(unifiedNativeAd.getStore());
        }
        if (unifiedNativeAd.getStarRating() == null) {
            unifiedNativeAdView.getStarRatingView().setVisibility(4);
        } else {
            ((RatingBar) unifiedNativeAdView.getStarRatingView()).setRating(unifiedNativeAd.getStarRating().floatValue());
            unifiedNativeAdView.getStarRatingView().setVisibility(0);
        }
        if (unifiedNativeAd.getAdvertiser() == null) {
            unifiedNativeAdView.getAdvertiserView().setVisibility(4);
        } else {
            ((TextView) unifiedNativeAdView.getAdvertiserView()).setText(unifiedNativeAd.getAdvertiser());
            unifiedNativeAdView.getAdvertiserView().setVisibility(0);
        }
        unifiedNativeAdView.setNativeAd(unifiedNativeAd);
        VideoController videoController = unifiedNativeAd.getVideoController();
        if (videoController.hasVideoContent()) {
            videoController.setVideoLifecycleCallbacks(new VideoController.VideoLifecycleCallbacks() { // from class: com.marutiappsolution.tipsforsonylive.StartActivity.8
                @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
                public void onVideoEnd() {
                    super.onVideoEnd();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void share() {
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().build());
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.icon);
        File file = new File(getExternalCacheDir() + "/" + getResources().getString(R.string.app_name) + ".png");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            decodeResource.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.TEXT", globals.app_name + " Download from there : " + globals.playlink + getPackageName());
            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
            startActivity(Intent.createChooser(intent, "Share App"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void gotoStore(String str) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this, "You don't have Google Play installed", 1).show();
        }
    }

    private InterstitialAd showAdmobFullAd() {
        InterstitialAd interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId(getResources().getString(R.string.Admob_interstitial));
        interstitialAd.setAdListener(new AdListener() { // from class: com.marutiappsolution.tipsforsonylive.StartActivity.9
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

    /* JADX INFO: Access modifiers changed from: private */
    public void showAdmobInterstitial() {
        InterstitialAd interstitialAd = this.mInterstitialAdMob;
        if (interstitialAd == null || !interstitialAd.isLoaded()) {
            return;
        }
        this.mInterstitialAdMob.show();
    }
}
