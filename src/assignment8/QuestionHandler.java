package assignment8;

import java.util.LinkedList;

public class QuestionHandler {

    private LinkedList<Question> questions;
    public QuestionHandler(int amountOfQuestions){
        for (int i = 0; i < amountOfQuestions; i++) {
            questions.addLast(new Question("Science Question", ""+i, "Science"));
            questions.addLast(new Question("Pop Question", ""+i, "Pop"));
            questions.addLast(new Question("Sports Question", ""+i, "Sports"));
            questions.addLast(new Question("Rock Question", ""+i, "Rock"));
        }
    }

    //changed long if-statement code to compact code
    public void askQuestion(Player currentPlayer) {
        String currentCategory = getCurrentCategory(currentPlayer.getPlace());
        System.out.println("The category is " + currentCategory);

        for(Question question: questions){
            if(question.getQuestionType() == currentCategory){
                System.out.println(question.getQuestion());
                questions.remove(question);
            } else {
                System.out.println("all "+currentCategory+" questions are answered");
            }
        }

    }

    private String getCurrentCategory(int place) {
        if (place == 0 || place == 4 || place == 8){
            return "Pop";
        } else if (place == 1 || place == 5 || place == 9){
            return "Science";
        } else if (place == 2 || place == 6 || place == 10){
            return "Sports";
        } else {
            return "Rock";
        }
    }




}
