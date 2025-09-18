public class Constantes {
    public static void main(String[] args) {
        //Para criar uma constante, basta incluir na frente da declaração da variavel, a palavra final;
        final int numero = 0;
        final String nomeBanco = "DB_FORNECEDORES";

        IO.println(numero);

        //Variavel não recebe atualização de valor, exemplo: numero = 1;
        IO.println("Banco de Dados: " + nomeBanco);

    }
}
