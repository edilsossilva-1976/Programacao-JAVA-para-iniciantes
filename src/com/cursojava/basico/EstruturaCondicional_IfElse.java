public class EstruturaCondicional_IfElse {
    public static void main(String[] args) {
        
        byte idade = 15;

        if (idade <= 10) {
            //Executa-se aqui o trecho de codigo, caso o retorno booleano seja verdadeiro
            IO.println("Criança");
        }else if(idade <= 17){
             IO.println("Adolescente");
        }else{
            //Executa-se aqui o trecho de codigo, caso o retorno booleano seja falso
            IO.println("Adulto");
        }
    }
}
