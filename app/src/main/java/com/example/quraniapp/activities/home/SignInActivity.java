package com.example.quraniapp.activities.home;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.quraniapp.R;
import com.example.quraniapp.activities.Sqlite_DB_handler;
import com.example.quraniapp.databinding.ActivitySignInBinding;

public class SignInActivity extends AppCompatActivity {

    //databinding
    ActivitySignInBinding activitySignInBinding;


    private EditText username, password;
    private Button signin;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;


    private Sqlite_DB_handler sqlite_db_handler;

    public static final String signinCredentials = "login_credentials";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);


        activitySignInBinding = DataBindingUtil.setContentView(this, R.layout.activity_sign_in);


        activitySignInBinding.textSignUpNowSignInActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(SignInActivity.this, SignUPActivity.class));

            }
        });


        username = findViewById(R.id.edit_text_Email_SignInActivity);
        password = findViewById(R.id.edit_text_Password_SignInActivity);
        signin = findViewById(R.id.button_SignIn_SignInActivity);



        sqlite_db_handler = new Sqlite_DB_handler(SignInActivity.this);

        // Acts as session
        sharedPreferences = getSharedPreferences(signinCredentials, Context.MODE_PRIVATE);

        signin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

//                Toast.makeText(getApplicationContext(),"Validation Successful",Toast.LENGTH_LONG).show();
                try {
//                        wait(3000);
                    Boolean checkUsernamePassword = sqlite_db_handler.checkUsernamePassword(username.getText().toString(), password.getText().toString());

                    if (checkUsernamePassword) {
                        SharedPreferences.Editor editor = sharedPreferences.edit();

                        editor.putString("usernameKey", username.getText().toString());
                        editor.putString("passwordKey", password.getText().toString());
                        editor.apply();

                        Toast.makeText(getApplicationContext(), "Login Successfully", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(SignInActivity.this, HomeActivity.class);
                        startActivity(intent);

                    } else {

                        Toast.makeText(getApplicationContext(), "Username/Password incorrect", Toast.LENGTH_LONG).show();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "Something went wrong, try again later\n" + e, Toast.LENGTH_LONG).show();
                }

            }
        });


    }
}