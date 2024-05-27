package com.example.pm_a10exercicio01.controller;

import androidx.annotation.NonNull;

import com.example.pm_a10exercicio01.model.Retangulo;

public class RetanguloController implements IGeometria<Retangulo>{

    @Override
    public float calculaArea(@NonNull Retangulo retangulo) {
       return retangulo.getBase() * retangulo.getAltura();
    }

    @Override
    public float calculaPerimetro(@NonNull Retangulo retangulo) {
        return (retangulo.getAltura()*2)+(retangulo.getBase()*2);
    }
}
