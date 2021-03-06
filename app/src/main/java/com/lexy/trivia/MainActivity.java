package com.lexy.trivia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.lexy.trivia.controller.AppController;
import com.lexy.trivia.data.Repository;
import com.lexy.trivia.model.Question;

import org.json.JSONArray;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Question> questions = new Repository().getQuestion();
        Log.d("MAIN", "onCreate: " + questions);
    }
}