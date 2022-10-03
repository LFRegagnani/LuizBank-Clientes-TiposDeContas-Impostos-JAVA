package br.com.Banco.Testes;

import br.com.Banco.modelo.*;

public class TesteString {

    public static void main(String []args){

        String nome = "ALURA";

        String nomeMinusculo = nome.toLowerCase();

        System.out.println(nomeMinusculo.contentEquals(nome));



        for(int i = 0; i<nomeMinusculo.length(); i++){
            System.out.println(nomeMinusculo.charAt(i));

        }

        System.out.println(nome.indexOf('U'));

        System.out.println(nome.substring(4));


        Conta cC = new ContaCorrente(1,1);
        Object cP = new ContaPoupanca(1,1);
        Object cE = new ContaEspecial(1,1);

       System.out.println(cC);

       Object luiz = new Cliente("Luiz Fernando Regagnani", "4064","Advogado e Programador",cC);

       System.out.println(cC.getTitular());





    }
}
