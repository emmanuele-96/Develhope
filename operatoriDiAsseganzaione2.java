public class operatoriDiAsseganzaione2 {
    public static void main(String[] args) {
        int a = 20;
        int b = 55;
        int incremento = 10;
        int result = operazione(a, b, incremento);
        System.out.println(result);
    }

    public static int operazione(int a, int b, int incremento) {
        a += incremento;
        b += incremento;
        int result = a * b;
        return result;
    }
}
