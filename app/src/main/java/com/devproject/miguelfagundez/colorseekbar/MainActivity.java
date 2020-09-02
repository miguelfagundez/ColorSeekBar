package com.devproject.miguelfagundez.colorseekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.rtugeek.android.colorseekbar.ColorSeekBar;

public class MainActivity extends AppCompatActivity {

    // Members
    private TextView textView;
    private ColorSeekBar colorSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupMembers();
        setupListeners();
    }

    private void setupMembers() {
        textView = findViewById(R.id.tvSeekColor);
        colorSeekBar = findViewById(R.id.csbComponent);
    }

    private void setupListeners() {
        colorSeekBar.setOnColorChangeListener(new ColorSeekBar.OnColorChangeListener() {
            @Override
            public void onColorChangeListener(int colorBarPosition, int alphaBarPosition, int color) {
                textView.setTextColor(color);
            }
        });
    }
}