# Music Visualiser Project

Name: Ishaan Rawat

Student Number: C18459302

## Instructions
- Fork this repository and use it a starter project for your assignment
- Create a new package named your student number and put all your code in this package.
- You should start by creating a subclass of ie.tudublin.Visual
- There is an example visualiser called MyVisual in the example package
- Check out the WaveForm and AudioBandsVisual for examples of how to call the Processing functions from other classes that are not subclasses of PApplet

# Description of the assignment
The goal for this assignment was create something you could enjoy looking at while listening to music. The main focus of this assigmnet was to create various different shapes/patterns that would alter their form in the precense of audio. The main source for my project are the previous programs we have created with Bryan. As someone who is a big fan of psychedelic themes such as concerts and festivals, I knew that this assignment would be fun to work on. I kept most thing particulary simple and my assignment consists of 3 different alterations of shapes/patterns. This assignment was created using Processing in Java. I have three files other than ones I was provided my Bryan (Main.java, MyVisual.java, VisualException.Java). These files are Trippy.java (Where all the main methods such as setup and draw reside), WaveForm.java (where the waveform drawing can be called from) and finally Bars.java (where the bar drawings can be retrieved).

# Instructions
The instructions for my program are relatively basic. When the code program is compiled, a black-screened console opens and the music starts playing. From here, the user can choose between three options. Pressing the '1' key will start my twirling design pattern. Pressing 2 will convey a waveform that reacts to the song's frequency. Finally pressing three will create bar-chart-like design which are made from rectangles. These rectangles will rise and decline in respect to the music playing.

# How it works
When the code is compiled, the music will start playing. By pressing the key '1', this will highlight my twirl-like designs. 
```Java
...  if(key =='1')
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
}
```
This will create the designs and the comments above will indicate what the process is behind the coding of each seperate line. I had tested the design with multiple colours and found that white was the best in highlighting the movement of the twirls. If the user chooses to press key '2', this will retrieve the waveform design from the Waveform.java file. 

```Java
public void render()
    {
        Trip.colorMode(PApplet.HSB);
        for(int i = 0 ; i < Trip.getAudioBuffer().size() ; i ++)
        {
            Trip.stroke(
                PApplet.map(i, 0, Trip.getAudioBuffer().size(), 0, 255)
                , 255
                , 255
            );

            Trip.line(cy, cy, i, cy + cy * Trip.getAudioBuffer().get(i));
        }
    }
```
Lastly, by pressing '3', the code for the reactive bars is displayed.

```Java
 public void bars()
    {
        float gap = Trip.width / (float) Trip.getBands().length;
        Trip.strokeWeight(0);
        for(int i = 0 ; i < Trip.getBands().length ; i++ )
        {
            Trip.fill(PApplet.map(i, 0, (100), 255, 255)
            , 255
            , 255
            );
            Trip.rect(i * gap, Trip.height, 50,-Trip.getSmoothedBands()[i]+8); 
        }
    }
    }
```
That is all to my instructions for the program.


# What I am most proud of in the assignment


This is a [hyperlink](http://bryanduggan.org)




This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table highlighting the different tasks of my program:

| Task no. | Goal |
|-----------|-----------|
|Task 1 | Creating twirl effect|
|Task 2| Modifying waveform effect |
|Task 3 | Creating reactive bars |


