package com.xinghai.tagviewsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class GuideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
    }

    public void onLabelViewClick(View view){
        startActivity(new Intent(this,MainActivity.class));
    }

    public void onPicTagClick(View view){
        startActivity(new Intent(this,PictureTagActivity.class));
    }

}
