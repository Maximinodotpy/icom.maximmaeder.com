public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to maxims java quiz!");

        int score = 0;

        Question[] questions = {
            new Question(
                "In how many movies did ronald reagan and his wive appear together",
                "1",
                "3",
                "0",
                "11"
            ),
            new Question(
                "Which of these numbers is closest to PI?",
                "1",
                "3",
                "0",
                "11"
            ),
            new Question(
                "How many council members does schaffhausen have?",
                "5",
                "4",
                "7",
                "6"
            ),
            new Question(
                "Last Question",
                "Correct",
                "3",
                "0",
                "11"
            ),
        };

        for (Question question : questions) {
            // The ask functions will return either 1 or -1 so we can add that to the score.
            score += question.ask();
        }

        System.out.println("Thats the end, your final score is: " + score);
    }
}