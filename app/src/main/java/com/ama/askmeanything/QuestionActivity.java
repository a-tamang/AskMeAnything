package com.ama.askmeanything;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class QuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
    }

    public void onButtonTap(View v) {
        Intent beginApp = new Intent(this, ResponseActivity.class);
        startActivity(beginApp);
    }
}
