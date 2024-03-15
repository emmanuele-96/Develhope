import java.util.HashSet;

public class Main {
    public static void main(String[] args) {


        System.out.println("i numeri presenti sono: " + riempiHash());
        for(String numero : riempiHash()) {

        }
        System.out.println(riempiHash().contains("1"));
    }
    public static HashSet<String> riempiHash() {
        HashSet<String> riempiHash = new HashSet<>();
        riempiHash.add("1");
        riempiHash.add("2");
        riempiHash.add("3");
        return  riempiHash;
    }
    }



