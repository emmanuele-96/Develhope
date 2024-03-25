import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String cercaNumero = "5";

        if(numeri().contains(cercaNumero)) {
            System.out.println("il numero: " + cercaNumero +" è presente");
        } else {
            System.out.println("il numero: " + cercaNumero + " non è presnte");
        }
    }
    public static HashSet<String> numeri() {
        HashSet<String> listaHash = new HashSet<>();
        listaHash.add("1");
        listaHash.add("2");
        listaHash.add("3");
        return  listaHash;
    }
}









