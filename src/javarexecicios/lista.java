package javarexecicios;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;

public class lista {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();
        System.out.println("Crie uma lista de N notas:");
        notas.add(16d);
        notas.add(1d);
        notas.add(6.0); /*quando for double é só usar d ao final do numero ou usar 6.0 por exemplo*/
        notas.add(26d);
        System.out.println(notas);
       /* System.out.println(notas.toString()); Essa é uma outra maneira de imprimir uma lista */
        System.out.println("2- Imprima a nota da posição 3: "+notas.indexOf(16d));
        /*ESSE METODO VARIAVEL.INDEXOF(6D) MOSTRA COMO SBER A POSIÇÃO DE UM ELEMENTO NA LISTA*/
        System.out.println("3-Adicione um elemento na lista na posição 2:");
        notas.add(2,4.0);
        notas.add(5,45d);
        /*notas.add(2,4.0); neste caso adicionamos e indicamos a posição onde o elemento ficara na lista*/
        System.out.println(notas);
        /*notas.add(1,5d); É A FORMA DE ADICIONAR UM ELEMENTO A UMA LISTA INDICANDO POSIÇÃO E "VALOR"*/
        System.out.println("4- Substitua um elemento da lista por exemplo a posição 0:");
        notas.set(notas.indexOf(16d),36d );
        /*notas.set(notas.indexOf(16d),36d ); Substitui um alemento sabendo a posição deste e o valor que vai substituir*/
        System.out.println(notas);

        System.out.println("5- Confira se a nota 1.0 está na lista: "+notas.contains(1d));
        /*notas.contains(1d); Mostra se contem o elemento indicado na lista*/
        System.out.println("6- Exiba todas as notas da lista:" );
        for (double nota:notas) System.out.println(nota); /*Foi usado o foreach*/
    }

}
