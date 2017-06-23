package com.musictograph.main;

import javax.sound.sampled.LineUnavailableException;

import com.musictograph.gtm.audio.StdAudio;
import com.musictograph.gtm.audio.Tone;

public class ToneDriver {
	public static void main(String args[]) throws LineUnavailableException
	{
		for(int hz = 260; hz <= 490; hz+=15.5)
		{
	        double duration = .25;
	        double[] a = Tone.tone(hz, duration);
	        StdAudio.play(a);
		}
	}
}
