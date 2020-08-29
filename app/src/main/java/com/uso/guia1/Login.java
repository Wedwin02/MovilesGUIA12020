package com.uso.guia1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    TextView pass,usuario;

    public String u;
    public String p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usuario = findViewById(R.id.txbUsu);
        pass = findViewById(R.id.txbPass);

    }

    public void Enviar_onClick(View v){
        u = usuario.getText().toString();
        p = pass.getText().toString();
        validar(u,p);
    }

    public void validar(String usu,String passw){
        String UsuarioQuemado = "Admin";
        String PassQuemada = "12345";


        if(usu.equals(UsuarioQuemado) && passw.equals(PassQuemada)) {
            Toast.makeText(this,"Bienvenido.",Toast.LENGTH_SHORT).show();
            Intent frm = new Intent(this, Inicio.class);
            Bundle mibundle = new Bundle();
            mibundle.putString("usu",UsuarioQuemado);
            frm.putExtras(mibundle);
            startActivity(frm);
        }else{
            Toast.makeText(this,"Usuario o Contraseña equivocada.",Toast.LENGTH_SHORT).show();
        }



    }
}