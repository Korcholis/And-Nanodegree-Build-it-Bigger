package com.udacity.gradle.builditbigger.utils;

import android.content.Context;
import android.view.View;

public class AdMachine {
    public static final void loadAdIfNeeded(View view) {
        /* No ads for you, loyal customer! */
    }

    public static final void init(Context context) {
        /* No ads for you, loyal customer! */
    }

    public static final void loadInterstitialIfNeeded(final OnInterstitialFinishedListener listener) {
        /* No ads for you, loyal customer! */
        if (listener != null) {
            listener.onFinish();
        }
    }

    public interface OnInterstitialFinishedListener {
        void onFinish();
    }
}
