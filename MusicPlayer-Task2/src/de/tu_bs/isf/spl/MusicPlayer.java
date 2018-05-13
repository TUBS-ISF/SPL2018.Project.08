package de.tu_bs.isf.spl;

import org.jfugue.player.Player;

import de.tu_bs.isf.spl.instrument.IInstrument;
import de.tu_bs.isf.spl.instrument.Piano;
import de.tu_bs.isf.spl.instrument.Violin;
import de.tu_bs.isf.spl.melody.IMelodyProducer;
import de.tu_bs.isf.spl.melody.PredefinedProducer;
import properties.PropertyManager;

public class MusicPlayer {

	public static void main(String[] args) {		
		IInstrument instrument = new Piano();
		
		if(PropertyManager.getProperty("Piano")) {
			instrument = new Piano();
		}
		if(PropertyManager.getProperty("Violin")) {
			instrument = new Violin();
		}
		
		IMelodyProducer melody = new PredefinedProducer();
		
		String pattern = createPattern(instrument, melody);
		
		Player player = new Player();
		player.play(pattern);
	}
	
	private static String createPattern(IInstrument instrument, IMelodyProducer producer) {
		final String instrumentPattern = "V0 I[" + instrument.getPattern() + "] ";
	
		
		return instrumentPattern + producer.getMelodyPattern();
	}

}
