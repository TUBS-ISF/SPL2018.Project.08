package de.tu_bs.isf.spl.key;

import org.jfugue.pattern.Pattern;

public class Key {
	public Pattern getMelodyInKey() {
		String melodyString = "Dq Eq Fq Gq | Ah Ah | Bq Bq Bq Bq | Ah Rh | Bq Bq Bq Bq | Ah Rh | Gq Gq Gq Gq | Fh Fh | Aq Aq Aq Aq | Dh";
		
		return new Pattern(melodyString);
	}
}
