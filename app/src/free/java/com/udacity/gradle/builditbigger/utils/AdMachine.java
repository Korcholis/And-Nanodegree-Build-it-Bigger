package com.udacity.gradle.builditbigger.utils;

import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class AdMachine {
    public static final void loadAdIfNeeded(View view) {
        AdView adView = (AdView) view;

        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        adView.loadAd(adRequest);
    }
}
