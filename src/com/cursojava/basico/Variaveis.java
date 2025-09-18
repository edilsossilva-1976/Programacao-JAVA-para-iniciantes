import java.util.Locale;

public class Variaveis {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        //char para caracteres
        char letra = 'a';
        System.out.printf("Letra: %c%n", letra);

        //String para textos
        String nome = "Edilson Alves";
        System.out.printf("Nome: %s%n", nome);

        //byte para numeros inteiros (-128 a 127)
        byte idade = 90;
        System.out.printf("Idade: %d%n", idade);

        //int para numeros inteiros (-2147483648 a 2147483647)
        int numero = 90;
        System.out.printf("HD com: %d GB%n", numero);

        //long para numeros inteiros longos (-9223372036854775808 a 9223372036854775807)
        long numeroLongo = 9000000000l;
        System.out.printf("Numero longo: %d%n", numeroLongo);

        //float para numeros decimais (1.1234567 ate 7 casas decimais)
        float decimal = 9.5f;
        System.out.printf("Decimal float: %.7f%n", decimal);

        //double para numeros decimais (1.123456789000000 até 15 casas decimais)
        double numeroDouble = 9.5;
        System.out.printf("Decimal Double: %.15f%n", numeroDouble);

        //boolean para valores booleanos (true ou false)
        boolean status = false;
        System.out.printf("Status: %b%n", status);


    }
}
