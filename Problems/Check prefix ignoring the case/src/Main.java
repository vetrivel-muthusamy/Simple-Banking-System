import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String napis = scanner.next();
        String nowyNapis = napis.toUpperCase();
        boolean czyZaczyna = nowyNapis.startsWith("J");
        System.out.println(czyZaczyna);
    }
}