public class EstruturaCondicional_Switch {
    public static void main(String[] args) {
        int opcoes = 3;

        switch(opcoes){
            case 1: 
                IO.println("Abra a sua conta.");
                break;
            case 2: 
                IO.println("Fatura do Cartão.");
                break;
            case 3: 
                IO.println("Crédito imobiliário.");
                break;
            default: 
                IO.println("Escolha alguma opção válida.");
                break;
        }

        int outraOpcao = 2;

        switch (outraOpcao) {
            case 1 -> IO.println("Abra a sua conta.");
            case 2 -> IO.println("Fatura de Cartão.");
            case 3 -> IO.println("Crédito imobiliário.");
            default -> IO.println("Escolha alguma opção inválida.");
        }
    }
}
