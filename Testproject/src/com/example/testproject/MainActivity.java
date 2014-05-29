package com.example.testproject;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.ImageView;
import android.widget.TextView;
//import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

	public final static String TAG = "Frenesius";
	

    //textview met de naam van de bar
	TextView socialAbility;
	TextView health;
	TextView fitnessAbility;
	TextView walkAbility;
	TextView planToDo;
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //textviews buiten methods, om de bar te benoemen.
        socialAbility = (TextView) findViewById(R.id.socialabilityTextView);
        health = (TextView) findViewById(R.id.healthTextView);
        fitnessAbility = (TextView) findViewById(R.id.fitnessabilityTextView);
        walkAbility = (TextView) findViewById(R.id.walkabilityTextView);
        
       
	       new ProgressLife();
        

   }
	     
}