public class ContaCorrente extends Conta implements Tributavel{




    ContaCorrente(int agencia, int numeroConta) {
        super(agencia, numeroConta);

    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }


    protected void informa(){//METODO ESPECIFICO PARA CONTA CORRENTE
        System.out.println("A conta corrente número " + this.numeroConta +
                " da agencia " + this.agencia + " foi criada com sucesso!" +
                " Agora o total de contas criadas é " + Conta.totalDeContas);
    }


    @Override
    public void deposita(double valor) {
        super.deposita(valor);

    }

    @Override
    public boolean saca(double valor) {
        cobraTaxa();
        return super.saca(valor);

    }


}
