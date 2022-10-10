package br.com.Banco.Testes.Util;

import br.com.Banco.modelo.Conta;
import br.com.Banco.modelo.ContaCorrente;
import br.com.Banco.modelo.ContaEspecial;
import br.com.Banco.modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListaEqualsTeste {

    public static void main(String[]args){

        Conta cC = new ContaCorrente(1,1);
        Conta cP = new ContaPoupanca(1,1);
        Conta cE = new ContaEspecial(1,1);
        ContaCorrente cC2 = new ContaCorrente(1,1);

        cC2.deposita(100);

        if(cC2.getSaldo() == cC.getSaldo()){
            System.out.println("são a mesma conta mesmo pqp");
        }else{
            System.out.println("O alemão ta trolando");
        }


        LinkedList<Conta> lista = new LinkedList<Conta>();

        lista.add(cC);
        lista.add(cP);
        lista.add(cE);

        for(Conta contas : lista){
            System.out.println(contas);
        }

        boolean seraQueExiste = lista.contains(cE);
        System.out.println("O objeto está na lista? " + seraQueExiste);



    }
}
