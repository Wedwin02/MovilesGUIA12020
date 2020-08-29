package com.uso.guia1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Inicio extends AppCompatActivity {

    TextView lblusuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        lblusuario = findViewById(R.id.lblNombreUsuario);
        resibirDatos();
    }

    public void resibirDatos(){
        Bundle miBundle = getIntent().getExtras();


        if(miBundle!=null){
            String Resibir = miBundle.getString("usu");

            lblusuario.setText(Resibir);

        }


    }
}