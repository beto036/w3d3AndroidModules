package com.example.admin.w3d3androidmodules;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.operaciones.Operaciones;
import com.example.operdores.Operadores;

public class MainActivity extends AppCompatActivity {

    private Operadores operadores;
    private Operaciones operaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Operaciones operaciones = new Operaciones();
        Operadores operadores = new Operadores(6,2);

        try {
            System.out.println(operaciones.sum(operadores));
            System.out.println(operaciones.sub(operadores));
            System.out.println(operaciones.div(operadores));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
