package com.sergiogomeza.operation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText eNum1 = (EditText) findViewById(R.id.eNum1);
        final EditText eNum2 = (EditText) findViewById(R.id.eNum2);
        Button accept = (Button) findViewById(R.id.accept);
        final TextView ans = (TextView) findViewById(R.id.ans);
        final RadioButton op1 = (RadioButton) findViewById(R.id.op1);
        final RadioButton op2 = (RadioButton) findViewById(R.id.op2);
        final RadioButton op3 = (RadioButton) findViewById(R.id.op3);
        final RadioButton op4 = (RadioButton) findViewById(R.id.op4);
        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a=0,b=0,r=0;
                String other;
                try {
                    other = eNum1.getText().toString();
                    a = Double.parseDouble(other);
                }catch(Exception ex){
                    a=0;
                }
                try {
                    other = eNum2.getText().toString();
                    b = Double.parseDouble(other);
                }catch(Exception ex){
                    b=0;
                }
                if(op1.isChecked()){
                    r=a+b;
                }else if(op2.isChecked()){
                    r=a-b;
                }else if(op3.isChecked()){
                    r=a*b;
                }else if(op4.isChecked()){
                    r=a/b;
                }else {
                    r=0;
                }
                ans.setText(String.valueOf(r));
            }
        });
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
