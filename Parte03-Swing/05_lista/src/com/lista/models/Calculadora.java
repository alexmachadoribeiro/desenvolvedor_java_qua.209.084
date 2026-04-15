package com.lista.models;

import com.lista.repository.ICalculadora;

public class Calculadora implements ICalculadora {
    private double x;
    private double y;

    public Calculadora(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }


    @Override
    public double dividir() {
        return this.x/this.y;
    }

    @Override
    public double multiplicar() {
        return this.x*this.y;
    }

    @Override
    public double somar() {
        return this.x+this.y;
    }

    @Override
    public double subtrair() {
        return this.x-this.y;
    }

}
