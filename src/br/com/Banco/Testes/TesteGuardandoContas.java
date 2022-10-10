package br.com.Banco.Testes;

import br.com.Banco.modelo.Conta;
import br.com.Banco.modelo.ContaCorrente;

public class TesteGuardandoContas {
    public static void main (String[] args){

        Conta cc1 = new ContaCorrente(1,1);
        Conta cc2 = new ContaCorrente(2,1);
        Conta cc3 = new ContaCorrente(3,1);
        GuardadorDeContas array = new GuardadorDeContas(3);

        array.setObjetos(cc1);
        System.out.println(array.getContasGuardadas());
        array.setObjetos(cc2);
        array.setObjetos(cc3);
        System.out.println(array.getContasGuardadas());
    System.out.println(array.getContas(2));




    }
}
