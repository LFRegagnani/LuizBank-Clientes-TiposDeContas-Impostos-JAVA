package br.com.Banco.modelo;

public class SaldoInsuficiente extends RuntimeException {



    public SaldoInsuficiente(){
        super();
    }


    public SaldoInsuficiente(String alerta){
        super(alerta);
    }

}

