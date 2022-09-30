public class MainTeste {
    public static void main(String[] args) {

        ContaCorrente ccTeste = new ContaCorrente(1,1);
        ContaCorrente ccTeste2 = new ContaCorrente(1,2);
        ContaPoupanca cpTeste = new ContaPoupanca(1,1);
        ContaPoupanca cpTeste2 = new ContaPoupanca(1,2);

        ccTeste2.deposita(100);
        ccTeste2.transfere(50,cpTeste);
        System.out.println(ccTeste2.getSaldo());
        System.out.println(cpTeste.getSaldo());



    }
}