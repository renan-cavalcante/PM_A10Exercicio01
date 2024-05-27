package com.example.pm_a10exercicio01.model;

public class Retangulo {
    private float base;
    private float altura;

    public Retangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }
    public float getBase() {
        return base;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void setBase(float base) {
        this.base = base;
    }
}
