package application;

import entities.Aluno;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Nota1: ");
        aluno.nota1 = sc.nextInt();
        System.out.print("Nota2: ");
        aluno.nota2 = sc.nextInt();

        aluno.mediaNota();
        System.out.println(aluno.situacaoAluno());
    }
}
