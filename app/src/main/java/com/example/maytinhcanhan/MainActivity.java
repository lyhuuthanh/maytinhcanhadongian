package com.example.maytinhcanhan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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

    }
}
