package com.udacity.gradle.builditbigger.utils;

import android.content.Context;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.udacity.gradle.builditbigger.R;

public class AdMachine {
    private static InterstitialAd interstitialAd;

    public static final void loadAdIfNeeded(View view) {
        AdView adView = (AdView) view;

        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        adView.loadAd(adRequest);
    }

    public static final void init(Context context) {
        interstitialAd = new InterstitialAd(context);
        interstitialAd.setAdUnitId(context.getString(R.string.inters_ad_unit_id));
        interstitialAd.loadAd(new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build());
    }

    public static final void loadInterstitialIfNeeded(final OnInterstitialFinishedListener listener) {
        interstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                if (listener != null) {
                    listener.onFinish();
                }
                interstitialAd.loadAd(new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build());
            }
        });
        if (interstitialAd.isLoaded()) {
            interstitialAd.show();
        } else if (listener != null) {
            listener.onFinish();
        }
    }

    public interface OnInterstitialFinishedListener {
        void onFinish();
    }
}
