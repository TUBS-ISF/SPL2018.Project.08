import de.tu_bs.isf.spl.instrument.IInstrument;

public class Violin implements IInstrument {

	public Violin() {
		
	}
	
	@Override
	public String getPattern() {
		return "violin";
	}

}
