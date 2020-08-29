package com.uso.guia1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Calculadora extends AppCompatActivity implements View.OnClickListener {

    Button btnAC,btnDEL,btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btndiv,btnpor,btnsuma,btnresta,btnigual;
    TextView lblVista, lblResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        lblVista = findViewById(R.id.lblVista);
        lblResultado = findViewById(R.id.lblResultado);
        btnAC = findViewById(R.id.btnAC);
        btnDEL = findViewById(R.id.btnDEL);
        btn0 = findViewById(R.id.btnCero);
        btn1 = findViewById(R.id.btnUno);
        btn2 = findViewById(R.id.btnDos);
        btn3 = findViewById(R.id.btnTres);
        btn4 = findViewById(R.id.btnCuatro);
        btn5 = findViewById(R.id.btnCinco);
        btn6 = findViewById(R.id.btnSeis);
        btn7 = findViewById(R.id.btnSiete);
        btn8 = findViewById(R.id.btnOcho);
        btn9 = findViewById(R.id.btnNueve);
        btndiv = findViewById(R.id.btnDiv);
        btnpor = findViewById(R.id.btnMulti);
        btnsuma = findViewById(R.id.btnSuma);
        btnresta = findViewById(R.id.btnResta);
        btnigual = findViewById(R.id.btnIgual);

        btnAC.setOnClickListener(this);
        btnDEL.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);;
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        btnpor.setOnClickListener(this);
        btnsuma.setOnClickListener(this);
        btnresta.setOnClickListener(this);
        btnigual.setOnClickListener(this);





    }

    @Override
    public void onClick(View view) {
        StringBuilder Seleccion = new StringBuilder();
        Seleccion.append(lblVista.getText().toString());


        switch (view.getId()){

            case R.id.btnAC:
                Seleccion.delete(0,Seleccion.length());
                break;
            case R.id.btnDEL:
                if(Seleccion.length() > 0){
                    Seleccion.deleteCharAt(Seleccion.length() -1);
                }
                break;
            case R.id.btnCero:
                Seleccion.append(0);
                break;
            case R.id.btnUno:
                Seleccion.append(1);
                break;
            case R.id.btnDos:
                Seleccion.append(2);
                break;
            case R.id.btnTres:
                Seleccion.append(3);
                break;
            case R.id.btnCuatro:
                Seleccion.append(4);
                break;
            case R.id.btnCinco:
                Seleccion.append(5);
                break;
            case R.id.btnSeis:
                Seleccion.append(6);
                break;
            case R.id.btnSiete:
                Seleccion.append(7);
                break;
            case R.id.btnOcho:
                Seleccion.append(8);
                break;
            case R.id.btnNueve:
                Seleccion.append(9);
                break;
            case R.id.btnDiv:
                Seleccion.append("/");
                break;
            case R.id.btnMulti:
                Seleccion.append("*");
                break;
            case R.id.btnSuma:
                Seleccion.append("+");
                break;
            case R.id.btnResta:
                Seleccion.append("-");
                break;
            case R.id.btnIgual:
                Expression n =  new ExpressionBuilder(Seleccion.toString()).build();
                lblResultado.setText(String.valueOf(n.evaluate()));
                break;
        }
        lblVista.setText(Seleccion.toString());

    }
}