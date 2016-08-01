package com.xinghai.tagviewsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.xinghai.tagview.LabelButtonView;
import com.xinghai.tagview.LabelImageView;
import com.xinghai.tagview.LabelTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LabelButtonView labelButtonView = (LabelButtonView)findViewById(R.id.labelbutton);
        labelButtonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelButtonView.setLabelVisual(!labelButtonView.isLabelVisual());
            }
        });

        final LabelImageView labelImageView1 = (LabelImageView)findViewById(R.id.image1);
        labelImageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelImageView1.setLabelDistance(50);
            }
        });

        final LabelImageView labelImageView2 = (LabelImageView)findViewById(R.id.image2);
        labelImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelImageView2.setLabelText("ART");
            }
        });


        final LabelTextView labelTextView = (LabelTextView)findViewById(R.id.text);
        labelTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelTextView.setLabelOrientation(3);
            }
        });


        findViewById(R.id.click).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ListViewActivity.class));
            }
        });

        findViewById(R.id.click11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RecyclerViewActivity.class));
            }
        });
    }

}
