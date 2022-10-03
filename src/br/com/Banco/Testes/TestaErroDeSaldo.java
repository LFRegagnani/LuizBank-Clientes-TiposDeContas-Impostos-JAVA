package br.com.Banco.Testes;

import br.com.Banco.modelo.Cliente;
import br.com.Banco.modelo.ContaCorrente;

public class TestaErroDeSaldo {

    public static void main(String[]args){

        ContaCorrente cc1 = new ContaCorrente(1,1);
        Cliente luiz = new Cliente("Luiz F R","406432", "Programador",cc1);

        System.out.println(cc1.getTitular().getNome());
        cc1.deposita(100);
        System.out.println(cc1.getSaldo());
        cc1.saca(200);
        cc1.deposita(100.30);
        cc1.saca(500);
        System.out.println(cc1.getLimiteDaConta());
        System.out.println(cc1.getSaldo());
        System.out.println(cc1.getLimiteDaConta());

    }
}
