package com.example.pm_a10exercicio01.controller;

import androidx.annotation.NonNull;

import com.example.pm_a10exercicio01.model.Circulo;

public class CirculoController implements IGeometria<Circulo>{
    @Override
    public float calculaArea(@NonNull Circulo circulo) {
        return 3.14f * (float)Math.pow((double)circulo.getRaio(),2);
    }

    @Override
    public float calculaPerimetro(@NonNull Circulo circulo) {
        return 2 * 3.14f * circulo.getRaio() ;
    }
}
