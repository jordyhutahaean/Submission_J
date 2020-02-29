package com.dicoding.picodiploma.submissionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class FGO extends AppCompatActivity {
    public static String EXTRA_DESC = "chara_descs";
    TextView name, details;
    ImageView picture;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fgo);
        initView();
        showCharData();
    }

    private void initView() {
        name = findViewById(R.id.ch_item_name);
        details = findViewById(R.id.ch_item_detail);
        picture = findViewById(R.id.ch_item_photo);
    }


    private void showCharData() {
        Chara chara = getIntent().getParcelableExtra(EXTRA_DESC);

        if(chara == null) return;

        Glide.with(this)
                .load(chara.getPhoto())
                .into(picture);
        name.setText(chara.getName());
        details.setText(chara.getDetail());
    }


    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}
