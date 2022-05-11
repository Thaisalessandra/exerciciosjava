package javarexecicios;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class main {

    public static void main(String[] args) {
        /*    calculadora*/

        System.out.println("Calculadora");
        calculadora.soma(3,2);
        calculadora.subtracao(5,6);
        calculadora.mult(2,3);
        calculadora.divisao(10,2);

             /*  Mensagem*/

        System.out.println("Mensagem hora do dia: ");
        mensagem.obterMensagem(3);
        mensagem.obterMensagem(22);
        mensagem.obterMensagem(15);
                /*EMPRESTIMO*/

        System.out.println("Emprestimo");
        emprestimo.calcularEmpretimo(250,3);
        emprestimo.calcularEmpretimo(250,2);
        emprestimo.calcularEmpretimo(250,1);

    }
    }
