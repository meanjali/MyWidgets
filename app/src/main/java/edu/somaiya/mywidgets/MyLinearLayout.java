package edu.somaiya.mywidgets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MyLinearLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_linear_layout);
    }
    public void relativeLayout(View view){
        Intent myIntent = new Intent(this,
                MyRelativeLayout.class);
        startActivity(myIntent);
    }
}
