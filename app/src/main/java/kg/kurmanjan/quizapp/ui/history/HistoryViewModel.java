package kg.kurmanjan.quizapp.ui.history;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import kg.kurmanjan.quizapp.core.SingleLiveEvent;
import kg.kurmanjan.quizapp.model.QuizResult;
import kg.kurmanjan.quizapp.QuizApp;

public class HistoryViewModel extends ViewModel {
    public MutableLiveData<List<QuizResult>> historyQuizResult = new MutableLiveData<>();
    public SingleLiveEvent<Void> deleteById = new SingleLiveEvent<>();
    public SingleLiveEvent<Void> share = new SingleLiveEvent<>();

    public HistoryViewModel(){
        QuizApp.quizDataBase.quizDao().getAll().observeForever(data -> historyQuizResult.setValue(data));
    }

    public void popupMenuDelete(int position) {
        QuizApp.repository.deleteById(historyQuizResult.getValue().get(position).getId());
    }
}