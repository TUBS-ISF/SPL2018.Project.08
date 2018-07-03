import de.tu_bs.isf.spl.tempo.*;

public aspect Andante {
	pointcut addTempo() : execution(int Tempo.getTempo());

	int around() : addTempo() {
		return 80;
	}
}