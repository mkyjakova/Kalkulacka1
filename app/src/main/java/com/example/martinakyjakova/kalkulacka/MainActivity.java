package com.example.martinakyjakova.kalkulacka;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText cislo1;
    private EditText cislo2;
    private Button plus;
    private Button minus;
    private Button krat;
    private Button deleno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cislo1 = (EditText) findViewById(R.id.main_cislo1);
        cislo2 = (EditText) findViewById(R.id.main_cislo2);
        plus = (Button) findViewById(R.id.main_buttonPlus);
        minus = (Button) findViewById(R.id.main_buttonMinus);
        krat = (Button) findViewById(R.id.main_buttonKrat);
        deleno = (Button) findViewById(R.id.main_buttonDeleno);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kliknuPlus(view);
                kliknuMinus(view);
                kliknuKrat(view);
                kliknuDeleno(view);
            }

        });
    }

    private void kliknuPlus(View view){
        int cislo1Cislo = Integer.parseInt (cislo1.getText().toString());
        int cislo2Cislo = Integer.parseInt (cislo2.getText().toString());

        int sucet= cislo1Cislo + cislo2Cislo;
        Toast.makeText(this, "Sucet:" + sucet, Toast.LENGTH_SHORT).show();
    }

    private void kliknuMinus(View view){
        int cislo1Cislo = Integer.parseInt (cislo1.getText().toString());
        int cislo2Cislo = Integer.parseInt (cislo2.getText().toString());

        int rozdiel= cislo1Cislo - cislo2Cislo;
        Toast.makeText(this, "Rozdiel:" + rozdiel, Toast.LENGTH_SHORT).show();
    }

    private void kliknuKrat(View view){
        int cislo1Cislo = Integer.parseInt (cislo1.getText().toString());
        int cislo2Cislo = Integer.parseInt (cislo2.getText().toString());

        int nasobok= cislo1Cislo * cislo2Cislo;
        Toast.makeText(this, "Nasobok:" + nasobok, Toast.LENGTH_SHORT).show();
    }

    private void kliknuDeleno(View view){
        int cislo1Cislo = Integer.parseInt (cislo1.getText().toString());
        int cislo2Cislo = Integer.parseInt (cislo2.getText().toString());

        int podiel= cislo1Cislo - cislo2Cislo;
        Toast.makeText(this, "Podiel:" + podiel, Toast.LENGTH_SHORT).show();
    }


}
