package com.example.watch_app;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.example.watch_app.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private TextView mTextView;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;

        mHandler.postDelayed(mUpdateUITimerTask, 3 * 1000);
    }


    private final Runnable mUpdateUITimerTask = new Runnable() {
        @Override
        public void run() {
            mTextView.setText("11-11-11");
        }
    };
    private final Handler mHandler = new Handler();
}