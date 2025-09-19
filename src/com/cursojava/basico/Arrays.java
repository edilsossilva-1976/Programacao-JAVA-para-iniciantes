public class Arrays {
    public static void main(String[] args) {
        //Arrays são estruturas criadas para criar listas.
        String[] lista = {"Pedro", "Maria", "João"}; // Uma das maneiras de inicializar a lista
        IO.println(lista[2]);

        String[] lista2 = new String[3];// outra maneira de inicializar a lista
        lista2[0] = "Pedro1";
        lista2[1] =  "Maria2";
        lista2[2] = "Joao2";

        IO.println(lista2[2]);
    }
}
