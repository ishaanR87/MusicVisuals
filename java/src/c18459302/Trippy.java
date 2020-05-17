
package c18459302;

import ie.tudublin.*;



public class Trippy extends Visual
{
  
  WaveForm wf;
  Bars bar;
  float Twirl;// Main loop
  float SpeedOfTwirl;//Speed of the loop


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
      startMinim();

      loadAudio("NoTime.mp3"); //loads song
      getAudioPlayer().play(); //plays song
      //startListening(); 
      wf = new WaveForm(this);
      bar = new Bars(this);

  }
  
  public void draw()
  {

    background(0);

        try
        {
            // Call this if you want to use FFT data
            calculateFFT(); 
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
        // Call this is you want to use frequency bands
        calculateFrequencyBands(); 

        // Call this is you want to get the average amplitude
        calculateAverageAmplitude();     

        if(key =='1')
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
  
          float CircleIncrease = getAudioBuffer().level() * 20; // The circles increase depending onthe beat
          ellipse(i,i, CircleIncrease, CircleIncrease); //creates the circles in the twirls
          rotateZ((float) (Twirl*PI/3*0.08)); //how fast twirls rotate
  
          //fill( random(255), random(255), random(255), random(255)); //this is multicoloured twirls
          fill(255); //white to make it clearer 
        } 
  
      }

      if(key == '2') // if 2 is pressed
      {
        wf.render(); // render method in Waveform is called
      }

      if(key == '3') //if 3 is pressed
      {
        bar.bars(); //bars method in Bars file is called
      }

  
  }
}



