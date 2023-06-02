package assignment8;

import java.util.LinkedList;
import java.util.Optional;

/**
 * Group name: 57
 * Student names: Noah Croes, Achilleas Leivadiotis
 * Student id’s: i6220934, i6327367
 */
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

        Optional<Question> optional = findQuestion(currentCategory);
        if(optional.isEmpty()){
            System.out.println("no question of type "+currentCategory+" was found");
        }
    }

    private Optional<Question> findQuestion(String currentCategory){
        Optional<Question> optional = Optional.empty();
        for(Question question: questions){
            if(question.getQuestionType().equals(currentCategory)){
                System.out.println(question.getQuestion());
                optional = Optional.of(question);
                questions.remove(question);
                return optional;
            }
        }
        return optional;
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
