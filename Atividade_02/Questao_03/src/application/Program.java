package application;

import entities.Calculadora;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Calculadora calc = new Calculadora();

        int operacao = 0;

        while (operacao != 5){
            System.out.println("[1]soma, [2]subtração, [3]multiplicação, [4]divisão, [5]Quit");
            operacao = sc.nextInt();
            switch (operacao){
                case 1:
                    System.out.println("num1: ");
                    calc.num1 = sc.nextInt();
                    System.out.println("num2: ");
                    calc.num2 = sc.nextInt();
                    calc.somaNum();
                    System.out.println(calc.somaNum());
                    break;
                case 2:
                    System.out.println("num1: ");
                    calc.num1 = sc.nextInt();
                    System.out.println("num2: ");
                    calc.num2 = sc.nextInt();
                    calc.subtrairNum();
                    System.out.println(calc.subtrairNum());
                    break;
                case 3:
                    System.out.println("num1: ");
                    calc.num1 = sc.nextInt();
                    System.out.println("num2: ");
                    calc.num2 = sc.nextInt();
                    calc.multiplicarNum();
                    System.out.println(calc.multiplicarNum());
                    break;
                case 4:
                    System.out.println("num1: ");
                    calc.num1 = sc.nextInt();
                    System.out.println("num2: ");
                    calc.num2 = sc.nextInt();
                    calc.divisaoNum();
                    System.out.println(calc.divisaoNum());
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Valor inválido!");
                    break;
            }
        }

        sc.close();
    }
}
