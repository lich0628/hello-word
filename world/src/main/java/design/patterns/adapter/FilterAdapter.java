package design.patterns.adapter;

import design.patterns.adapter.tactic.Filter;
import design.patterns.adapter.tactic.Waveform;
import design.patterns.tactic.Processor;

/**
 * 适配器
 * 
 * @author Administrator
 *
 */
public class FilterAdapter implements Processor {

	Filter filter;

	public FilterAdapter(Filter filter) {
		this.filter = filter;
	}

	@Override
	public String name() {
		return filter.name();
	}

	@Override
	public Waveform process(Object input) {
		return filter.process((Waveform) input);
	}

}
