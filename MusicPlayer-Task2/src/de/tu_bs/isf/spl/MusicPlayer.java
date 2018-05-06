package de.tu_bs.isf.spl;

import org.jfugue.player.Player;

import de.tu_bs.isf.spl.instrument.IInstrument;
import de.tu_bs.isf.spl.instrument.Piano;
import de.tu_bs.isf.spl.instrument.Violin;
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
		
		String pattern = createPattern(instrument);
		
		Player player = new Player();
		player.play(pattern);
	}
	
	private static String createPattern(IInstrument instrument) {
		final String instrumentPattern = "V0 I[" + instrument.getPattern() + "] ";
	
		
		return instrumentPattern + "Dq Eq Fq Gq | Ah Ah | Bq Bq Bq Bq | Ah Rh | Bq Bq Bq Bq | Ah Rh | Gq Gq Gq Gq | Fh Fh | Aq Aq Aq Aq | Dh";
	}

}
