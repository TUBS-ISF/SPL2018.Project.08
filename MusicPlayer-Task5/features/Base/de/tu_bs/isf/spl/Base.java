package de.tu_bs.isf.spl;

import java.util.List;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

import de.tu_bs.isf.spl.instrument.Instrument;
import de.tu_bs.isf.spl.instrument.IInstrument;
import de.tu_bs.isf.spl.melody.IMelodyProducer;
import de.tu_bs.isf.spl.melody.PredefinedProducer;
import de.tu_bs.isf.spl.tempo.ITempo;
import de.tu_bs.isf.spl.tempo.Tempo;

public class Base {
	public static void main(String[] args) {				
		IInstrument instrument = new Instrument();
		
		IMelodyProducer melody = new PredefinedProducer();
		
		Pattern pattern = createPattern(instrument, melody);
		
		Player player = new Player();
		player.play(pattern);
	}
	
	private static Pattern createPattern(IInstrument instrument, IMelodyProducer producer) {
		final String instrumentPattern = "V0 I[" + instrument.getPattern() + "] ";
	
		final Pattern melody = new Pattern(instrumentPattern + producer.getMelodyPattern()); 
		
		Tempo tempo = new Tempo();
		melody.setTempo(tempo.getTempo());
		
		return melody;
	}
}
