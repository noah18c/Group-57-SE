package assignment8;

/**
 * Group name: 57
 * Student names: Noah Croes, Achilleas Leivadiotis
 * Student id’s: i6220934, i6327367
 */
public class Question {

    private String question, questionType, answer;

    public Question(String question, String answer, String questionType){
        this.question = question;
        this.answer = answer;
        this.questionType = questionType;
    }

    public String getQuestion() {
        return question;
    }

    public String getQuestionType() {
        return questionType;
    }


}
