package c18459302;

import ie.tudublin.Visual;
import ddf.minim.*;



public class Trippy extends Visual
{
  //declare variables 
  float Twirl1;// Main loop
  float Twirl2;
  float Twirl3;
  float SpeedOfTwirl;//Speed of the loop
  AudioPlayer Song;//The song needed for iteration for elipses

  public void settings()
  {
      size(800, 800, P3D);
      println("CWD: " + System.getProperty("user.dir"));
      //fullScreen(P3D, SPAN);
  }

  public void keyPressed()
  {
      if (key == ' ')
      {
          getAudioPlayer().cue(0);
          getAudioPlayer().play();
          
      }
  }

  public void setup()
  {
      colorMode(HSB);
      noCursor();
      
      setFrameSize(256);

      Minim minim = new Minim(this);
      Song = minim.loadFile("NoTime.mp3"); //song variable now contains the song
      Song.play(); //play function plays song
      //startListening(); 
  }
  public void draw()
  {
    fill(0);// fills rectangle black
    noStroke();
    rect(0, 0, width, height); //rectangle size is the width and height of screen
    translate(width/2, height/2);//this allows the centra

    
    for (int i = 0; i < Song.bufferSize()- 1; i++) //increments through the length of the song
    {
      float angle = sin(i+(Twirl1-3))*30;
      float x = sin(radians(i))*(Twirl1/angle);

      float leftLevel = Song.left.level() * 20;
      ellipse(i,i, leftLevel, leftLevel);
      rotateZ((float) (Twirl1*PI/3*0.05));

      //fill( random(255), random(255), random(255), random(255));
      fill(255);
      
    
    }   

    
  

    Twirl1 += 0.2;
    Twirl2 += SpeedOfTwirl;
    Twirl3 += SpeedOfTwirl;

  }
}


