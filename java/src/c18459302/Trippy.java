package c18459302;

import ie.tudublin.Visual;
import ddf.minim.*;



public class Trippy extends Visual
{
  //declare variables 
  float Twirl;// Main loop
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
    Twirl += 0.006; //speed of twirls on screen

    fill(0,20);// fills rectangle black with droopy effect
    noStroke();
    rect(0, 0, width, height); //rectangle size is the width and height of screen
    translate(width/2, height/2);//this moves twirl to half the width, half the length (center of screen)

    
    for (int i = 0; i < Song.bufferSize(); i++) //increments through the length of the song
    {
      float angle = sin(i+(Twirl-2))*25;
      float Twist = sin(radians(i))*(Twirl/angle); //sin wave formed with each part of the song which accelerates with the speed 

      float leftLevel = Song.left.level() * 20;
      ellipse(i,i, leftLevel, leftLevel); //creates the circles in the twirls
      rotateZ((float) (Twirl*PI/3*0.08)); //how fast twirls rotate

      //fill( random(255), random(255), random(255), random(255)); //this is multicoloured twirls
      fill(255); //purple colour
    } 
  }
}

