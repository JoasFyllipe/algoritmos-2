package application;

import entities.Pessoa;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        pessoa.nome = sc.nextLine();
        pessoa.idade = sc.nextInt();

        System.out.println(pessoa.cumprimentar());
        System.out.println("Nome: "+ pessoa.nome+", "+"Idade: "+pessoa.idade+ " anos");

        sc.close();
    }
}
