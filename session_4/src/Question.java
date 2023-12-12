import java.util.Arrays;

public class Question {
    private String title;
    private String question;
    private String[] choices = new String[10];
    private int rightChoice;

    public Question(String title, String question, String[] choices, int rightChoice) {
        this.title = title;
        this.question = question;
        this.rightChoice = rightChoice;
        for (int i = 0 ; i < this.choices.length ; i++) {
            this.choices[i] = choices[i];
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getChoices() {
        return choices;
    }

    public void setChoices(String[] choices) {
        for (int i = 0 ; i < this.choices.length ; i++) {
            this.choices[i] = choices[i];
        }
    }

    public int getRightChoice() {
        return rightChoice;
    }

    public void setRightChoice(int rightChoice) {
        this.rightChoice = rightChoice;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(title + "\n" + question + "\n");
        for (int i = 0 ; i < choices.length ; i++) {
            int c = i + 1;
            if (choices[i] == null) {
                break;
            }
            result.append("\t").append(c).append(".").append(choices[i]).append("\n");
        }
        return result.toString();
    }
}
