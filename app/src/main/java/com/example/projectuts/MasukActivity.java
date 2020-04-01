package com.example.projectuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MasukActivity extends AppCompatActivity {
    public EditText username;
    public EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masuk);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
    }


    public void HandleLogin(View view) {
        if (username.getText().toString().equals("anjas") && password.getText().toString().equals("vaper")) {

            Intent intent = new Intent(this, DaftarActivity.class);
            startActivity(intent);

        } else {

            Toast.makeText(view.getContext(), "Username atau password salah!", Toast.LENGTH_LONG).show();
        }
    }
}
