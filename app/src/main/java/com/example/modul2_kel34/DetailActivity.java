package com.example.modul2_kel34;

import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.modul2_kel34.R;

public class DetailActivity extends AppCompatActivity {

    private TextView tvNama, tvLNama, tvEmail;
    private ImageView ivAvatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvNama = findViewById(R.id.tv_first_name);
        tvLNama = findViewById(R.id.tv_last_name);
        tvEmail = findViewById(R.id.tv_email);
        ivAvatar = findViewById(R.id.iv_avatar);

        if (getIntent().hasExtra("name")) {

            String nama = getIntent().getStringExtra("name");
            String lnama = getIntent().getStringExtra("lname");
            String email = getIntent().getStringExtra("email");
            String avatar = getIntent().getStringExtra("avatar");
            tvNama.setText(nama);
            tvLNama.setText(lnama);
            tvEmail.setText(email);
            Glide.with(this).load(avatar).into(ivAvatar);
        }
    }
}
