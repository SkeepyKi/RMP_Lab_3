package com.example.lab_3;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class FrameLayoutActivity extends AppCompatActivity {

    private ImageView imageView;
    private int[] images = {
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3
    };
    private int currentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_gallery);

        imageView = findViewById(R.id.imageView);
        ImageButton btnChange = findViewById(R.id.btn_change);

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentIndex = (currentIndex + 1) % images.length;
                imageView.setImageResource(images[currentIndex]);
            }
        });
    }
}