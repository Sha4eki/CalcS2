package com.example.calcs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int width = 0;
    int height = 0;
    int square = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView_square = findViewById(R.id.textView_square);

        SeekBar seekBar_widht = findViewById(R.id.seekBar_widht);
        TextView textView_widht = findViewById(R.id.seekBarValue_widht);
        seekBar_widht.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                textView_widht.setText(String.valueOf(progress));
                width = Integer.parseInt(String.valueOf(progress));
                square = width*height;

                textView_square.setText(Integer.toString(square));
                //valueOf(seekBar.getProgress())
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        TextView textView_square1 = findViewById(R.id.textView_square);

        SeekBar seekBar_height = findViewById(R.id.seekBar_height);
        TextView textView_height = findViewById(R.id.seekBarValue_height);
        seekBar_height.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                textView_height.setText(String.valueOf(progress));
                height = Integer.parseInt(String.valueOf(progress));
                square = width*height;

                textView_square.setText(Integer.toString(square));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }


}
