package br.com.Banco.Testes.Util;

import br.com.Banco.modelo.Conta;
import br.com.Banco.modelo.ContaCorrente;
import br.com.Banco.modelo.ContaEspecial;
import br.com.Banco.modelo.ContaPoupanca;

import java.util.ArrayList;

public class Teste {

    public static void main(String []args){

        ArrayList<Conta> lista = new ArrayList<Conta>();


        Conta cC = new ContaCorrente(1,1);
        Conta cP = new ContaPoupanca(1,1);
        Conta cE = new ContaEspecial(1,1);

        lista.add(cC);
        lista.add(cP);
        lista.add(cE);


        System.out.println(lista.get(2));
        System.out.println(lista.size());
        lista.remove(0);
        System.out.println(lista.size());
        System.out.println(lista.get(1));
        lista.add(cC);
        System.out.println(lista.size());

        System.out.println("____________________________________");//ESTE CODIGO È O MESMO DO DE BAIXO


        for(int i=0; i<lista.size();i++){
            Conta contas = lista.get(i);
            System.out.println(contas);
        }

        System.out.println("____________________________________");//ESTE CODIGO É O MESMO DO DE CIMA

        for(Conta contas : lista){
            System.out.println(contas);
        }



    }
}
