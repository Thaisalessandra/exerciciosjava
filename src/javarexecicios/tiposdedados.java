package javarexecicios;

public class tiposdedados {
    public static void main(String[] args) {
        byte b1 = 19;
        byte b2 = 20;
        short s1 = 10000;
//        short s2=4000000000; o short tem uma quantidade maxima de bytes a ser utilizado
        int l1 = -100000000;
//        int l2= -100000000000000000; int também possui uma quantidade máxima de bytes
        long i2 = 15646546546465465l;
//        long i1=1584654646468641674L; na variavel long é necessario colocar o l no final do valor
        float f1 = 4.5f;
//        float f2=155.22; Float precisa que declare o f de float apos declarar o valor da variavel
        double d1 = 4.55;
        double d2 = 4.66d; /*a variavel Double não é necessario declarar o D ao final do valor da variavel ela funciona da mesma forma*/
        char c1 = 'c';
        char c2 = 'j';
        /*Char armazena dados do tipo caractere recebe somente um caractere*/
        String str1 = "Eu sou uma String";
        String str2 = "string 2";

        /*String é o cadeia de caracteres*/
        boolean boo1=false;
        boolean boo2=true;

        System.out.println(b1);
        System.out.println(l1);
        System.out.println(str1);
    }
}
