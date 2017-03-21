package com.example.good_morning;
import android.os.*;
import android.view.View;
import android.content.Intent;
import android.widget.*;
import android.app.Activity;

import com.example.good_morning.R;

import java.util.*;
/**
 * Created by Laura on 2/13/2017.
 */

public class AccountSettingsActivityView extends Activity {

    protected void onCreate (Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_settings_activity);

        Account account;

        final EditText etZipcode = (EditText) findViewById(R.id.etZipcode);
        final EditText etPrepTime = (EditText) findViewById(R.id.etPrepTime);
        final EditText etEmail = (EditText) findViewById(R.id.etEmail);

        etZipcode.setText(Account.zipcode);
        etPrepTime.setText(String.valueOf(Account.prepTime));
        //etPrepTime.setText("0");
        etEmail.setText(Account.email);

        Button saveButton = (Button) findViewById(R.id.bSave);

        saveButton.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View account_settings_activity){
                        String zip = etZipcode.getText().toString();
                        int prepTime= Integer.parseInt(etPrepTime.getText().toString());
                        String email = etEmail.getText().toString();

                        Account.zipcode = zip;
                        Account.prepTime = prepTime;
                        Account.email = email;

                        Intent intent = new Intent(AccountSettingsActivityView.this, RecordActivityView.class);
                        startActivity (intent);
                    }
                }
        );
    }
}
