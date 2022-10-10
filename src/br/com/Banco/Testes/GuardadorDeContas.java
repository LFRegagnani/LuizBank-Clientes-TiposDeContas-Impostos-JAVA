package br.com.Banco.Testes;

import br.com.Banco.modelo.Conta;

public class GuardadorDeContas {

    private final Object[] objetos;
    private int contasGuardadas;

    //Construtor que exige que ao criar a array seja declarado o numero de espaços maximo
   public GuardadorDeContas(int Totalespacos){
       this.objetos = new Conta[Totalespacos];

   }


   //GETs e SETs
    public void setObjetos(Conta conta) {//guarda um objeto conta em um dos espaços vazios da array e aumenta a contagem
        this.objetos[contasGuardadas] = conta;
        contasGuardadas++;
    }
    public Object getContas(int conta) {//só mostra a referencia de conta que esta guardada em um determinado espaço
        return this.objetos[conta];
    }
    public int getContasGuardadas() {//mostra quantos espaços ja foram preenchidos na array
        return contasGuardadas;
    }

    public void setContasGuardadas(int contasGuardadas) {//muda o proximo espaço a ser preenchido na array
        this.contasGuardadas = contasGuardadas;
    }
}
