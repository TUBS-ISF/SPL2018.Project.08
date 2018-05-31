package de.tu_bs.isf.spl.melody;

public class PredefinedProducer implements IMelodyProducer {

	public PredefinedProducer() {
	}
	
	@Override
	public String getMelodyPattern() {
		return "Dq Eq Fq Gq | Ah Ah | Bq Bq Bq Bq | Ah Rh | Bq Bq Bq Bq | Ah Rh | Gq Gq Gq Gq | Fh Fh | Aq Aq Aq Aq | Dh";
	}

}
