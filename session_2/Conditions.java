public class Conditions {
    public static void main(String[] args) {
        int a = 4;
        boolean b = a == 4;

        if (b) {
            System.out.println("It's true!");
        }

        a = 4;

        if (a == 4) {
            System.out.println("Ohhh! So a is 4!");
        }

        a = 4;
        int n = 5;
        boolean result;
        result = a < n; // true
        result = a > n; // false
        result = a <= 4; // a smaller or equal to 4 - true
        result = n >= 6; // b bigger or equal to 6 - false
        result = a == n; // a equal to b - false
        result = a != n; // a is not equal to b - true
        result = a > n || a < n; // Logical or - true
        result = 3 < a && a < 6; // Logical and - true
        result = !result; // Logical not - false










        String s1 = new String("Wow");
        String s2 = new String("Wow");
        String sameS1 = s1;


        boolean r2 = s1.equals(s2); // This is true, since a and b are logically equals
        System.out.println(r2);
        boolean r3 = s1 == sameS1;  // This is true, since a and sameA are really the same object
        System.out.println(r3);
        boolean r4 = s1 == s2;
        System.out.println(r4);

        int grade = 20;

        switch (grade) {
            case 10:
                System.out.println("failed");
                break;
            case 12:
                System.out.println("not good");
                break;
            case 15:
                System.out.println("try harder");
                break;
            case 20:
                System.out.println("good");
                break;
            default:
                System.out.println("invalid data");
                break;
        }


    }
}
