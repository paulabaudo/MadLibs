package com.globant.paulabaudo.madlibs;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    EditText mRelativeText;
    EditText mAdjectiveText;
    EditText mAdjectiveText2;
    EditText mNameRoomText;
    EditText mAdjectiveText3;
    EditText mVerbEdText;
    EditText mBodyText;
    EditText mVerbIngText;
    EditText mRelativeText2;
    EditText mNameText;
    Boolean[] mStates;
    Button mShowmeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init(){
        mStates = new Boolean[]{false,false,false,false,false,false,false,false,false,false};
        mRelativeText = (EditText) findViewById(R.id.edit_text_relative);
        mAdjectiveText = (EditText) findViewById(R.id.edit_text_adjective);
        mAdjectiveText2 = (EditText) findViewById(R.id.edit_text_adjective_2);
        mNameRoomText = (EditText) findViewById(R.id.edit_text_name_room);
        mAdjectiveText3 = (EditText) findViewById(R.id.edit_text_adjective_3);
        mVerbEdText = (EditText) findViewById(R.id.edit_text_verb_ed);
        mBodyText = (EditText) findViewById(R.id.edit_text_body);
        mVerbIngText = (EditText) findViewById(R.id.edit_text_verb_ing);
        mRelativeText2 = (EditText) findViewById(R.id.edit_text_relative_2);
        mNameText = (EditText) findViewById(R.id.edit_text_name);
        mShowmeButton = (Button) findViewById(R.id.button_showme);

        addTextWatchers();
        prepareButton();
    }

    private void prepareButton(){
        mShowmeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ResultActivity.class);

                intent.putExtra("relative",mRelativeText.getText().toString());
                intent.putExtra("adjective",mAdjectiveText.getText().toString());
                intent.putExtra("adjective2",mAdjectiveText2.getText().toString());
                intent.putExtra("nameroom",mNameRoomText.getText().toString());
                intent.putExtra("adjective3",mAdjectiveText3.getText().toString());
                intent.putExtra("verbed",mVerbEdText.getText().toString());
                intent.putExtra("body",mBodyText.getText().toString());
                intent.putExtra("verbing",mVerbIngText.getText().toString());
                intent.putExtra("relative2",mRelativeText2.getText().toString());
                intent.putExtra("name",mNameText.getText().toString());

                startActivity(intent);
            }
        });
    }

    private void addTextWatchers() {

        mRelativeText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (TextUtils.isEmpty(s)){
                    mStates[0]=false;
                } else {
                    mStates[0]=true;
                }
                buttonIsReady();
            }
        });

        mAdjectiveText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (TextUtils.isEmpty(s)){
                    mStates[1]=false;
                } else {
                    mStates[1]=true;
                }
                buttonIsReady();
            }
        });

        mAdjectiveText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (TextUtils.isEmpty(s)){
                    mStates[2]=false;
                } else {
                    mStates[2]=true;
                }
                buttonIsReady();
            }
        });

        mNameRoomText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (TextUtils.isEmpty(s)){
                    mStates[3]=false;
                } else {
                    mStates[3]=true;
                }
                buttonIsReady();
            }
        });

        mAdjectiveText3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (TextUtils.isEmpty(s)){
                    mStates[4]=false;
                } else {
                    mStates[4]=true;
                }
                buttonIsReady();
            }
        });

        mVerbEdText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (TextUtils.isEmpty(s)){
                    mStates[5]=false;
                } else {
                    mStates[5]=true;
                }
                buttonIsReady();
            }
        });

        mBodyText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (TextUtils.isEmpty(s)){
                    mStates[6]=false;
                } else {
                    mStates[6]=true;
                }
                buttonIsReady();
            }
        });

        mVerbIngText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (TextUtils.isEmpty(s)){
                    mStates[7]=false;
                } else {
                    mStates[7]=true;
                }
                buttonIsReady();
            }
        });

        mRelativeText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (TextUtils.isEmpty(s)){
                    mStates[8]=false;
                } else {
                    mStates[8]=true;
                }
                buttonIsReady();
            }
        });

        mNameText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (TextUtils.isEmpty(s)){
                    mStates[9]=false;
                } else {
                    mStates[9]=true;
                }
                buttonIsReady();
            }
        });
    }

    private void buttonIsReady(){
        int i = 0;
        while (i<10 && mStates[i]){
            i++;
        }
        if (i==10){
            mShowmeButton.setEnabled(true);
        } else {
            mShowmeButton.setEnabled(false);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
