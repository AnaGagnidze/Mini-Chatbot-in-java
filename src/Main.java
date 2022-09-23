import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Choose the numeric of question you want to be answered");

        String[] botQuestions = {"1-How much is the product",
                "2-From where do you import the product?",
                "3-Is there any sales going on right now?",
                "4-Can I get a discount as a first time customer?"};

        String[] botAnswers = {"The product costs 15$",
                "The product is made in Korea",
                "Yes! There is an ongoing sale of 15% off the second product you buy",
                "Unfortunately, no."};

        for (String quest : botQuestions) {
            System.out.println(quest);
        }

        Scanner scanner = new Scanner(System.in);
        int numeric = scanner.nextInt();

        System.out.println(botAnswers[numeric]);
    }
}