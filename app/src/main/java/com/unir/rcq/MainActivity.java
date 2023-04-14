package com.unir.rcq;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EditText name = (EditText) findViewById(R.id.name);
        EditText idade = (EditText) findViewById(R.id.idade);
        EditText name = (EditText) findViewById(R.id.cintura);
        EditText name = (EditText) findViewById(R.id.quadril);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_calcular = (Button)findViewById(R.id.btn_calcular);
        btn_calcular.setOnClickListener(new View.OnClickListener(){
        public void onClick (View view) {
            //if ()
            Intent vaiParaResultado = new Intent(MainActivity.this, ResultadoActivity.class);
            startActivity(vaiParaResultado);
        }


        });
        }
}