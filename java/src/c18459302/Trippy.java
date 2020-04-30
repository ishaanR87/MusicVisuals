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
}

