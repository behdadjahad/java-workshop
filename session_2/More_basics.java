import java.util.Scanner;


public class More_basic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        System.out.println("tedad ra vared konid:");
        int num = scan.nextInt();
        String[] names = new String[num];
        for (int i = 0 ; i < num ; i++) {
            System.out.println("nam ra vared konid:");
            names[i] = scanner.nextLine();
        }

        for (int i = 0 ; i < num ; i++) {
            System.out.println(names[i]);
        }
    }
}