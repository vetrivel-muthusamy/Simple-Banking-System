import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String pre = null;
            try {
                pre = scanner.nextLine();
                int number = Integer.parseInt(pre);

                if (number == 0) {
                    break;
                }

                System.out.println(number * 10);
            } catch (Exception e) {
                System.out.println("Invalid user input: " + pre);
            }

        }
    }
}