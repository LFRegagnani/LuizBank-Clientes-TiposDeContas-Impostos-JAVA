package br.com.Banco.modelo;

public class ContaEspecial extends Conta implements Tributavel{



    /** Conta tributavel mas que não tem taxa para saque */



    public ContaEspecial( int numeroConta,int agencia) {
        super(agencia, numeroConta);

    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.1;
    }

    @Override
    public void deposita(double valor) {
        super.deposita(valor);
    }

    @Override
    public String toString() {
        return "Conta Especial número " + getNumeroConta() + " Agencia número "+ getAgencia();
    }
}
