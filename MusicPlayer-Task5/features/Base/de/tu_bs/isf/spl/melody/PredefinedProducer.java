package de.tu_bs.isf.spl.melody;

import java.util.List;

import org.jfugue.pattern.Pattern;

import de.tu_bs.isf.spl.key.IKey;
import de.tu_bs.isf.spl.key.Key;

public class PredefinedProducer implements IMelodyProducer {

	public PredefinedProducer() {
	}
	
	@Override
	public String getMelodyPattern() {	
		Key key = new Key();
		
		Pattern melody = key.getMelodyInKey();
		return melody.toString();
		
		//return "Dq Eq Fq Gq | Ah Ah | Bq Bq Bq Bq | Ah Rh | Bq Bq Bq Bq | Ah Rh | Gq Gq Gq Gq | Fh Fh | Aq Aq Aq Aq | Dh";
	}

}
