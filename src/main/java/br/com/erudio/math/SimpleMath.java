package br.com.erudio.math;

public class SimpleMath {

    // soma
    public Double soma(Double numberOne, Double numberTwo) {
        return numberOne + numberTwo;
    }

    //subtracao
    public Double subtracao(Double numberOne, Double numberTwo) {
        return numberOne - numberTwo;
    }

    //multiplicacao
    public Double multiplicao(Double numberOne, Double numberTwo) {
        return numberOne * numberTwo;
    }

    //divisao
    public Double divisao(Double numberOne, Double numberTwo) {
        return numberOne / numberTwo;
    }

    //media
    public Double media(Double numberOne, Double numberTwo) {
        return (numberOne + numberTwo) / 2;
    }

    //raizquadrada
    public Double raizquadrada(Double numberOne) {
        return Math.sqrt(numberOne);
    }

}
