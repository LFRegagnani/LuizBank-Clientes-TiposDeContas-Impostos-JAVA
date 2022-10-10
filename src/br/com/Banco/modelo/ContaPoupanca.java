package br.com.Banco.modelo;

public class ContaPoupanca extends Conta {

/** Conta não tributavel e sem taxa para saque*/

    public ContaPoupanca( int numeroConta,int agencia){
        super(numeroConta, agencia);
        setLimiteDaConta(0);//CONTA POUPANÇA NÃO COMEÇA COM LIMITE
    }

//    protected void informa(){//METODO ESPECIFICO PARA POUPANÇA
//        System.out.println("A conta poupança número " + this.numeroConta +
//                " da agencia " + this.agencia + " foi criada com sucesso!" +
//                " Agora o total de contas criadas é " + Conta.totalDeContas);
//    }

    @Override
    public String toString() {
        return "Conta Poupança número " + getNumeroConta() + " Agencia número "+ getAgencia();
    }

    @Override
    public int compareTo(Conta outra) {
        return (int) (this.getSaldo() - outra.getSaldo());

    }
}
