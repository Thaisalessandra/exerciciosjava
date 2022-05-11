package javarexecicios;

public class mensagem {
    public static void obterMensagem(int hora) {

        switch (hora) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mensagemBomDia();
                break;

        }
        switch (hora) {
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                boaTarde();
                break;

        }
        switch (hora) {
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                boanoite();
                break;

        }

    }

    public static void mensagemBomDia() {
        System.out.println("Bom dia");

    }

    public static void boaTarde() {
        System.out.println("Boa Tarde");

    }

    public static void boanoite() {
        System.out.println("Boa noite");

    }
}
