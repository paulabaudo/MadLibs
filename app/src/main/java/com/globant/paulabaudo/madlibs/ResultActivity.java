package com.globant.paulabaudo.madlibs;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class ResultActivity extends ActionBarActivity {

    TextView mResultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        init();
    }

    private void init(){
        mResultText = (TextView) findViewById(R.id.text_view_result);
        Intent intentResult = getIntent();
        Bundle extras = intentResult.getExtras();
        String result = extras.get("relative").toString() + " - " +
                extras.get("adjective").toString() + " - " +
                extras.get("adjective2").toString() + " - " +
                extras.get("nameroom").toString() + " - " +
                extras.get("adjective3").toString() + " - " +
                extras.get("verbed").toString() + " - " +
                extras.get("body").toString() + " - " +
                extras.get("verbing").toString() + " - " +
                extras.get("relative2").toString() + " - " +
                extras.get("name").toString();

        mResultText.setText(result);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_result, menu);
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
