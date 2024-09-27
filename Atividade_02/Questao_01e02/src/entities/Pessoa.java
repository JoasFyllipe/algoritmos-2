package entities;

import java.io.StringBufferInputStream;

public class Pessoa {
    public String nome;
    public int idade;

    public String cumprimentar(){
        return  "Olá "
            + this.nome;
    }
}
