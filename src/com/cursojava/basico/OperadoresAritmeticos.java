public class OperadoresAritmeticos {
    public static void main(String[] args) {
        
        int valor1 = 120;
        int valor2 = 30;

        //Operador de soma (+)
        int soma = valor1 + valor2;
        IO.println("Soma: " + soma);

        //Operador de subtração (-)
        int subtrai = valor1 - valor2;
        IO.println("Subtração: " + subtrai);

        //Operador de multiplicação (*)
        int multiplica = valor1 * valor2;
        IO.println("Produto: " + multiplica);

        //Operador de divisão (/)
        int divisao = valor1 / valor2;
        IO.println("Divisão: " + divisao);

        //Operador de modulo [resto da divisao] (%)
        int modulo = (valor1 % valor2);
        IO.println("Módulo: " + modulo);
    }

}
