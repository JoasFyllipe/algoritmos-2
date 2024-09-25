package entities;

public class Aluno {
    public String nome;
    public int nota1;
    public int nota2;

    public double mediaNota(){
        return (nota1+nota2)/2.0;
    }

    public String situacaoAluno() {
        double media = mediaNota();
        if (mediaNota() >= 7.0) {
            return "Aprovado, média: " + media;

        } else {
            return "Reprovado, média: " + media;
        }
    }
}