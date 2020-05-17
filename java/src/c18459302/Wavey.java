package c18459302;


import processing.core.*;

// This is an example of a visual that renders the waveform
public class Wavey
{
    Trippy Trip;
    float cy = 0;

    public Wavey(final Trippy Trip)
    {
        this.Trip = Trip;
    }

    public void bars()
    {
        float gap = Trip.width / (float) Trip.getBands().length;
        Trip.strokeWeight(5);
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