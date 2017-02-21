package com.example.laura.good_morning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.*;
import android.view.View;
import android.content.Intent;
import android.widget.*;
import android.app.Activity;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button signInButton = (Button) findViewById(R.id.bLogin);

        signInButton.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View account_settings_activity){
                        startActivity(new Intent(MainActivity.this, AccountSettingsActivityView.class));
                    }
                }

        );
    }
}
