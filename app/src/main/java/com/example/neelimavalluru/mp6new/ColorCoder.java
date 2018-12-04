package com.example.neelimavalluru.mp6new;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ColorCoder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_coder);
        Button RedButton = (Button) findViewById(R.id.red);
        RedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView colorchanger = (ImageView) findViewById(R.id.image);
                int red = Color.parseColor("#ec0819");
                colorchanger.setColorFilter(red);

            }
        });
        Button BlueButton = (Button) findViewById(R.id.blue);
        BlueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView colorchanger = (ImageView) findViewById(R.id.image);
                int blue = Color.parseColor("#FF0808EC");
                colorchanger.setColorFilter(blue);

            }
        });
        Button GreenButton = (Button) findViewById(R.id.green);
        GreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView colorchanger = (ImageView) findViewById(R.id.image);
                int green = Color.parseColor("#FF08EC54");
                colorchanger.setColorFilter(green);

            }
        });
        Button BlackButton = (Button) findViewById(R.id.black);
        BlackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView colorchanger = (ImageView) findViewById(R.id.image);
                int black = Color.parseColor("#FF060606");
                colorchanger.setColorFilter(black);

            }
        });
        Button YellowButton = (Button) findViewById(R.id.yellow);
        YellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView colorchanger = (ImageView) findViewById(R.id.image);
                int yellow = Color.parseColor("#FFECD508");
                colorchanger.setColorFilter(yellow);

            }
        });
        Button PurpleButton = (Button) findViewById(R.id.purple);
        PurpleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView colorchanger = (ImageView) findViewById(R.id.image);
                int purple = Color.parseColor("#FF7A08EC");
                colorchanger.setColorFilter(purple);

            }
        });
    }
}
