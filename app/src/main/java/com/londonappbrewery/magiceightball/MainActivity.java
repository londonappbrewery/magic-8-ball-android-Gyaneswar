package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button magic = findViewById(R.id.magic);
        final ImageView answer=findViewById(R.id.magicAnswer);

        final int photos[]={R.drawable.ball1
        ,R.drawable.ball2
        ,R.drawable.ball3
        ,R.drawable.ball4
        ,R.drawable.ball5};

        magic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random=new Random();

                int number=random.nextInt(5);

                answer.setImageResource(photos[number]);
            }
        });
    }
}
