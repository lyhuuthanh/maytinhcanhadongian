package com.example.maytinhcanhan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView mmaytinhcanhan, mketqua;
Button btnphepcong, btnpheptru, btnphepnhan, btnphepchia, btnRandom;
EditText MnhapsoA, MnhapsoB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //anh xa
        mmaytinhcanhan = (TextView)findViewById(R.id.maytinhcanhan);
        mketqua = (TextView)findViewById(R.id.ketqua);
        MnhapsoA = (EditText)findViewById(R.id.nhapsoA);
        MnhapsoB = (EditText)findViewById(R.id.nhapsoB);
        btnphepcong = (Button)findViewById(R.id.phepcong);
        btnpheptru = (Button)findViewById(R.id.pheptru);
        btnphepnhan = (Button)findViewById(R.id.phepnhan);
        btnphepchia = (Button)findViewById(R.id.phepchia);
        btnRandom = (Button)findViewById(R.id.random);

        btnphepcong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nhapsoa = MnhapsoA.getText().toString();
                int soa = Integer.parseInt(nhapsoa);
                String nhapsob = MnhapsoB.getText().toString();
                int sob = Integer.parseInt(nhapsob);

                int soab = soa + sob;
                mketqua.setText( String.valueOf(soab));

            }
        });
        btnpheptru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chuoisoa = MnhapsoA.getText().toString();
                int soa = Integer.parseInt(chuoisoa);
                String chuoisob = MnhapsoB.getText().toString();
                int sob = Integer.parseInt(chuoisob);
                int soab = soa - sob;
                if (soa <= sob) {
                    Toast.makeText(MainActivity.this, "Bạn nhập sai số",Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    mketqua.setText(String.valueOf(soab));

                }

            }
        });
        btnphepnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chuoia = MnhapsoA.getText().toString();
                int soa = Integer.parseInt(chuoia);
                String chuoib = MnhapsoB.getText().toString();
                int sob = Integer.parseInt(chuoib);
                int soab = soa * sob;
                mketqua.setText(String.valueOf(soab));
            }
        });
        btnphepchia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chuoia = MnhapsoA.getText().toString();
                int soa = Integer.parseInt(chuoia);
                String chuoib = MnhapsoB.getText().toString();
                int sob = Integer.parseInt(chuoib);
                int soab = soa / sob;
                if (soa < sob) {
                    Toast.makeText(MainActivity.this,"Chia không được, nhập lại đi bạn", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    mketqua.setText(String.valueOf(soab));
                }
            }
        });
        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
