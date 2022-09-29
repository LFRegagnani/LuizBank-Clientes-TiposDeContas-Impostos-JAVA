public class ContaPoupanca extends Conta {



    ContaPoupanca(int agencia,int numeroConta){
        super(agencia,numeroConta);
        setLimiteDaConta(0);//CONTA POUPANÇA NÃO COMEÇA COM LIMITE
    }

    protected void informa(){//METODO ESPECIFICO PARA POUPANÇA
        System.out.println("A conta poupança número " + this.numeroConta +
                " da agencia " + this.agencia + " foi criada com sucesso!" +
                " Agora o total de contas criadas é " + Conta.totalDeContas);
    }

}
