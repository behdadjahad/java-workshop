import java.util.Scanner;

public class Form {

    public static int registerMenu() {
        System.out.println("Welcome To Quiz Game:");
        System.out.println("1. login");
        System.out.println("2. signup");
        System.out.println("3. exit game");

        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static int mainMenu() {
        System.out.println("1. play game");
        System.out.println("2. add question");
        System.out.println("3. exit game");

        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static int questionForm(Question question) {
        System.out.println(question.toString());
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        if (question.getRightChoice() == choice) {
            return 1;
        }
        return 0;
    }

    public static User registerUser(User[] users) {
        Scanner input = new Scanner(System.in);

        System.out.println("first name:");
        String firstName = input.nextLine();


        System.out.println("last name:");
        String lastName = input.nextLine();

        System.out.println("email:");
        String email = input.nextLine();

        System.out.println("phone number:");
        String phoneNumber = input.nextLine();

        System.out.println("password:");
        String pass = input.nextLine();

        User newUser = new User(
                firstName,
                lastName,
                email,
                phoneNumber,
                pass);
        if (isUserExist(users, newUser)) {
            return null;
        }
        return newUser;
    }

    public static User loginUser(User[] users) {
        Scanner input = new Scanner(System.in);

        System.out.println("email:");
        String email = input.nextLine();

        System.out.println("password:");
        String password = input.nextLine();

        User user = getUser(users, email);

        if (user == null) {
            return null;
        }
        if (user.getPassword().equals(password)) {
            return user;
        }

        return null;
    }

    public static User getUser(User[] users, String email) {
        for (User user : users) {
            if (user == null) {
                break;
            }
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    public static boolean isUserExist(User[] users, User newUser) {
        for (User user : users) {
            if (user == null) {
                break;
            }
            if (user.getEmail().equals(newUser.getEmail())) {
                return true;
            }
        }
        return false;
    }

    public static Question assQuestionForm() {
        Scanner stringInput = new Scanner(System.in);
        Scanner intInput = new Scanner(System.in);

        System.out.println("title:");
        String title = stringInput.nextLine();

        System.out.println("question:");
        String question = stringInput.nextLine();

        System.out.println("num of choices:");
        int num = intInput.nextInt();
        String[] choices = new String[10];

        for (int i = 0 ; i < num ; i++) {
            System.out.println("choice:");
            choices[i] = stringInput.nextLine();
        }

        System.out.println("right choice:");
        int rightChoice = intInput.nextInt();

        return new Question(title, question, choices, rightChoice);

    }
}
