package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.udacity.gradle.builditbigger.utils.AdMachine;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private Button tellBtn;
    private ProgressBar loadingPb;
    private TextView instructionsTxt;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_main, container, false);
        AdMachine.loadAdIfNeeded(root.findViewById(R.id.adView));

        instructionsTxt = root.findViewById(R.id.instructions_text_view);
        tellBtn = root.findViewById(R.id.tell_btn);
        loadingPb = root.findViewById(R.id.loading_pb);

        return root;
    }

    public void showLoading() {
        instructionsTxt.setVisibility(View.GONE);
        tellBtn.setVisibility(View.GONE);
        loadingPb.setVisibility(View.VISIBLE);
    }

    public void hideLoading() {
        instructionsTxt.setVisibility(View.VISIBLE);
        tellBtn.setVisibility(View.VISIBLE);
        loadingPb.setVisibility(View.GONE);
    }
}
