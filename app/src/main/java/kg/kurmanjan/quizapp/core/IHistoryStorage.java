package kg.kurmanjan.quizapp.core;

import kg.kurmanjan.quizapp.model.QuizResult;

public interface IHistoryStorage {

    QuizResult getQuizResult(int id);

    int saveQuizResult(QuizResult quizResult);

    void deleteById(int id);


    void deleteAll();
}
