package com.example.testproject;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class ProgressLife extends MainActivity {
	
	

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
	
	
	//de foto's van de bars
	ImageView barLevelSocial;
	ImageView barLevelHealth;
	ImageView barLevelFitness;
	ImageView barLevelWalk;
	

	
	//de tekstveld met levels
	EditText lvlSocial;
	EditText lvlHealth;
	EditText lvlFitness;
	EditText lvlWalk;
	

	

    
    public void socialButton() {
    	final ImageView barLevelSocial = (ImageView) findViewById(R.id.progressBar1);
    	final EditText socialCounter = (EditText) findViewById(R.id.socialLevelCountEditText);
    	final EditText lvlSocial = (EditText) findViewById(R.id.levelSocialEditText);
        final Button socialBut = (Button) findViewById(R.id.socialButton);
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
				
				Toast.makeText(ProgressLife.this, "Great job!", Toast.LENGTH_LONG).show();
			}
			});
    }
    
    
    public void healthButton() {
    	final ImageView barLevelHealth = (ImageView) findViewById(R.id.progressBar2);
    	final EditText healthCounter = (EditText) findViewById(R.id.healthLevelCountEditText);
    	final EditText lvlHealth = (EditText) findViewById(R.id.levelHealthEditText);
        final Button healthBut = (Button) findViewById(R.id.healthButton);
        
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
    }
    
    
    
    public void fitnessButton() {
       final ImageView barLevelFitness = (ImageView) findViewById(R.id.progressBar3);
       final EditText fitnessCounter = (EditText) findViewById(R.id.fitnessLevelCountEditText);
       final EditText lvlFitness = (EditText) findViewById(R.id.levelFitnessEditText);
       final Button fitnessBut = (Button) findViewById(R.id.fitnessButton);
    	
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
    }
    
    
    public void walkButton() {
      final ImageView barLevelWalk = (ImageView) findViewById(R.id.progressBar4);
      final EditText walkCounter = (EditText) findViewById(R.id.walkLevelCountEditText);
      final EditText lvlWalk = (EditText) findViewById(R.id.levelWalkEditText);
      final Button  walkBut = (Button) findViewById(R.id.walkButton);
        
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
}
