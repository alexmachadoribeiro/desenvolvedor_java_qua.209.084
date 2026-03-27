package com.atividade05.models;

public class Professor {
    public String nome;
    public String matricula;

    public double areaTriangulo(double b, double h) {
        return (b*h)/2;
    }

    public double areaCirculo(double r) {
        return Math.PI*Math.pow(r,2);
    }

    public double equacao1oGrau(double a, double b) {
        return -b/a;
    }
}
