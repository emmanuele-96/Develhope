package EsIncapsulamento1;

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto(500, "CA220NE", "Fiat", "500 R");

        System.out.println("la cilindrata è: " + auto1.getCilindrata());
        System.out.println("la targa è: " + auto1.getTarga());
        System.out.println("la marca è: " + auto1.getMarca());
        System.out.println("il modello è: " + auto1.getModello());

        auto1.setTarga("AC010NE");
        auto1.setMarca("bianchina");
        auto1.setModello("trasformabile");

        System.out.println("l'auto aggiornata sara: " + "\n" + "la cilindrata: " + auto1.getCilindrata() + "\n"
                + "la targa: " + auto1.getTarga() + "\n" +
                "la marca: " + auto1.getMarca() + "\n" + "il modello: " + auto1.getModello());
    }
}
