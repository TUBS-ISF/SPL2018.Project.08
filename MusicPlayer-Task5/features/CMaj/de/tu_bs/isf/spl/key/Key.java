package de.tu_bs.isf.spl.key;

import org.jfugue.pattern.Pattern;

public class Key {
	public Pattern getMelodyInKey() {
		String melodyString = "Cq Dq Eq Fq | Gh Gh | Aq Aq Aq Aq | Gh Rh | Aq Aq Aq Aq | Gh Rh | Fq Fq Fq Fq | Eh Eh | Gq Gq Gq Gq | Ch";
		
		return new Pattern(melodyString);
	}
}
