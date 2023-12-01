public class Dog {
    private int age;
    private String breed;
    private String gender;
    private Person owner;


    public Dog(int age, String breed) {
        this.age = age;
        this.breed = breed;
    }

    public Dog(int age, String breed, String gender, Person person) {
        this.age = age;
        this.breed = breed;
        this.gender = gender;
        this.owner = person;
    }



    public void bark() {
        System.out.println("hop hop hop.");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0 || age > 30) {
            System.out.println("invalid age.");
            return;
        }
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
