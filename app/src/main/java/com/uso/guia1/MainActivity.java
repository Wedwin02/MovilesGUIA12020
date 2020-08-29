package com.uso.guia1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void Calculadora_onClick(View v){
        Intent frm = new Intent(this, Calculadora.class);
        startActivity(frm);
    }

    public  void Login_onClick(View v){
        Intent frm = new Intent(this, Login.class);
        startActivity(frm);
    }
}