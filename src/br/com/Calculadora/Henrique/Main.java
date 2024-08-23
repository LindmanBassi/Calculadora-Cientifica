package br.com.Calculadora.Henrique;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Operacoes op = new Operacoes();

        while (true) {
            System.out.println("1 = Somar");
            System.out.println("2 = Subtrair");
            System.out.println("3 = Multiplicar ");
            System.out.println("4 = Dividir");
            System.out.println("5 = Cosseno");
            System.out.println("6 = Seno");
            System.out.println("7 = Tangente");
            System.out.println("8 = Raiz");
            System.out.println("9 = Potencia");
            System.out.println("0 = Sair\n");

            int escolha = ler.nextInt();
            if (escolha == 0) {
                break;
            }

            double resultado = 0;
            List<Double> numeros = new ArrayList<>();

            switch (escolha) {
                case 1:
                    System.out.println("Digite os numeros para a soma (digite um valor nao numerico para finalizar):");
                    while (ler.hasNextDouble()) {
                        numeros.add(ler.nextDouble());
                    }
                    ler.next();
                    resultado = op.soma(numeros.stream().mapToDouble(Double::doubleValue).toArray());
                    break;
                case 2:
                    System.out.println("Digite os numeros para a subtracao (digite um valor nao numerico para finalizar):");
                    while (ler.hasNextDouble()) {
                        numeros.add(ler.nextDouble());
                    }
                    ler.next();
                    resultado = op.menos(numeros.stream().mapToDouble(Double::doubleValue).toArray());
                    break;
                case 3:
                    System.out.println("Digite os numeros para a multiplicacao (digite um valor nao numerico para finalizar):");
                    while (ler.hasNextDouble()) {
                        numeros.add(ler.nextDouble());
                    }
                    ler.next();
                    resultado = op.multiplicacao(numeros.stream().mapToDouble(Double::doubleValue).toArray());
                    break;
                case 4:
                    System.out.println("Digite os numeros para a divisao (digite um valor nao numerico para finalizar):");
                    while (ler.hasNextDouble()) {
                        numeros.add(ler.nextDouble());
                    }
                    ler.next();
                    try {
                        resultado = op.divisao(numeros.stream().mapToDouble(Double::doubleValue).toArray());
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Digite o numero para ver seu cosseno");
                    double cosseno = ler.nextDouble();
                    resultado = op.coss(cosseno);
                    break;
                case 6:
                    System.out.println("Digite o numero para ver seu senno");
                    double senno = ler.nextDouble();
                    resultado = op.seno(senno);
                    break;
                case 7:
                    System.out.println("Digite o numero para ver sua tangente");
                    double tangente = ler.nextDouble();
                    resultado = op.tang(tangente);
                    break;
                case 8:
                    System.out.println("Digite o numero para ver sua raiz");
                    double raiz = ler.nextDouble();
                    resultado = op.raiz(raiz);
                case 9:
                    System.out.println("Digite a base");
                    double base = ler.nextDouble();
                    System.out.println("Digite a potencia");
                    double potencia = ler.nextDouble();
                    resultado = op.potencia(base, potencia);
                    break;
            }
            System.out.println("O resultado e: " + resultado);
        }
    }
}