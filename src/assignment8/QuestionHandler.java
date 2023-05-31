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
    public void askQuestion(String currentCategory) {
        for(Question question: questions){
            if(question.getQuestionType() == currentCategory){
                System.out.println(question.getQuestion());
                questions.remove(question);
            } else {
                System.out.println("all "+currentCategory+" questions are answered");
            }
        }

    }


}
