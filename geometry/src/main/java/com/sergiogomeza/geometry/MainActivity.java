package com.sergiogomeza.geometry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RadioButton rCir=(RadioButton)findViewById(R.id.rCir);
        final RadioButton rCuad=(RadioButton)findViewById(R.id.rCuad);
        final RadioButton rRec=(RadioButton)findViewById(R.id.rRec);
        final RadioButton rTri=(RadioButton)findViewById(R.id.rTri);
        final EditText eAlt=(EditText)findViewById(R.id.eAlt);
        final EditText eBas=(EditText)findViewById(R.id.eBas);
        final EditText eRad=(EditText)findViewById(R.id.eRad);
        final EditText eLad=(EditText)findViewById(R.id.eLad);
        final TextView tAns=(TextView)findViewById(R.id.tAns);
        Button bCal=(Button)findViewById(R.id.bCal);
        bCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String other;
                double alt,bas,lad,rad,ans,tri,cuad,cir,rec;
                try{
                    other=eAlt.getText().toString();
                    alt=Double.parseDouble(other);
                }catch(Exception ex){
                    alt=0;
                }
                try{
                    other=eBas.getText().toString();
                    bas=Double.parseDouble(other);
                }catch(Exception ex){
                    bas=0;
                }
                try{
                    other=eLad.getText().toString();
                    lad=Double.parseDouble(other);
                }catch(Exception ex){
                    lad=0;
                }
                try{
                    other=eRad.getText().toString();
                    rad=Double.parseDouble(other);
                }catch(Exception ex){
                    rad=0;
                }
                if(rCir.isChecked()){
                    cir=3.1416*rad*rad;
                    tAns.setText(String.valueOf(cir));
                }if(rCuad.isChecked()){
                    cuad=(lad*lad);
                    tAns.setText(String.valueOf(cuad));
                }if(rRec.isChecked()){
                    rec=bas*alt;
                    tAns.setText(String.valueOf(rec));
                }if(rTri.isChecked()){
                    tri=(bas*alt)/2;
                    tAns.setText(String.valueOf(tri));
                }
                eAlt.setText("");
                eBas.setText("");
                eLad.setText("");
                eRad.setText("");

            }
        });
    }
    public void Ready(View view){
        final RadioButton rCir=(RadioButton)findViewById(R.id.rCir);
        final RadioButton rCuad=(RadioButton)findViewById(R.id.rCuad);
        final RadioButton rRec=(RadioButton)findViewById(R.id.rRec);
        final RadioButton rTri=(RadioButton)findViewById(R.id.rTri);
        final EditText eAlt=(EditText)findViewById(R.id.eAlt);
        final EditText eBas=(EditText)findViewById(R.id.eBas);
        final EditText eRad=(EditText)findViewById(R.id.eRad);
        final EditText eLad=(EditText)findViewById(R.id.eLad);

        if(rCir.isChecked()){
            eRad.setVisibility(View.VISIBLE);
            eLad.setVisibility(View.INVISIBLE);
            eBas.setVisibility(View.INVISIBLE);
            eAlt.setVisibility(View.INVISIBLE);
        }if(rCuad.isChecked()){
            eLad.setVisibility(View.VISIBLE);
            eRad.setVisibility(View.INVISIBLE);
            eBas.setVisibility(View.INVISIBLE);
            eAlt.setVisibility(View.INVISIBLE);
        }if(rRec.isChecked()){
            eBas.setVisibility(View.VISIBLE);
            eAlt.setVisibility(View.VISIBLE);
            eLad.setVisibility(View.INVISIBLE);
            eRad.setVisibility(View.INVISIBLE);
        }if(rTri.isChecked()){
            eBas.setVisibility(View.VISIBLE);
            eAlt.setVisibility(View.VISIBLE);
            eLad.setVisibility(View.INVISIBLE);
            eRad.setVisibility(View.INVISIBLE);
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
