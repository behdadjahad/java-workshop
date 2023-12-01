public class Main {
    public static void main(String[] args) {
        Person p = new Person("09303723288");
        p.setLastName("gholami");
        Dog d = new Dog(4, "pug");
        Dog d2 = new Dog(5, "german", "male", p);
        d.bark();
    }
}