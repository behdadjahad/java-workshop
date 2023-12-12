import java.util.Scanner;

public class Main {
    int MAX_USER = 100;
    int MAX_QUESTION = 100;
    User[] users = new User[MAX_USER];
    Question[] questions = new Question[MAX_QUESTION];

    public static void main(String[] args) {
        Main main = new Main();
        main.runGame();
    }

    private void runGame() {

        main: while (true) {
            int input = Form.registerMenu();
            User user;
            switch (input) {
                case 1:
                    user = Form.loginUser(users);
                    if (user == null) {
                        System.out.println("no user found!");
                        break;
                    }
                    mainGame(user);
                    break;
                case 2:
                    user = Form.registerUser(users);
                    addUser(user);
                    mainGame(user);
                    break;
                case 3:
                    System.out.println("gg wp.");
                    break main;
                default:
                    System.out.println("invalid input");
                    break;
            }

        }
    }

    public void mainGame(User user){

        int input = Form.mainMenu();
        switch (input) {
            case 1:
                playGame();
                break;
            case 2:
                addQuestion();
                break;
            case 3:
                break;
            default:
                System.out.println("invalid input.");
                break;
        }

    }

    public void addUser(User user) {
        for (int i = 0 ; i < users.length ; i++) {
            if (users[i] == null) {
                users[i] = user;
                break;
            }
        }
    }

    public void playGame() {
        int score = 0;
        for (Question question : questions) {
            if (question == null) {
                break;
            }
            score += Form.questionForm(question);
        }
        System.out.println("your score is:");
        System.out.println(score);
    }

    public void addQuestion() {
        for (int i = 0 ; i < questions.length ; i++) {
            if (questions[i] == null) {
                questions[i] = Form.assQuestionForm();
                break;
            }
        }
    }
}