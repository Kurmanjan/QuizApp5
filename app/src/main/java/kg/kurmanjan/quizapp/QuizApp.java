package kg.kurmanjan.quizapp;

import android.app.Application;

import androidx.room.Room;

import kg.kurmanjan.quizapp.core.IHistoryStorage;
import kg.kurmanjan.quizapp.data.IQuizApiClient;
import kg.kurmanjan.quizapp.data.QuizApiClient;
import kg.kurmanjan.quizapp.db.QuizDataBase;
import kg.kurmanjan.quizapp.ui.history.HistoryStorage;

public class QuizApp extends Application {

    private static QuizApp instance;

    public static IQuizApiClient quizApiClient;
    public static IHistoryStorage historyStorage;
    public static QuizRepository repository;
    public static QuizDataBase quizDataBase;


    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        quizApiClient = new QuizApiClient();
        historyStorage = new HistoryStorage();
        quizDataBase = Room.databaseBuilder(
                this,
                QuizDataBase.class,
                "quiz.db"
        ).fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .build();

        repository = new QuizRepository(quizApiClient, historyStorage);
    }
    public static QuizApp getInstance(){
        return instance;
    }

    public static QuizRepository getRepository() {
        return repository;
    }

    public static QuizDataBase getQuizDataBase() {
        return quizDataBase;
    }


}
