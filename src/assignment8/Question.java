package assignment8;

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
