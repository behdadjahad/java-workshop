
public class More_basics {
    public static void main(String[] args) {
        int myNumber;
        myNumber = 5;
        System.out.println(myNumber);

        double d = 4.5;
        d = 3.0;
        System.out.println(d);

        float f = (float) 4.5;

        f = 3.14f;
        System.out.println(f);

        char c = 'g';

        System.out.println(c);


        String s1 = new String("Who let the dogs out?");
        String s2 = "Who who who who!";
        String s3 = s1 + s2;

        System.out.println(s3);


        int num = 5;
        String s = "I have " + num + " cookies";
        System.out.println(s);

        boolean b = false;
        b = true;
        System.out.println(b);

        boolean toBe = false;
        b = toBe || !toBe;

        System.out.println(b);






    }
}