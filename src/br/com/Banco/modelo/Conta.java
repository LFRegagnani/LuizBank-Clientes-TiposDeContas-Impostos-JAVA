package br.com.Banco.modelo;

public abstract class Conta {
    //dados da conta
    protected double saldo;
    protected int agencia;
    protected int numeroConta;
    protected double limiteDaConta = 100;
    protected double limiteTotal = limiteDaConta;
    protected double total = this.saldo + this.limiteDaConta;
    private Cliente titular;  //referencia a um objeto cliente
    protected static int totalDeContas;


    Conta( int numeroConta,int agencia) {//construtor, existe para definir o padrão da classe quando implementada
        setAgencia(agencia);
        setNumeroConta(numeroConta);
        Conta.totalDeContas++;



    }

//    protected void informa(){
//        System.out.println("A conta número " + this.numeroConta +
//                " da agencia " + this.agencia + " foi criada com sucesso!" +
//                " Agora o total de contas criadas é " + Conta.totalDeContas);
//    }

    //metodo usado para depositar valores em saldo
    public void deposita(double valor) {
        this.saldo += valor;
        this.total = this.saldo + this.limiteDaConta;

        if (this.saldo >= 0) {//faz o limite voltar ao padrão da conta quando o cliente quita o negativo
            this.limiteDaConta = this.limiteTotal;
        }
    }


    public void saca(double valor) {//metodo de sacar valores de saldo ou de limite se n tiver saldo
        //esta sequencia de if faz com que o cliente use o limite se o saldo seja insuficiente

        if (this.total >= valor) {
            if (this.saldo >= valor) {//aqui é quando ele tem saldo suficiente
                this.saldo -= valor;
                this.total = this.saldo + this.limiteDaConta;
            } else {//aqui é quando ele não tem saldo suficiente mas tem limite para cobrir a operação
                this.saldo -= valor;
                this.limiteDaConta += this.saldo;
                this.total = this.limiteDaConta;
            }

        } else {
            try {
                throw new SaldoInsuficiente("Você não pode sacar este valor, sua conta tem R$ " + this.saldo +
                        " e o seu limite atual é R$ " + this.limiteDaConta);
            }catch (Exception insuficiente){
                System.out.println("Deposite algum dinheiro antes de de realizar esta operação");
                insuficiente.printStackTrace();
            }


        }
    }


    public boolean transfere(double valor, Conta destino) { //metodo para transferir valores de uma conta para outra

        if (this.total >= valor) {
            this.saca(valor);
            destino.deposita(valor);

            return true;
        } else {
            System.out.println("Você não pode transferir este valor, sua conta tem R$ " + this.saldo +
                    " e o seu limite atual é R$ " + this.limiteDaConta);
            return false;
        }


    }

    public void cobraTaxa(){//TAXA COBRADA AO SACAR OU TRANSFERIR NA CONTA CORRENTE
        if (getSaldo() >=0.20){
            this.saldo -= 0.20;
            System.out.println("A taxa foi cobrada");
        }


    }

    @Override
    public String toString() {
        return "Conta número " + getNumeroConta() + " Agencia número "+ getAgencia();
    }

    //GETTs e SETTs
    public double getSaldo() { // metodo que mostra o saldo do cliente já que o saldo é privado
        return this.saldo;
    }

    public int getNumeroConta() {//mostra o numero da conta como uma int
        return this.numeroConta;
    }

    public void setNumeroConta(int numero) {//altera o numero da conta sendo o novo numero como argumento
        if (numero <= 0) {
            System.out.println("Esse não é um valor valido");
            return;
        }

        this.numeroConta = numero;
    }


    public int getAgencia() {// mostra o numero da agencia como uma int
        return this.agencia;
    }

    public void setAgencia(int agencia) {//altera o numero da agencia tendo uma int como argumento
        if (agencia <= 0) {
            System.out.println("Esse não é um valor valido");
            return;
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {// mostrar o titular da conta
        return this.titular;
    }

    public void setTitular(Cliente titular) {//alterar o cliente titular da conta
        this.titular = titular;
    }

    public double getLimiteDaConta() {//mostrar o limite da conta
        return this.limiteDaConta;
    }

    public void setLimiteDaConta(double novoLimite) {//alterar o limite atual e o total da conta
        this.limiteDaConta = novoLimite;
        this.total = this.saldo + this.limiteDaConta;
        this.limiteTotal = limiteDaConta;
    }

    public static int getTotalDeContas() {   // metodo para consultar quantas contas existem
        return Conta.totalDeContas;
    }

}

