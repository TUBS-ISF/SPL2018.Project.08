package de.tu_bs.isf.spl;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import org.jfugue.theory.ChordProgression;

import de.tu_bs.isf.spl.instrument.IInstrument;
import de.tu_bs.isf.spl.instrument.Piano;
import de.tu_bs.isf.spl.instrument.Violin;
import de.tu_bs.isf.spl.melody.IMelodyProducer;
import de.tu_bs.isf.spl.melody.PredefinedProducer;

public class MusicPlayer {

	public static void main(String[] args) {		
		//#ifdef Piano
		IInstrument instrument = new Piano();
		//#endif
		//#ifdef Violin
//@		IInstrument instrument = new Violin();
		//#endif
		
		IMelodyProducer melody = new PredefinedProducer();
		
		Pattern pattern = createPattern(instrument, melody);
		
		Player player = new Player();
		player.play(pattern);
	}
	
	private static Pattern createPattern(IInstrument instrument, IMelodyProducer producer) {
		final String instrumentPattern = "V0 I[" + instrument.getPattern() + "] ";
	
		final Pattern melody = new Pattern(instrumentPattern + producer.getMelodyPattern()); 
		
		//#ifdef Andante
//@		melody.setTempo(70);
		//#endif
		//#ifdef Allegro
		melody.setTempo(120);
		//#endif
		
		return melody;
	}

}
