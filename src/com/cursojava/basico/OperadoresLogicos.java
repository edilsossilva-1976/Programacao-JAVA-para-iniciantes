public class OperadoresLogicos {
    public static void main(String[] args) {
        //Operador logico OU (||)
        if (10 == 10 || 10 < 20) {//Se um dos lados for verdadeiro, a sentença é verdadeiro. Se os 2 lados for falso, a sentença é falsa.
            IO.println("Verdadeiro");
        }else{
            IO.println("Falso");
        }

        //Operador logico AND (&&)
        if (10 == 10 && 10 < 20) {//Se um dos lados for falso, a sentença é falsa. Se os 2 lados for verdadeiro, a sentença é verdadeira.
            IO.println("Verdadeiro");
        }else{
            IO.println("Falso");
        }
    }
}
