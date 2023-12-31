package com.example.hoadondien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Lienhekhachhang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lienhekhachhang);
        EditText sdt = findViewById(R.id.txt_sdt);
        ImageButton btncall = findViewById(R.id.btn_call);
        Button btnnext = findViewById(R.id.btn_next);
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Lienhekhachhang.this, JsonKhachHang.class);
                startActivity(intent);
            }
        });
        btncall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String SDT = sdt.getText().toString();
                if(SDT.isEmpty())
                {
                    Toast.makeText(Lienhekhachhang.this, "Số điện thoại không được để trống", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String dial = "tel:" + SDT;
                    startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
                }
            }
        });
    }
}