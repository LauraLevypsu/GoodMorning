package com.example.laura.good_morning;
import android.os.*;
import android.view.View;
import android.content.Intent;
import android.widget.*;
import android.app.Activity;
import java.util.*;
/**
 * Created by Laura on 2/13/2017.
 */

public class AccountSettingsActivityView extends Activity {

    protected void onCreate (Bundle savedIntanceState){

        Account account;

        super.onCreate(savedIntanceState);
        setContentView(R.layout.account_settings_activity);

        final EditText etZipcode = (EditText) findViewById(R.id.etZipcode);
        final EditText etPrepTime = (EditText) findViewById(R.id.etPrepTime);
        final EditText etEmail = (EditText) findViewById(R.id.etEmail);

        etZipcode.setText(Account.zipcode);
        etPrepTime.setText(Account.prepTime);
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
                    }
                }
        );
    }
}
