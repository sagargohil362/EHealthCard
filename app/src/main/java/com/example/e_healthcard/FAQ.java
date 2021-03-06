package com.example.e_healthcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.e_healthcard.ui.faq.FAQFragment;

public class FAQ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.f_a_q_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, FAQFragment.newInstance())
                    .commitNow();
        }
    }
}
