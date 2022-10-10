package br.com.Banco.Testes;

import br.com.Banco.modelo.*;

public class TestaNullPe {
    public static void main(String []args){

        Object[] referencias = new Object[5];
        ContaPoupanca cp1 = new ContaPoupanca(11,22);
        ContaPoupanca cp2 = new ContaPoupanca(33,44);
        ContaCorrente cc1 = new ContaCorrente(1,1);
        ContaEspecial ce1 = new ContaEspecial(1,1);
        Cliente luiz = new Cliente("Luiz","123","prog anda adv",cp1);


        referencias[0] = cp1;
        referencias[1] = cp2;
        referencias[2] = cc1;
        referencias [3] = ce1;
        referencias [4] = luiz;


        Conta TesteReferencia =  (Conta) referencias[3];

        System.out.println(TesteReferencia);


    }
}
