package com.marutiappsolution.tipsforsonylive;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* loaded from: classes.dex */
public class globals {
    public static String app_name = "Guide For Sonyliv";
    public static String playlink = "https://play.google.com/store/apps/details?id=";
    public static String privacyPolicyssssssssss = "https://marutiappsolution.blogspot.com/2020/03/privacy-policy-this-privacy-policy.html";
    public static String publisherlinksssssssssss = "https://play.google.com/store/apps/developer?id=Maruti+App+Solution";

    public static Boolean CheckNet(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return Boolean.valueOf(activeNetworkInfo != null && activeNetworkInfo.isConnected());
    }
}
