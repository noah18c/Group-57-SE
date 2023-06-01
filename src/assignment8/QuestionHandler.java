package assignment8;

import java.util.LinkedList;

public class QuestionHandler {

    private LinkedList<Question> questions;
    public QuestionHandler(int amountOfQuestions){
        questions = new LinkedList<>();
        for (int i = 0; i < amountOfQuestions; i++) {
            questions.addLast(new Question("Science", ""+i, "Science"));
            questions.addLast(new Question("Pop", ""+i, "Pop"));
            questions.addLast(new Question("Sports", ""+i, "Sports"));
            questions.addLast(new Question("Rock", ""+i, "Rock"));
        }
    }

    //changed long if-statement code to compact code
    public void askQuestion(Player currentPlayer) {
        String currentCategory = getCurrentCategory(currentPlayer.getPlace());
        System.out.println("The category is " + currentCategory);

        boolean questionFound = false;
        for(Question question: questions){
            if(question.getQuestionType().equals(currentCategory)){
                System.out.println(question.getQuestion());
                questions.remove(question);
                questionFound = true;
                break;
            }
        }
        if(!questionFound){
            System.out.println("no question of type "+currentCategory+" was found");
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
