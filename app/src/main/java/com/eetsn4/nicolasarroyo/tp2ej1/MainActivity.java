package com.eetsn4.nicolasarroyo.tp2ej1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Mensaje(View view){
        Toast toast=Toast.makeText(this,"Hola,esto es un mensaje",Toast.LENGTH_SHORT);
        toast.show();
    }

}
