import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String napis1 = scanner.nextLine();
        String napis2 = scanner.nextLine();
        napis1=napis1.replace(" ","");
        napis2=napis2.replace(" ","");
        //  System.out.println(napis1);
        //System.out.println(napis2);
        // boolean czyRowne = napis1.equals(napis2);
        System.out.println(napis1.equals(napis2));
    }
}