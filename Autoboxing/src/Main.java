public class Main {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        somma(numero1,numero2);

        char char1 = 'a';
        stampaChar(char1);

        Integer numero3 = 30;
        Integer numero4 = 40;
        stampaIntergerESomma(numero3, numero4);

        Character character1 = 'b';
        stampaCharacter(character1);

        int primitivo1 = 50;
        primitivo1 = Integer.valueOf(50);
        System.out.println(primitivo1);

        double primitivo2 = 60;
        primitivo2 = Double.valueOf(60);
        System.out.println(primitivo2);

        char primitivo3  = 'c';
        primitivo3 = Character.valueOf('c');
        System.out.println(primitivo3);

        Integer autoBoxInt = 70;
        int unBoxingInt = autoBoxInt;
        System.out.println(unBoxingInt);

        Double autoBoxdouble = 80.0;
        double unBoxingDouble1 = autoBoxdouble;
        System.out.println(unBoxingDouble1);

        Character autoBoxcharacter1 = 'd';
        char unBoxingCharacter1 = autoBoxcharacter1;
        System.out.println(unBoxingCharacter1);
        }

        public static void somma(int numero1, int numero2){
            int risultato = numero1 + numero2;
            System.out.println(risultato);
    }

    public static void stampaChar(char char1) {
        System.out.println(char1);
    }
    public static void stampaIntergerESomma(Integer numero3, Integer numero4) {
        Integer risultato = numero3 + numero4;
        System.out.println(risultato);
    }
    public static void stampaCharacter(Character character1) {
        System.out.println(character1);
    }

}