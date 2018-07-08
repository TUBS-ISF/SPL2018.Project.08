import de.tu_bs.isf.spl.key.*;

import org.jfugue.pattern.*;

public aspect FMaj {
	pointcut getKey() : execution(Pattern Key.getMelodyInKey());
	
	Pattern around() : getKey() {
		String melodyString = "Fq Gq Aq Bbq | Ch Ch | Dq Dq Dq Dq | Ch Rh | Dq Dq Dq Dq | Ch Rh | Bbq Bbq Bbq Bbq | Ah Ah | Bbq Bbq Bbq Bbq | Fh";
		
		return new Pattern(melodyString);
	}
}
