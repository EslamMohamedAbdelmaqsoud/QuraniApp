package com.example.quraniapp.activities.home;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.quraniapp.R;
import com.example.quraniapp.activities.Sqlite_DB_handler;
import com.example.quraniapp.databinding.ActivitySignUpBinding;

public class SignUPActivity extends AppCompatActivity {

    //databinding
    ActivitySignUpBinding activitySignUpBinding;
    private EditText username, password, repassword;
    private Button signup;
    private Sqlite_DB_handler sqlite_db_handler;


    private boolean validate_username(EditText username) {
        String name = username.getText().toString();
        boolean name_valid = true;
        if (name.equals("")) {
            name_valid = false;
            username.requestFocus();
            username.setError("Please Enter Your Email");
        } else if (!Patterns.EMAIL_ADDRESS.matcher(name).matches()) {
            name_valid = false;
            username.requestFocus();
            username.setError("Email address format is not valid");
        }
        if (!name_valid) {
            return false;
        } else {
            return true;
        }
    }

    private boolean validate_password(EditText password) {
        String pass = password.getText().toString();
        boolean password_valid = true;
        System.out.println("password length: " + pass.length());
        String errorMessage = "";
        if (pass.length() < 8) {
            password_valid = false;
            password.requestFocus();
            errorMessage += "-> Minimum length of password is 8" + "\n";
        }
        if (!pass.matches("(?=.*[a-z])(?=.*[A-Z]).+$")) {
            System.out.println("upper and lower case error password: " + pass);
            password_valid = false;
            password.requestFocus();
            errorMessage += "-> Password should contain uppercase and lowercase letters" + "\n";
        }
        if (!pass.matches("(?=.*\\d).+$")) {
            password_valid = false;
            password.requestFocus();
            errorMessage += "-> Password should contain atleast 1 number" + "\n";
        }
        if (!pass.matches("(?=.*[-+_!@#$%^&*,. ?]).+$")) {
            password_valid = false;
            password.requestFocus();
            errorMessage += "-> Password should contain atleast 1 special character";
        }

        if (!password_valid) {
            password.setError(errorMessage);
            return false;
        } else {
            return true;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //        //databinding
        activitySignUpBinding = DataBindingUtil.setContentView(this, R.layout.activity_sign_up);

        activitySignUpBinding.textSignInSignUpActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUPActivity.this, SignInActivity.class));
            }
        });

        username = findViewById(R.id.edit_text_FullName_SignUpActivity);
        password = findViewById(R.id.edit_text_Email_SignUpActivity);
        repassword = findViewById(R.id.edit_text_Password_SignUpActivity);
        signup = findViewById(R.id.button_SignUp_SignUpActivity);

        sqlite_db_handler = new Sqlite_DB_handler(SignUPActivity.this);

        username.addTextChangedListener(new TextWatcher() {
            boolean username_valid;

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                username.requestFocus();
//                username.setHint("Only Alphabets [a-z A-Z]");
                username_valid = false;
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!validate_username(username)) {
                    username_valid = false;
                } else {
                    username_valid = true;
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (username_valid) {
                    username.setBackgroundResource(R.drawable.custom_input);
                } else {
                    username.setBackgroundResource(0);
                }
            }
        });

        password.addTextChangedListener(new TextWatcher() {
            boolean password_valid;

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                password.requestFocus();
                password_valid = false;
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!validate_password(password)) {
                    password_valid = false;
                } else {
                    password_valid = true;
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (password_valid) {
                    password.setBackgroundResource(R.drawable.custom_input);
                } else {
                    password.setBackgroundResource(0);
                }
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                boolean validation_success = true;
                if (!validate_username(username)) {
                    validation_success = false;
                } else if (!validate_password(password)) {
                    validation_success = false;
                } else if (!repassword.getText().toString().equals(password.getText().toString())) {
                    repassword.setError("Passwords do not match");
                    validation_success = false;
                }
                if (validation_success) {
                    Toast.makeText(getApplicationContext(), "SignUp Successfully", Toast.LENGTH_SHORT).show();
                    try {
                        startActivity(new Intent(SignUPActivity.this, SignInActivity.class));

//                        wait(3000);
                        sqlite_db_handler.addUsers(username.getText().toString(), password.getText().toString());
//                        Toast.makeText(getApplicationContext(), "New User " + username.getText().toString() + " Added Successfully", Toast.LENGTH_LONG).show();
                    } catch (Exception e) {
//                        Toast.makeText(getApplicationContext(), "User " + username.getText().toString() + " not added, try again later", Toast.LENGTH_SHORT).show();
                        e.printStackTrace();
                    }
                }
            }
        });


    }
}