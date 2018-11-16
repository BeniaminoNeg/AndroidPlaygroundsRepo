package com.negrini.beniamino.learncert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private  static final String TOTAL_COUNT = "total_count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastMe (View view){
        Toast toast = Toast.makeText(this,"bellaaaaaaa", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countMe (View view){
        TextView textView = (TextView) findViewById(R.id.textView);
        String attualeString = textView.getText().toString();
        Integer count = Integer.parseInt(attualeString);
        count++;
        String nuovaString = count.toString();
        textView.setText(nuovaString);
    }

    public void randomMe(View view){
        TextView textView = (TextView) findViewById(R.id.textView);
        String countString = textView.getText().toString();
        int count = Integer.parseInt(countString);
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra(TOTAL_COUNT,count);
        startActivity(intent);
    }
}
