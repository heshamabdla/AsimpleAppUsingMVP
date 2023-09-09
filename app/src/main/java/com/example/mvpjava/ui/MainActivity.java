package com.example.mvpjava.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mvpjava.R;

public class MainActivity extends AppCompatActivity implements MovieInterface {

        Button button;
        TextView textView;
        MoviePresenter moviePresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);

        moviePresenter=new MoviePresenter(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moviePresenter.getNameOfMovie();
            }
        });
    }// end onCreate

    @Override
    public void OnGetMovie(String movieName) {
        textView.setText(movieName);

    }// end OnGetMovie




}// end MainActivity class