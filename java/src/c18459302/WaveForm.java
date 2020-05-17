package c18459302;

import processing.core.*;

// This is an example of a visual that renders the waveform
public class WaveForm 
{
    Trippy Trip;
    float cy = 0;

    public WaveForm(Trippy trippy)
    {
        this.Trip= trippy;
        cy = this.Trip.height / 2;
    }

    public void render()
    {
    
        for(int i = 0 ; i < Trip.getAudioBuffer().size() ; i ++)
        {
            Trip.stroke(
                PApplet.map(i, 0, Trip.getAudioBuffer().size(), 0, 255)
                , 255
                , 255
            );

            Trip.line(i, cy, i, cy + cy * Trip.getAudioBuffer().get(i));
        }
    }
}