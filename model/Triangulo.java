package br.com.fecaf.model;

import java.util.Scanner;

public class Triangulo {

    public double base, lado2, lado3, area, perimetro, altura, calculo345;

    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarTriangulo() {
        System.out.println("/************************/");
        System.out.println("/*   Cadastro Triângulo */");
        System.out.println("/************************/");
        System.out.print("/* Informe o Base:     */");
        base = scanner.nextDouble();
        System.out.print("/* Informe o lado 2:     */");
        lado2 = scanner.nextDouble();
        System.out.print("/* Informe o lado 3:   */");
        lado3 = scanner.nextDouble();
        System.out.print("Informe a Altura: ");
        altura = scanner.nextDouble();
        System.out.println("/* Triângulo Cadastrado com Sucesso !");
        System.out.println("/***********************************/");

        return true;
    }

    public void calcularArea () {
        System.out.println("/*********************************/");
        System.out.println("/*        Calculando Area        */");
        System.out.println("/*********************************/");

        area = (base * altura) / 2 ;
        System.out.println("A área é: " + area);
        System.out.println("/*********************************/");
    }

    public void calcularPerimetro () {
        System.out.println("/*********************************/");
        System.out.println("/*      Calculando Perimetro     */");
        System.out.println("/*********************************/");

        perimetro = base + lado2 + lado3;
        System.out.println("O perimetro é: " + perimetro);
        System.out.println("/*********************************/");
    }

    // Isosceles / Escaleno / Equilatero
    public void definirTipo () {
        System.out.println("/*********************************/");
        System.out.println("/*        Definindo Tipo         */");
        System.out.println("/*********************************/");

        if (base == lado2 && base == lado3) {

            System.out.println("Este Triângulo é Equilátero ...");

        } else if (base != lado2 && base != lado3 && lado2 != lado3) {

            System.out.println("Este Triângulo é Escaleno ...");

        } else {
            System.out.println("Este Triângulo é Isosceles ...");
        }
        System.out.println("/***************************************/");

    }

        //Verificar o maior lado
    public double maiorlado (double numero1, double numero2) {
        if (numero1 > numero2) {
            return numero1;
        } else {
            return numero2;
        }
        }//Conferindo o 2° maior
    public double meio (double numero1, double numero2, double numero3) {
        if ((numero1 > numero2 && numero1 < numero3)||(numero1 > numero3 && numero1 < numero2)) {
            return numero1;
        } else if ((numero2> numero1 && numero2< numero3) || (numero2> numero3 && numero2< numero1)) {
            return numero2;
        } else {
            return numero3;
        }
    }// Calculando o menor lado
    public double menorlado (double numero1, double numero2) {
        if (numero1 < numero2) {
            return numero1;
        } else {
            return numero2;
        }
    }

    // Conferir se é um triangulo 3, 4 e 5.
    public void triangulo345 () {
        System.out.println("/*********************************/");
        System.out.println("/*     É um triangulo 3,4,5 ?    */");
        System.out.println("/*********************************/");
        double hipotenusa, primeirocateto, segundocateto;
        hipotenusa = maiorlado (base, maiorlado(lado2, lado3)); //Verifica qual o maior
        primeirocateto = menorlado (base, menorlado(lado2, lado3));  // Verifica qual o menor
        segundocateto = meio (base,lado2, lado3); // Verifica o meio

    // Validando se é um triangulo 3,4 e 5... Verificando é divisivel por 3, 4 ou 5 e validando a soma dos catetos ao quadrado
        boolean calculo345 = (primeirocateto*primeirocateto)+(segundocateto*segundocateto) == (hipotenusa*hipotenusa);
        if (calculo345 == true && primeirocateto%3 == 0 && segundocateto%4 == 0) {
            System.out.println("É um triângulo 3, 4 e 5.");
        } else {
            System.out.println("Não é um triânulo 3, 4 e 5.");
        }
        System.out.println("/*********************************/");

    }
}

