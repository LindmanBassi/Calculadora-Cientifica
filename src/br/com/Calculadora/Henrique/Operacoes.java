package br.com.Calculadora.Henrique;

import java.util.Arrays;

public class Operacoes {

    public double soma(double ... numeros){
        return Arrays.stream(numeros).sum();
    }

    public double menos(double ...numeros){
        if(numeros.length < 2) {
            throw new IllegalArgumentException("E necessario no minimo 2 numeros");
        }
        return Arrays.stream(numeros).reduce(numeros[0], (a, b) -> a - b);
    }

    public double multiplicacao(double ...numeros){
        return Arrays.stream(numeros).reduce(1, (a, b) -> a * b);
    }

    public double divisao(double ... numeros){
        if(numeros.length < 2) {
            throw new IllegalArgumentException("E necessario no minimo 2 numeros");
        }
        return Arrays.stream(numeros).reduce(numeros[0], (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Divisao por zero");
            }
            return a / b;
        });
    }

    public double seno(double angulo){
        return Math.sin(angulo);
    }

    public double coss(double angulo){
        return Math.cos(angulo);
    }

    public double tang(double angulo){
        return Math.tan(angulo);
    }

    public double raiz(double numero){
        if(numero < 0){
            throw new IllegalArgumentException("Numeros negativos nao possuem raiz");
        }
        return Math.sqrt(numero);
    }

    public double potencia(double base, double potencia){
        return Math.pow(base, potencia);
    }
}
