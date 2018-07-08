import de.tu_bs.isf.spl.key.*;

import org.jfugue.pattern.*;

public aspect GMaj {
	pointcut getKey() : execution(Pattern Key.getMelodyInKey());
	
	Pattern around() : getKey() {
		String melodyString = "Gq Aq Bq Cq | Dh Dh | Eq Eq Eq Eq | Dh Rh | Eq Eq Eq Eq | Dh Rh | Cq Cq Cq Cq | Bh Bh | Cq Cq Cq Cq | Gh";
		
		return new Pattern(melodyString);
	}
}
