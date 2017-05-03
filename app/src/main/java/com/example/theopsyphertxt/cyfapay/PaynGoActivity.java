package com.example.theopsyphertxt.cyfapay;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PaynGoActivity extends AppCompatActivity {

    protected EditText mMobileNumber;
    protected EditText mReceiverNumber;
    protected EditText mAmount;
    protected EditText mPincode;
    protected EditText mConfirmPincode;
    protected EditText mEmail;

    protected Button mSendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_and_go);

        //Linking edittext containers to xml
        mMobileNumber = (EditText) findViewById(R.id.text_senderContact);
        mReceiverNumber = (EditText) findViewById(R.id.text_receiverContact);
        mAmount = (EditText) findViewById(R.id.text_amount);
        mPincode = (EditText) findViewById(R.id.text_pincode);
        mConfirmPincode = (EditText) findViewById(R.id.text_confirmPincode);  //is confirmation this necessary???
        mEmail = (EditText) findViewById(R.id.text_email);
        mSendButton = (Button) findViewById(R.id.button_pay);

        //Send button tasks below
        mSendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        //data entry below
                String mobilenumber = mMobileNumber.getText().toString().trim();
                String receivernumber = mReceiverNumber.getText().toString().trim();
                String amount = mAmount.getText().toString().trim();
                String pincode = mPincode.getText().toString().trim();
                String confirmpincode = mConfirmPincode.getText().toString().trim();
                String email = mEmail.getText().toString().trim();

                //TODO include if clause
                AlertDialog.Builder builder = new AlertDialog.Builder(PaynGoActivity.this);
                builder.setMessage(R.string.login_error_message)
                        .setTitle(R.string.error_titled)
                        .setPositiveButton(android.R.string.ok, null);
                AlertDialog dialog = builder.create();
                dialog.show();

                //TODO work on this page later
                Toast.makeText(PaynGoActivity.this, R.string.payngo_update, Toast.LENGTH_LONG).show();
            }
        } );
    }
}
