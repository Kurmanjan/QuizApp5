package kg.kurmanjan.quizapp.ui.history;

import kg.kurmanjan.quizapp.model.QuizResult;
import kg.kurmanjan.quizapp.QuizApp;
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
        QuizApp.quizDataBase.quizDao().deleteById(id);
    }

    @Override
    public void deleteAll() {

    }
}
