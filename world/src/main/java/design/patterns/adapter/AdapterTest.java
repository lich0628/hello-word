package design.patterns.adapter;

import design.patterns.adapter.tactic.BandPass;
import design.patterns.adapter.tactic.HighPass;
import design.patterns.adapter.tactic.LowPass;
import design.patterns.adapter.tactic.Waveform;
import design.patterns.tactic.Tactic;
import design.patterns.tactic.TacticTest;

public class AdapterTest extends TacticTest {

	public static void main(String[] args) {
		Tactic t = new Tactic();
		Waveform w = new Waveform();
		t.process(new FilterAdapter(new LowPass(1.0)), w);
		t.process(new FilterAdapter(new HighPass(2.0)), w);
		t.process(new FilterAdapter(new BandPass(1.0, 2.0)), w);
	}

}
