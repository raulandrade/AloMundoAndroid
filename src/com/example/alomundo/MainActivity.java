package com.example.alomundo;

import android.R.id;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.os.Build;

public class MainActivity extends ActionBarActivity {
	private Button button;
    private EditText test;
    String nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	   	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //button= (Button)findViewById(editText1);
        //AlertDialog.Builder msg = new AlertDialog.Builder(this);
        
        
//        button = (Button) findViewById(id.button1);
        test = (EditText) findViewById(id.text2);
        //nome.setOnClickListener(this);
    }
    
    public void evento (View view){
    	AlertDialog.Builder msg = new AlertDialog.Builder(this);
    	 msg.setTitle("Oi ");
    	 msg.setMessage(this.test.getText().toString());
    	 msg.setNeutralButton("Sair", null);
         msg.show();
    	
    }
   

}
