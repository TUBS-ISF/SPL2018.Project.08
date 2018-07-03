import de.tu_bs.isf.spl.tempo.*;

public aspect Allegro {
	pointcut addTempo() : execution(int Tempo.getTempo());

	int around() : addTempo() {
		return 130;
	}
}