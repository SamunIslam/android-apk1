package com.marutiappsolution.tipsforsonylive;

import android.content.Context;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import java.util.Locale;

/* loaded from: classes.dex */
public class DetailsActivity extends AppCompatActivity {
    Button btnSpeech;
    Context context;
    TextView desc;
    ImageView imageView;
    ImageView imgback;
    private UnifiedNativeAd nativeAd;
    private String pos;
    TextToSpeech textToSpeech;
    TextView textView;
    public int[] disc = {R.string.aa, R.string.bb, R.string.cc, R.string.dd, R.string.ee, R.string.ff, R.string.gg};
    public int[] name = {R.string.a, R.string.b, R.string.c, R.string.d, R.string.e, R.string.f, R.string.g};

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_details);
        this.context = this;
        this.btnSpeech = (Button) findViewById(R.id.btnSpeech);
        this.imageView = (ImageView) findViewById(R.id.ivBG);
        this.imgback = (ImageView) findViewById(R.id.imgBack);
        this.textView = (TextView) findViewById(R.id.text);
        this.desc = (TextView) findViewById(R.id.txtDesc);
        this.pos = getIntent().getStringExtra("pos");
        this.imgback.setOnClickListener(new View.OnClickListener() { // from class: com.marutiappsolution.tipsforsonylive.DetailsActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DetailsActivity.this.finish();
            }
        });
        refreshAd();
        this.textView.setText(this.name[Integer.parseInt(this.pos)]);
        this.desc.setText(this.disc[Integer.parseInt(this.pos)]);
        this.btnSpeech.setOnClickListener(new View.OnClickListener() { // from class: com.marutiappsolution.tipsforsonylive.DetailsActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DetailsActivity.this.textToSpeech.speak(DetailsActivity.this.desc.getText().toString(), 0, null);
            }
        });
        this.textToSpeech = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() { // from class: com.marutiappsolution.tipsforsonylive.DetailsActivity.3
            @Override // android.speech.tts.TextToSpeech.OnInitListener
            public void onInit(int i) {
                if (i != -1) {
                    DetailsActivity.this.textToSpeech.setLanguage(Locale.US);
                }
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        TextToSpeech textToSpeech = this.textToSpeech;
        if (textToSpeech != null) {
            textToSpeech.stop();
            this.textToSpeech.shutdown();
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        TextToSpeech textToSpeech = this.textToSpeech;
        if (textToSpeech != null) {
            textToSpeech.stop();
            this.textToSpeech.shutdown();
            super.onPause();
        }
    }

    private void refreshAd() {
        AdLoader.Builder builder = new AdLoader.Builder(this, getResources().getString(R.string.Admob_Native));
        builder.forUnifiedNativeAd(new UnifiedNativeAd.OnUnifiedNativeAdLoadedListener() { // from class: com.marutiappsolution.tipsforsonylive.DetailsActivity.4
            @Override // com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener
            public void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiedNativeAd) {
                if (DetailsActivity.this.nativeAd != null) {
                    DetailsActivity.this.nativeAd.destroy();
                }
                DetailsActivity.this.nativeAd = unifiedNativeAd;
                FrameLayout frameLayout = (FrameLayout) DetailsActivity.this.findViewById(R.id.fl_adplaceholder);
                UnifiedNativeAdView unifiedNativeAdView = (UnifiedNativeAdView) DetailsActivity.this.getLayoutInflater().inflate(R.layout.admob_native, (ViewGroup) null);
                DetailsActivity.this.populateUnifiedNativeAdView(unifiedNativeAd, unifiedNativeAdView);
                frameLayout.removeAllViews();
                frameLayout.addView(unifiedNativeAdView);
            }
        });
        builder.withNativeAdOptions(new NativeAdOptions.Builder().setVideoOptions(new VideoOptions.Builder().build()).build());
        builder.withAdListener(new AdListener() { // from class: com.marutiappsolution.tipsforsonylive.DetailsActivity.5
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
            videoController.setVideoLifecycleCallbacks(new VideoController.VideoLifecycleCallbacks() { // from class: com.marutiappsolution.tipsforsonylive.DetailsActivity.6
                @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
                public void onVideoEnd() {
                    super.onVideoEnd();
                }
            });
        }
    }
}
