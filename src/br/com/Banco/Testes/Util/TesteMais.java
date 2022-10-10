package br.com.Banco.Testes.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class TesteMais {

    public static void main (String[] args){

        Vector<Integer> lista = new Vector<Integer>(10);

        Integer numeroAleatorio = new Integer(10);

       lista.add(numeroAleatorio);


       Boolean verdadeiroOuFalso = Boolean.valueOf(false);



       System.out.println(verdadeiroOuFalso);


       List<Number> listaVetorialNumerica = new Vector<>(10);

       listaVetorialNumerica.add(1);
       listaVetorialNumerica.add(5);
       listaVetorialNumerica.add(20.3);

       System.out.println(listaVetorialNumerica.get(2));



    }
}
