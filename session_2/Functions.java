public class Functions {
    public static void main(String[] args) {


        System.out.println(Functions.sum1(1,2));

        Functions f = new Functions();
        System.out.println(f.sum2(1, 2));


    }


    public static int sum1(int a, int b) {
        return a + b;
    }

    public int sum2(int a, int b) {
        return a + b;
    }

    public Functions returnFunc() {
        return new Functions();
    }
}
