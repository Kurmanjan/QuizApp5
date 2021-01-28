package kg.kurmanjan.quizapp.ui.main;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import kg.kurmanjan.quizapp.data.IQuizApiClient;
import kg.kurmanjan.quizapp.model.Category;
import kg.kurmanjan.quizapp.QuizApp;

public class MainViewModel extends ViewModel {

    MutableLiveData<Category> mutableLiveData = new MutableLiveData<>();

    public void getCategory() {
        QuizApp.quizApiClient.getCategory(new IQuizApiClient.CategoryCallBack() {
            @Override
            public void onSuccess(Category result) {
                mutableLiveData.setValue(result);
            }

            @Override
            public void onFailure(Exception e) {
                Log.d("ololo", e.getMessage());
            }
        });
    }
}