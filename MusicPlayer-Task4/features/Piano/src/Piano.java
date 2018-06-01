import de.tu_bs.isf.spl.instrument.IInstrument;

public class Piano implements IInstrument {

	public Piano() {
		
	}
	
	@Override
	public String getPattern() {
		return "piano";
	}

}
