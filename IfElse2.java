public class IfElse2 {
  public static void main(String[] args) {

    String testo = "ciao";

    System.out.println(testo.length());

    if (testo.length() > 10) {
      System.out.println("la lunchezza del testo è maggiore di 10");
    } else if (testo.length() < 10) {
      System.out.println("la lunghezza del testo è minore di 10");
    } else {
      System.out.println("la lunghezza del testo è pari a 10");
    }
  }
}
