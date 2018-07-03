import de.tu_bs.isf.spl.instrument.Instrument;

public aspect Cello {
	pointcut addInstrument() : execution(String Instrument.getPattern());
	
	String around() : addInstrument() {
		return "cello";
	}
}
