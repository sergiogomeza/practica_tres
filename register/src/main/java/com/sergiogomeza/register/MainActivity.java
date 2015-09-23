package com.sergiogomeza.register;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText eName=(EditText)findViewById(R.id.eName);
        final EditText eLname=(EditText)findViewById(R.id.eLname);
        final EditText eId=(EditText)findViewById(R.id.eId);
        final RadioButton rMan=(RadioButton)findViewById(R.id.rMan);
        final RadioButton rWman=(RadioButton)findViewById(R.id.rWman);
        Button bAccept=(Button)findViewById(R.id.bAccept);
        final DatePicker dpBirth=(DatePicker)findViewById(R.id.dpBirth);
        final CheckBox cbFutbol=(CheckBox)findViewById(R.id.cbFutbol);
        final CheckBox cbLect=(CheckBox)findViewById(R.id.cbLect);
        final CheckBox cbNata=(CheckBox)findViewById(R.id.cbNata);
        final CheckBox cbVgame=(CheckBox)findViewById(R.id.cbVgame);
        final TextView tName=(TextView)findViewById(R.id.tName);
        final TextView tLname=(TextView)findViewById(R.id.tLname);
        final TextView tId=(TextView)findViewById(R.id.tId);
        final TextView tSex=(TextView)findViewById(R.id.tSex);
        final TextView tFnac=(TextView)findViewById(R.id.tFnac);
        final TextView tLnac=(TextView)findViewById(R.id.tLnac);
        final TextView tHobbies=(TextView)findViewById(R.id.tHobbies);
        final Spinner spBirth=(Spinner)findViewById(R.id.spBirth);

        bAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int year,month,day;
                String name,lname,ide,sex,place,hobbies=" ";
                name = eName.getText().toString();
                lname = eLname.getText().toString();
                ide = eId.getText().toString();
                if(rMan.isChecked()){
                    sex=getResources().getString(R.string.man);
                }else if(rWman.isChecked()){
                    sex=getResources().getString(R.string.woman);
                }else{
                    sex="Unknown";
                }
                year=dpBirth.getYear();
                month=dpBirth.getMonth();
                day=dpBirth.getDayOfMonth();
                place=spBirth.getSelectedItem().toString();
                if(cbFutbol.isChecked()){
                    hobbies=hobbies+"futbol. ";
                }if(cbLect.isChecked()){
                    hobbies=hobbies+"lectura. ";
                }if(cbNata.isChecked()){
                    hobbies=hobbies+"natacion. ";
                }if(cbVgame.isChecked()){
                    hobbies=hobbies+"videojuegos.";
                }
                tName.setText(name);
                tLname.setText(lname);
                tId.setText(ide);
                tSex.setText(sex);
                tFnac.setText(day+"/"+(month+1)+"/"+year);
                tLnac.setText(place);
                tHobbies.setText(hobbies);
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
