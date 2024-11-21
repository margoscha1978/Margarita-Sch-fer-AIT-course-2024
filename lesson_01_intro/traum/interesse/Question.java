package interesse;
/*
Класс Question определен для хранения вопросов и ответов.
 */

public class Question {
    private String question; // вопрос
    private String answer; // ответ

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

} // klass ended
