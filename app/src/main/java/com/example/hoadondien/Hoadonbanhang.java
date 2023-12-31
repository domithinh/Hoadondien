package com.example.hoadondien;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Hoadonbanhang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoadonbanhang);
        Button btntinhtien = findViewById(R.id.btn_tinhtien);
        Button btntinhlai = findViewById(R.id.btn_tinhlai);
        Button btnthoat = findViewById(R.id.btn_thoat);
        EditText txthoten = findViewById(R.id.txt_hoten);
        EditText txtcstt = findViewById(R.id.txt_cstt);
        EditText txtcstn = findViewById(R.id.txt_cstn);
        TextView txtthanhtien = findViewById(R.id.txt_thanhtien);
        CheckBox VAT = findViewById(R.id.chboxVAT);
        btnthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
                System.exit(0);
            }
        });
        VAT.setChecked(true);
        btntinhtien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float cstt = Float.parseFloat(txtcstt.getText().toString());
                float cstn = Float.parseFloat(txtcstn.getText().toString());
                float sodien = cstn - cstt;
                float thanhtien = (float) (2500* (sodien + sodien * 0.1));
                txtthanhtien.setText("" + thanhtien);
            }
        });
        btntinhlai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txthoten.setText("");
                txtcstt.setText("");
                txtcstn.setText("");
                txtthanhtien.setText("");
            }
        });
    }
}