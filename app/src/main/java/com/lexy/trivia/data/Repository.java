package com.lexy.trivia.data;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.toolbox.JsonArrayRequest;
import com.lexy.trivia.controller.AppController;
import com.lexy.trivia.model.Question;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    ArrayList<Question> questionArrayList = new ArrayList<>();

    String url = "https://raw.githubusercontent.com/curiousily/simple-quiz/master/script/statements-data.json";

    public List<Question> getQuestion() {

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null,
                response -> {
                    Log.d("REPO", "onCreate: " + response.toString());
                }, error -> {

        });

        AppController.getInstance().addToRequestQueue(jsonArrayRequest);

        return null;
    }
}
