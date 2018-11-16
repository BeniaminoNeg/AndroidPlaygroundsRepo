package com.negrini.beniamino.learncert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    private static final String TOTAL_COUNT = "total_count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        showRandomNumber();
    }

    private void showRandomNumber(){
        int count = getIntent().getIntExtra(TOTAL_COUNT,0);
        Random random = new Random();
        Integer randomNumeber = 0;
        if (count>0){
            randomNumeber = random.nextInt(count);
        }
        System.out.println("CHECKPOINT 1");
        System.out.println(randomNumeber);

        TextView randomView = (TextView) findViewById(R.id.textview_random);
        System.out.println(randomView);
        randomView.setText(randomNumeber.toString());
    }
}
