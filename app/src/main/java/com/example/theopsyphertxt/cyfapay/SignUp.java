package com.example.theopsyphertxt.cyfapay;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    protected EditText mSurname;
    protected EditText mOthernames;
    protected EditText mMobileNumber;
    protected EditText mEmail;
    protected EditText mPassword;
    protected EditText mConfirmPassword;

    protected Button mSignUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup1);

        //Linking edittext containers to xml
        mSurname = (EditText) findViewById(R.id.text_surname);
        mOthernames = (EditText) findViewById(R.id.text_othernames);
        mMobileNumber = (EditText) findViewById(R.id.text_contact);
        mEmail = (EditText) findViewById(R.id.text_email);
        mPassword = (EditText) findViewById(R.id.password);
        mConfirmPassword = (EditText) findViewById(R.id.confirm_password);
        mSignUpButton = (Button) findViewById(R.id.button_signup);

        //SignUp button tasks below
        mSignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //data entry below
                String surname = mSurname.getText().toString().trim();
                String othernames = mOthernames.getText().toString().trim();
                String mobilenumber = mMobileNumber.getText().toString().trim();
                String email = mEmail.getText().toString().trim();
                String password = mPassword.getText().toString().trim();
                String confirmpassword = mConfirmPassword.getText().toString().trim();


                //TODO include if clause for other entries
                if(password.equals(confirmpassword)) {
                    //TODO else send you a pin via sms or email after verification
                    //user needs to sign in with pin at Login page
                    //Toost message
                    Toast.makeText(SignUp.this, R.string.new_pin_alert, Toast.LENGTH_LONG).show();
                }
                else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(SignUp.this);
                    builder.setMessage(R.string.signup_error_message)
                            .setTitle(R.string.error_titled)
                            .setPositiveButton(android.R.string.ok, null);
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
            }
        });
    }
}
