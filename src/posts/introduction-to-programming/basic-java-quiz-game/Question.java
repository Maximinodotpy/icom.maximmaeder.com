import java.util.Scanner;

public class Question {
    String question;
    String correct_answer;
    String wrong_answer1;
    String wrong_answer2;
    String wrong_answer3;

    public Question(
        String question,
        String correct_answer,
        String wrong_answer1,
        String wrong_answer2,
        String wrong_answer3
    ) 
    {
        this.question = question;

        if (!this.question.endsWith("?")) {
            System.out.println("The question did not with a question mark, adding now ...");
            this.question += "?";
        }

        this.correct_answer = correct_answer;
        this.wrong_answer1 = wrong_answer1;
        this.wrong_answer2 = wrong_answer2;
        this.wrong_answer3 = wrong_answer3;
        System.out.println("Question created ...");
    }

    public int ask() {
        System.out.println("-----------------");
        System.out.println(this.question);

        try (Scanner scanner = new Scanner(System.in);) {
            String user_answer = scanner.nextLine();
            System.out.println(user_answer);
        } finally {
            System.out.println("Something went wrong while getting the user input");
        }

        return 2;
    }

    @Override
    public String toString() {
        return this.question + " -> " + this.correct_answer;
    }
}