public class TestaImpostos {
    public static void main(String[]args){

        ContaCorrente cc1 = new ContaCorrente(1,1);
        cc1.deposita(100);

        SeguroDeVida seguro = new SeguroDeVida();
        System.out.println(cc1.getSaldo());
        CalculadorDeImposto calc = new CalculadorDeImposto();
        calc.registra(cc1);
        calc.registra(seguro);

        System.out.println(calc.getTotalImposto());

    }
}
