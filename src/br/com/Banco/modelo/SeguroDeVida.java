package br.com.Banco.modelo;

public class SeguroDeVida implements Tributavel{
    @Override
    public double getValorImposto() {
        return 42;
    }
}
