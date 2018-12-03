package com.example.boergonje.testapp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Login(View view){
        try{
            EditText Email = (EditText)findViewById(R.id.EditTextEmail);
            EditText Wachtwoord = (EditText)findViewById(R.id.EditTextWachtwoord);

            Toast.makeText(MainActivity.this, "Naam : " + Email.getText().toString(), Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "Pass : " + Wachtwoord.getText().toString(), Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Toast.makeText(MainActivity.this, "ERROR : " + e.toString(), Toast.LENGTH_LONG).show();
        }

    }
}
