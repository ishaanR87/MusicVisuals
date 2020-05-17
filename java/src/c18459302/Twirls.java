/*package c18459302;

import ddf.minim.*;
import processing.core.*;
import processing.core.PApplet;
import ddf.minim.analysis.FFT;


// This is an example of a visual that uses the audio bands
public class Twirls 
{
    MyVisual mv;
    //declare variables 
    float Twirl;// Main loop
    float SpeedOfTwirl;//Speed of the loop

    public Twirls(MyVisual mv)
    {
        this.mv = mv; 
    }

    public void Trippy()
    {
        Twirl += 0.006; //speed of twirls on screen

        fill(0,20);// fills rectangle black with droopy effect
        noStroke();
        rect(0, 0, width, height); //rectangle size is the width and height of screen
        translate(width/2, height/2);//this moves twirl to half the width, half the length (center of screen)
  
      
      for (int i = 0; i < getAudioBuffer().size(); i++) //increments through the length of the song
        {
          float angle = sin(i+(Twirl-2))*25;
          float Twist = sin(radians(i))*(Twirl/angle); //sin wave formed with each part of the song which accelerates with the speed 
  
          float CircleIncrease = getAudioBuffer().level() * 20; // The circles increase depending on the beat
          ellipse(i,i, CircleIncrease, CircleIncrease); //creates the circles in the twirls
          rotateZ((float) (Twirl*PI/3*0.08)); //how fast twirls rotate
  
          //fill( random(255), random(255), random(255), random(255)); //this is multicoloured twirls
          fill(255); //white to make it clearer 
        } 
  
            
         }
    }

*/
