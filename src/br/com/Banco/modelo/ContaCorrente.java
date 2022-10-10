package br.com.Banco.modelo;

public class ContaCorrente extends Conta implements Tributavel{




    public ContaCorrente( int numeroConta,int agencia) {
        super(numeroConta, agencia);

    }

    /** Conta tributavel e que cobra taxa para saque*
     * @author Luiz_
     */


    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }


//    protected void informa(){//METODO ESPECIFICO PARA CONTA CORRENTE
//        System.out.println("A conta corrente número " + this.numeroConta +
//                " da agencia " + this.agencia + " foi criada com sucesso!" +
//                " Agora o total de contas criadas é " + Conta.totalDeContas);
//    }


    @Override
    public void deposita(double valor) {
        super.deposita(valor);

    }

    @Override
    public void saca(double valor) {
        cobraTaxa();
        super.saca(valor);

    }

    @Override
    public String toString() {
        return  "Conta Corrente número " + getNumeroConta() + " Agencia número "+ getAgencia();
    }

    @Override
    public int compareTo(Conta outra) {
        return (int) (this.getSaldo() - outra.getSaldo());

    }

}
