import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String nazwa = scanner.nextLine();
        nazwa=nazwa.toLowerCase();
        boolean czyKonczy = nazwa.endsWith("burg");
        System.out.println(czyKonczy);
    }
}