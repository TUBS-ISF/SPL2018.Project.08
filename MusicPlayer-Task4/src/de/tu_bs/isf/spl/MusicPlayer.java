package de.tu_bs.isf.spl;

import java.util.List;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

import de.tu_bs.isf.spl.instrument.IInstrument;
import de.tu_bs.isf.spl.melody.IMelodyProducer;
import de.tu_bs.isf.spl.melody.PredefinedProducer;
import de.tu_bs.isf.spl.tempo.ITempo;
import loader.PluginLoader;

public class MusicPlayer {

	public static void main(String[] args) {		
		List<IInstrument> instruments = PluginLoader.load(IInstrument.class);
		IInstrument actualInstrument = instruments.get(0);
		
//@		IInstrument instrument = new Violin();
		
		IMelodyProducer melody = new PredefinedProducer();
		
		Pattern pattern = createPattern(actualInstrument, melody);
		
		Player player = new Player();
		player.play(pattern);
	}
	
	private static Pattern createPattern(IInstrument instrument, IMelodyProducer producer) {
		final String instrumentPattern = "V0 I[" + instrument.getPattern() + "] ";
	
		final Pattern melody = new Pattern(instrumentPattern + producer.getMelodyPattern()); 
		
		List<ITempo> tempo = PluginLoader.load(ITempo.class);
		ITempo actualTempo = tempo.get(0);
		
		melody.setTempo(actualTempo.getTempo());
		
		return melody;
	}

}
