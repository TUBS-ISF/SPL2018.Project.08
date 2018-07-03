

import de.tu_bs.isf.spl.instrument.Instrument;

public aspect Piano {
	pointcut addInstrument() : execution(String Instrument.getPattern());
	
	String around() : addInstrument() {
		return "piano";
	}
}
