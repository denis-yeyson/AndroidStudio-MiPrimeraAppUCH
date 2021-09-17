package com.denisyeyson.miprimeraappuch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText campo1,campo2,campo3,campo4;
    TextView resultado;
    Button mul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campo1 = findViewById(R.id.txtCampo1);
        campo2 = findViewById(R.id.txtCampo2);
        campo3 = findViewById(R.id.txtCampo3);
        campo4 = findViewById(R.id.txtCampo4);
        resultado = findViewById(R.id.txtResultado);
        mul = findViewById(R.id.btnMultiplicar);

        mul.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                int p1 = Integer.parseInt(campo1.getText().toString());
                int p2 = Integer.parseInt(campo2.getText().toString());
                int p3 = Integer.parseInt(campo3.getText().toString());
                int p4 = Integer.parseInt(campo4.getText().toString());
                int result = p1 * p2 * p3 * p4;

                //Toast.makeText(getBaseContext(),"La suma es: "+ result, Toast.LENGTH_SHORT).show();
                resultado.setText("La Multiplicación es: "+ result);
            }
        });
    }
}