import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        
        Scanner scanner = new Scanner(System.in);
        
        String string = scanner.next();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        
        System.out.println(string.substring(start, end + 1));
    }
}
