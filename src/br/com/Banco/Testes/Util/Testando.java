package br.com.Banco.Testes.Util;

import br.com.Banco.modelo.Conta;
import br.com.Banco.modelo.ContaCorrente;
import br.com.Banco.modelo.ContaEspecial;
import br.com.Banco.modelo.ContaPoupanca;

import java.util.*;

public class Testando {
    public static void main(String []args){

    Conta cc1 = new ContaCorrente(3,1);
    cc1.deposita(333);
    Conta cp1 = new ContaPoupanca(4,1);
    cp1.deposita(444);
    Conta cc2 = new ContaCorrente(5,1);
    cc2.deposita(111);
    Conta cp2 = new ContaPoupanca(1,1);
    cp2.deposita(222);
    Conta ce1 = new ContaEspecial(2,1);
    ce1.deposita(999);

    List<Conta> contas = new ArrayList<Conta>();
        contas.add(cc1);
        contas.add(cp1);
        contas.add(cc2);
        contas.add(cp2);
        contas.add(ce1);

        for (Conta conta : contas) {
            System.out.println(conta);
        }



        ComparaNumeroDaConta comparando = new ComparaNumeroDaConta();
        Collections.sort(contas);
        Collections.reverse(contas);

    System.out.println("____________________");

        for (Conta conta : contas) {
            System.out.println(conta);
        }

    }
}


class  ComparaNumeroDaConta implements Comparator<Conta>{

    @Override
    public int compare(Conta c1, Conta c2) {
        if(c1.getNumeroConta() < c2.getNumeroConta()){
            return -1;
        }
        if(c1.getNumeroConta() > c2.getNumeroConta()){
            return 1;
        }
        return 0;
    }
}
