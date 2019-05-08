package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double result_txtA, result_txtB, resultado;
    EditText txtA, txtB;
    TextView txtResult;
    Button btnSuma, btnResta, btnMult, btnDiv, btnExpo, btnPorcien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Widget de entrada de datos
        txtA = (EditText) findViewById(R.id.txtA);
        txtB = (EditText) findViewById(R.id.txtB);

        // Widget de botones para funciones de la calculadora
        btnSuma    = (Button) findViewById(R.id.btnSuma);
        btnResta   = (Button) findViewById(R.id.btnResta);
        btnMult    = (Button) findViewById(R.id.btnMult);
        btnDiv     = (Button) findViewById(R.id.btnDiv);
        btnExpo    = (Button) findViewById(R.id.btnExpo);
        btnPorcien = (Button) findViewById(R.id.btnPorcien);

        // Widget de salida de datos
        txtResult = (TextView) findViewById(R.id.txtResult);

        // Asignacion de funcion a cada boton
        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(""+calcu(1));
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(""+calcu(2));
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(""+calcu(3));
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(""+calcu(4));
            }
        });

        btnExpo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(""+calcu(5));
            }
        });

        btnPorcien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(""+calcu(6));
            }
        });
    }

    public double calcu(int opcion){
        switch (opcion){
            case 1:
                result_txtA = Double.valueOf(txtA.getText().toString());
                result_txtB = Double.valueOf(txtB.getText().toString());
                resultado   = result_txtA + result_txtB;
                return resultado;

            case 2:
                result_txtA = Double.valueOf(txtA.getText().toString());
                result_txtB = Double.valueOf(txtB.getText().toString());
                resultado   = result_txtA - result_txtB;
                return resultado;

            case 3:
                result_txtA = Double.valueOf(txtA.getText().toString());
                result_txtB = Double.valueOf(txtB.getText().toString());
                resultado   = result_txtA * result_txtB;
                return resultado;

            case 4:
                result_txtA = Double.valueOf(txtA.getText().toString());
                result_txtB = Double.valueOf(txtB.getText().toString());
                resultado   = result_txtA / result_txtB;
                return resultado;

            case 5:
                result_txtA = Double.valueOf(txtA.getText().toString());
                result_txtB = Double.valueOf(txtB.getText().toString());
                resultado   = (double) Math.pow(result_txtA, result_txtB); // result_txtA es la base y result_txtB es el exponente de elevacion
                return resultado;

            case 6:
                result_txtA = Double.valueOf(txtA.getText().toString());
                result_txtB = Double.valueOf(txtB.getText().toString());
                resultado   = (result_txtA * result_txtB) / 100; // result_txtA es la cantidad a sacar el porcentage y result_txtB la cantidad de porcentage a calcular
                return resultado;
        }
        return 0;
    }
}
