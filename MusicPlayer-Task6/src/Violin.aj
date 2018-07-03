import de.tu_bs.isf.spl.instrument.Instrument;

public aspect Violin {
	pointcut addViolin() : execution(String Instrument.getPattern());
	
	String around() : addViolin() {
		return "violin";
	}
}
