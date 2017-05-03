package com.example.theopsyphertxt.cyfapay;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ForgotPWActivity extends AppCompatActivity {


    protected EditText mMobileNumber;
    protected EditText mEmail;
    protected EditText mNewPassword;
    protected EditText mConfirmPassword;

    protected Button mSendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);


        //Linking edittext containers to xml
        mMobileNumber = (EditText) findViewById(R.id.text_contact);
        mEmail = (EditText) findViewById(R.id.text_email);
        mNewPassword = (EditText) findViewById(R.id.new_password);
        mConfirmPassword = (EditText) findViewById(R.id.confirm_password);
        mSendButton = (Button) findViewById(R.id.button_sendpw);

        //SignUp button tasks below
        mSendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //data entry below
                String mobilenumber = mMobileNumber.getText().toString().trim();
                String email = mEmail.getText().toString().trim();
                String newpassword = mNewPassword.getText().toString().trim();
                String confirmpassword = mConfirmPassword.getText().toString().trim();

               //TODO include if clause other entries
                if(newpassword.equals(confirmpassword)) {
                    //TODO else send you a pin via sms or email after verification
                    //user needs to sign in with pin at Login page
                    //Toost message
                    Toast.makeText(ForgotPWActivity.this, R.string.new_pin_alert, Toast.LENGTH_LONG).show();
                }
                else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(ForgotPWActivity.this);
                    builder.setMessage(R.string.forgot_error_message)
                            .setTitle(R.string.error_titled)
                            .setPositiveButton(android.R.string.ok, null);
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
            }
        });
    }
}
