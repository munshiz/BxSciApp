package com.zawadm321.bxsciappthingie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.zawadm321.bxsciappthingie.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void attemptSignIn(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        String Username = ((EditText) findViewById(R.id.EmailID)).getText().toString();
        String Password = ((EditText) findViewById(R.id.Password)).getText().toString();

        


        startActivity(intent);
    }


}
