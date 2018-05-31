package de.tu_bs.isf.spl;

import java.util.List;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import org.jfugue.theory.ChordProgression;

import de.tu_bs.isf.spl.instrument.IInstrument;
import de.tu_bs.isf.spl.instrument.Violin;
import de.tu_bs.isf.spl.melody.IMelodyProducer;
import de.tu_bs.isf.spl.melody.PredefinedProducer;
import loader.PluginLoader;

public class MusicPlayer {

	public static void main(String[] args) {		
		List<IInstrument> instruments = PluginLoader.load(IInstrument.class);
		System.out.println(instruments);
		
//@		IInstrument instrument = new Violin();
		
		IMelodyProducer melody = new PredefinedProducer();
		
		//Pattern pattern = createPattern(instrument, melody);
		
		Player player = new Player();
		//player.play(pattern);
	}
	
	private static Pattern createPattern(IInstrument instrument, IMelodyProducer producer) {
		final String instrumentPattern = "V0 I[" + instrument.getPattern() + "] ";
	
		final Pattern melody = new Pattern(instrumentPattern + producer.getMelodyPattern()); 
		
//@		melody.setTempo(70);
		melody.setTempo(120);
		
		return melody;
	}

}
