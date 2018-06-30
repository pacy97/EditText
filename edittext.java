package com.example.Pacasian.pacy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by sumith on 16-10-2017.
 */

public class about extends AppCompatActivity {

private EditText edittext;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        edittext=(EditText)findViewById(R.id.ed);
        string st=edittext.getText(st).toString();   
    }
}
