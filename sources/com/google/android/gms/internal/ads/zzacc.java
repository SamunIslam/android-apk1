package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzacc extends RelativeLayout {
    private static final float[] zzcyf = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    private AnimationDrawable zzcyg;

    public zzacc(Context context, zzacd zzacdVar, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        Preconditions.checkNotNull(zzacdVar);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(zzcyf, null, null));
        shapeDrawable.getPaint().setColor(zzacdVar.getBackgroundColor());
        setLayoutParams(layoutParams);
        com.google.android.gms.ads.internal.zzq.zzky();
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(zzacdVar.getText())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(zzacdVar.getText());
            textView.setTextColor(zzacdVar.getTextColor());
            textView.setTextSize(zzacdVar.getTextSize());
            zzvj.zzpr();
            int zzc = zzazm.zzc(context, 4);
            zzvj.zzpr();
            textView.setPadding(zzc, 0, zzazm.zzc(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<zzace> zzrs = zzacdVar.zzrs();
        if (zzrs != null && zzrs.size() > 1) {
            this.zzcyg = new AnimationDrawable();
            for (zzace zzaceVar : zzrs) {
                try {
                    this.zzcyg.addFrame((Drawable) ObjectWrapper.unwrap(zzaceVar.zzrv()), zzacdVar.zzrt());
                } catch (Exception e) {
                    zzawr.zzc("Error while getting drawable.", e);
                }
            }
            com.google.android.gms.ads.internal.zzq.zzky();
            imageView.setBackground(this.zzcyg);
        } else if (zzrs.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) ObjectWrapper.unwrap(zzrs.get(0).zzrv()));
            } catch (Exception e2) {
                zzawr.zzc("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.zzcyg;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
