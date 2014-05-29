package com.example.testproject;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

	public final static String TAG = "Frenesius";
	
	//progressie
	private int levelProgress1 = 0;
	private int levelProgress2 = 0;
	private int levelProgress3 = 0;
	private int levelProgress4 = 0;
	
	//de counter omzetten naar een string (zie code)
	String stringCounter1;
	String stringCounter2;
	String stringCounter3;
	String stringCounter4;
	
	//tekstveld met de counter op
	EditText socialCounter;
	EditText healthCounter;
	EditText fitnessCounter;
	EditText walkCounter;
	
	
	//nummering van de ImageView foto's
	private int levelColor1 = 0;
	private int levelColor2 = 0;
	private int levelColor3 = 0;
	private int levelColor4 = 0;
	
	//array met de foto's (bars)
	private int[] barSocialLevelColor = new int[] {			
			R.drawable.bar1_rood,
			R.drawable.bar1_geel,
			R.drawable.bar1_groen		
	};
	

	//array met de foto's (bars)
	private int[] barHealthLevelColor = new int[] {	
			R.drawable.bar1_rood,
			R.drawable.bar1_geel,
			R.drawable.bar1_groen		
	};

	//array met de foto's (bars)
	private int[] barFitnessLevelColor = new int[] {		
			R.drawable.bar1_rood,
			R.drawable.bar1_geel,
			R.drawable.bar1_groen
	};

	//array met de foto's (bars)
	private int[] barWalkLevelColor = new int[] {
			R.drawable.bar1_rood,
			R.drawable.bar1_geel,
			R.drawable.bar1_groen
	};

	//counter voor de levels
    public int socialLvlCounter = 0;
    public int healthLvlCounter = 0;
    public int fitnessLvlCounter = 0;
    public int walkLvlCounter = 0;
    
	//de counter omzetten naar een string (zie code)
    String socialLevelStrCounter;
    String healthLevelStrCounter;
    String fitnessLevelStrCounter;
    String walkLevelStrCounter;
	
    //textview met de naam van de bar
	TextView socialAbility;
	TextView health;
	TextView fitnessAbility;
	TextView walkAbility;
	TextView planToDo;
	
	//de foto's van de bars
	ImageView barLevelSocial;
	ImageView barLevelHealth;
	ImageView barLevelFitness;
	ImageView barLevelWalk;
	
	//knop voor de activiteiten.
	Button socialBut;
	Button healthBut;
	Button fitnessBut;
	Button walkBut;
	
	//de tekstveld met levels
	EditText lvlSocial;
	EditText lvlHealth;
	EditText lvlFitness;
	EditText lvlWalk;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        socialAbility = (TextView) findViewById(R.id.socialabilityTextView);
        health = (TextView) findViewById(R.id.healthTextView);
        fitnessAbility = (TextView) findViewById(R.id.fitnessabilityTextView);
        walkAbility = (TextView) findViewById(R.id.walkabilityTextView);
        
        barLevelSocial = (ImageView) findViewById(R.id.progressBar1);
        barLevelHealth = (ImageView) findViewById(R.id.progressBar2);
        barLevelFitness = (ImageView) findViewById(R.id.progressBar3);
        barLevelWalk = (ImageView) findViewById(R.id.progressBar4);
        
        socialCounter = (EditText) findViewById(R.id.socialLevelCountEditText);
        healthCounter = (EditText) findViewById(R.id.healthLevelCountEditText);
        fitnessCounter = (EditText) findViewById(R.id.fitnessLevelCountEditText);
        walkCounter = (EditText) findViewById(R.id.walkLevelCountEditText);
        
        lvlSocial = (EditText) findViewById(R.id.levelSocialEditText);
        lvlHealth = (EditText) findViewById(R.id.levelHealthEditText);
        lvlFitness = (EditText) findViewById(R.id.levelFitnessEditText);
        lvlWalk = (EditText) findViewById(R.id.levelWalkEditText);
        
        socialBut = (Button) findViewById(R.id.socialButton);
        healthBut = (Button) findViewById(R.id.healthButton);
        fitnessBut = (Button) findViewById(R.id.fitnessButton);
        walkBut = (Button) findViewById(R.id.walkButton);
        
        //button setOnClickListener
        socialBut.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				//als knop geklikt is, gaat de progress met +10 erbij, wordt dat ook omgezet in tekstveld
					if (v == socialBut) {
						levelProgress1 += 10;
						stringCounter1 = Integer.toString(levelProgress1);
						socialCounter.setText(stringCounter1);				
					}
					//de barfoto verandert om de 50 punten die erbij komt.
					if (levelProgress1 % 50 == 0) {				
						levelColor1 += 1;			
					}
					
					//als de bar bij de 3e foto verder komt, begint die weer bij de 1e.
					if (levelColor1 > 2) {					
						levelColor1 = 0;						
					}
					
	//om de 50 punten die bij de progressie erbij komt, gaat de level counter met 1 omhoog, en wordt het in de tekstveld omgezet en in een string aangegeven.
					if (levelProgress1 % 50 == 0) {
						socialLvlCounter += 1;
						socialLevelStrCounter = Integer.toString(socialLvlCounter);
						lvlSocial.setText(socialLevelStrCounter);	
					}
				//pakt de imageresource en gaat door de array en pakt de foto's	
				barLevelSocial.setImageResource(barSocialLevelColor[levelColor1]);
			}
			});
			
        
	        healthBut.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					//als knop geklikt is, gaat de progress met +10 erbij, wordt dat ook omgezet in tekstveld
					if (v == healthBut) {					
						
						levelProgress2 += 10;
						stringCounter2 = Integer.toString(levelProgress2);
						healthCounter.setText(stringCounter2);						
					}			
					
					//
					if (levelProgress2 % 50 == 0) {					
						levelColor2 += 1;			
					}
					
					if (levelColor2 > 2) {						
						levelColor2 = 0;						
					}					
					
					if (levelProgress2 % 50 == 0) {

						healthLvlCounter += 1;
						healthLevelStrCounter = Integer.toString(healthLvlCounter);
						lvlHealth.setText(healthLevelStrCounter);	
					}
					
					barLevelHealth.setImageResource(barHealthLevelColor[levelColor2]);
	         		
	         		
				}
				});
	        
	        
	        fitnessBut.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					
							if (v == fitnessBut) {
								levelProgress3 += 10;
								stringCounter3 = Integer.toString(levelProgress3);
								fitnessCounter.setText(stringCounter3);
							}
							
							if (levelProgress3 % 50 == 0) {
								levelColor3 += 1;				
							}
							
							if (levelColor3 > 2) {					
								levelColor3 = 0;					
							}
							
							if (levelProgress3 % 50 == 0) {
								
								fitnessLvlCounter += 1;
								fitnessLevelStrCounter = Integer.toString(fitnessLvlCounter);
								lvlFitness.setText(fitnessLevelStrCounter);	
							}
							
					barLevelFitness.setImageResource(barFitnessLevelColor[levelColor3]);
					}
				});
	        
	        		        
	        walkBut.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					
							if (v == walkBut) {
								levelProgress4 += 10;
								stringCounter4 = Integer.toString(levelProgress4);
								walkCounter.setText(stringCounter4);						
							}
							
							if (levelProgress4 % 50 == 0) {					
								levelColor4 += 1;				
							}
							
							if (levelColor4 > 2) {						
								levelColor4 = 0;				
							}
							
							if (levelProgress4 % 50 == 0) {								
								walkLvlCounter += 1;
								walkLevelStrCounter = Integer.toString(walkLvlCounter);
								lvlWalk.setText(walkLevelStrCounter);	
							}
					
					barLevelWalk.setImageResource(barWalkLevelColor[levelColor4]);
					
					}
				});
    		}
	     
        
    
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}