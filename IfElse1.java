/*public class IfElse1 {
    public static void main(String[] args) {
        int number = 64;

        if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else {
            System.out.println("il numero non è divisibile ne per 3 ne per 5");
        }
    }
}*/

public class IfElse1 {
    public static void main(String[] args) {
        int number = 9;

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("il numero non è divisibile ne per 3 ne per 5");
        }
    }
}

/*
 * public class IfElse1 {
 * public static void main(String[] args) {
 * int number = 9;
 * 
 * if (number % 3 == 0) {
 * dividibilex3();
 * } else if (number % 5 == 0) {
 * dividibilex5();
 * } else if (number % 3 == 0 && number % 5 == 0) {
 * dividibilex3E5();
 * }
 * }
 * 
 * public static void dividibilex3() {
 * System.out.println("Fizz");
 * }
 * 
 * public static void dividibilex5() {
 * System.out.println("Buzz");
 * }
 * 
 * public static void dividibilex3E5() {
 * System.out.println("FizzBuzz");
 * }
 * }
 */
