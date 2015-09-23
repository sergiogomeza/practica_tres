package com.sergiogomeza.nclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tMessage=(TextView)findViewById(R.id.tMessage);
        final TextView tNota=(TextView)findViewById(R.id.tNota);
        Button bCal=(Button)findViewById(R.id.bCal);
        final EditText eQuiz= (EditText)findViewById(R.id.eQuiz);
        final EditText eExpo= (EditText)findViewById(R.id.eExpo);
        final EditText eLab= (EditText)findViewById(R.id.eLab);
        final EditText ePfinal= (EditText)findViewById(R.id.ePfinal);
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
