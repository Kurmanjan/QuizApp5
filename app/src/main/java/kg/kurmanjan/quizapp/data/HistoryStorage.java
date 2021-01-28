package kg.kurmanjan.quizapp.data;

import kg.kurmanjan.quizapp.model.QuizResult;
import kg.kurmanjan.quizapp.core.IHistoryStorage;

public class HistoryStorage implements IHistoryStorage {
    @Override
    public QuizResult getQuizResult(int id) {
        return null;
    }

    @Override
    public int saveQuizResult(QuizResult quizResult) {
        return 0;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void deleteAll() {

    }
}
