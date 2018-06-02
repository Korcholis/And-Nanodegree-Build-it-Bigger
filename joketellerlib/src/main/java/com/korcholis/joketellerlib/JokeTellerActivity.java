package com.korcholis.joketellerlib;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class JokeTellerActivity extends AppCompatActivity {

    public static final String JOKE_INTENT_EXTRA = "joke_intent_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_teller);
        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView jokeTv = findViewById(R.id.joke_tv);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        String joke = intent.getStringExtra(JOKE_INTENT_EXTRA);
        jokeTv.setText(joke);
    }

}
