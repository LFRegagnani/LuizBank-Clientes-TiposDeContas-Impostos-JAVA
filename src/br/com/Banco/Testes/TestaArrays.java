package br.com.Banco.Testes;

import br.com.Banco.modelo.ContaCorrente;

public class TestaArrays {
    public static void main(String[]args){

        ContaCorrente contas [] = new ContaCorrente[5];
        ContaCorrente cc = new ContaCorrente(2,2);

        contas[0] = cc;

        System.out.println(contas[0]);




    }
}
