package de.tu_bs.isf.spl.melody;

import java.util.List;

import org.jfugue.pattern.Pattern;

import de.tu_bs.isf.spl.key.IKey;
import loader.PluginLoader;

public class PredefinedProducer implements IMelodyProducer {

	public PredefinedProducer() {
	}
	
	@Override
	public String getMelodyPattern() {
		List<IKey> keys = PluginLoader.load(IKey.class);
		IKey actualKey = keys.get(0);
		
		Pattern melody = actualKey.getMelodyInKey();
		return melody.toString();
		
		//return "Dq Eq Fq Gq | Ah Ah | Bq Bq Bq Bq | Ah Rh | Bq Bq Bq Bq | Ah Rh | Gq Gq Gq Gq | Fh Fh | Aq Aq Aq Aq | Dh";
	}

}
