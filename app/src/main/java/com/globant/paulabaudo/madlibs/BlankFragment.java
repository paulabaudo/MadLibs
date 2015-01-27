package com.globant.paulabaudo.madlibs;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

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
    final static String FIELD = "FIELD";

    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        init();

        if (savedInstanceState != null){
            if (savedInstanceState.getBoolean(FIELD + "Name")){
                mNameText.setText("A");
            }
        }
    }

    private void init(){
        mStates = new Boolean[]{false,false,false,false,false,false,false,false,false,false};
        mRelativeText = (EditText) getView().findViewById(R.id.edit_text_relative);
        mAdjectiveText = (EditText) getView().findViewById(R.id.edit_text_adjective);
        mAdjectiveText2 = (EditText) getView().findViewById(R.id.edit_text_adjective_2);
        mNameRoomText = (EditText) getView().findViewById(R.id.edit_text_name_room);
        mAdjectiveText3 = (EditText) getView().findViewById(R.id.edit_text_adjective_3);
        mVerbEdText = (EditText) getView().findViewById(R.id.edit_text_verb_ed);
        mBodyText = (EditText) getView().findViewById(R.id.edit_text_body);
        mVerbIngText = (EditText) getView().findViewById(R.id.edit_text_verb_ing);
        mRelativeText2 = (EditText) getView().findViewById(R.id.edit_text_relative_2);
        mNameText = (EditText) getView().findViewById(R.id.edit_text_name);
        mShowmeButton = (Button) getView().findViewById(R.id.button_showme);

        addTextWatchers();
        prepareButton();
    }

    private void prepareButton(){
        mShowmeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ResultActivity.class);

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
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean(FIELD + "Name", mNameText.getText().toString().equals("S"));
    }
}
