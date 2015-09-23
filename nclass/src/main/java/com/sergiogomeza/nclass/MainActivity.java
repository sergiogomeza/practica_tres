package com.sergiogomeza.nclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
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
        bCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int flag=0;
                double quiz,expo,lab,pfinal,nota=0;
                String other;
                try{
                    other=eQuiz.getText().toString();
                    quiz=Double.parseDouble(other);
                    if(quiz>5){
                        flag++;
                        quiz=0;
                    }
                }catch(Exception ex){
                    quiz=0;
                }
                try{
                    other=eExpo.getText().toString();
                    expo = Double.parseDouble(other);
                    if(expo>5){
                        flag++;
                        expo=0;
                    }
                }catch(Exception ex){
                    expo=0;
                }
                try{
                    other=eLab.getText().toString();
                    lab = Double.parseDouble(other);
                    if(lab>5){
                        flag++;
                        lab=0;
                    }
                }catch(Exception ex){
                    lab=0;
                }
                try{
                    other=ePfinal.getText().toString();
                    pfinal=Double.parseDouble(other);
                    if(pfinal>5){
                        flag++;
                        pfinal=0;
                    }
                }catch(Exception ex){
                    pfinal=0;
                }
                if(flag==0) {
                    nota = (quiz * 0.15) + (expo * 0.1) + (lab * 0.4) + (pfinal * 0.35);
                    tNota.setText(String.valueOf(nota));
                    if (nota < 3) {
                        tMessage.setText(getResources().getString(R.string.Lose));
                    } else if (nota >= 3 && nota < 4) {
                        tMessage.setText(getResources().getString(R.string.Win));
                    } else if (nota >= 4 && nota <= 5) {
                        tMessage.setText(getResources().getString(R.string.Excelent));
                    }
                }else{
                    tMessage.setText(getResources().getString(R.string.Error));
                    flag=0;
                }
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
