package javarexecicios;

public class emprestimo {
    public static double taxaparaDuasParcelas(){
        return 0.3;
    }
    public static double taxaparaTresparcelas(){
        return 1.5;
    }

    public static void calcularEmpretimo(double valor,int parcelas) {
        if(parcelas==2){
          double  valorfinal = valor + (valor*taxaparaDuasParcelas());
            System.out.println("valor para 2 parcelas é: "+valorfinal);
        }
        else if (parcelas==3) {
            double valorfinal=valor+(valor*taxaparaTresparcelas());
            System.out.println("valor para 3 parcelas é: "+valorfinal);

        }
        else{
            System.out.println("Quantidade de parcelas não aceita.");
        }
    }
}
