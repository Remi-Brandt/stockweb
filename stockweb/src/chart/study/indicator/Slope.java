package chart.study.indicator;

import java.util.List;

/**
 * @author: Humberto Rocha Loureiro (humbertorocha@gmail.com)
 * @modify: 
 */

/**
 * Slope of any indicator
 */
public class Slope extends Indicator {
	private final int lookBackBars;

	public Slope(Indicator parent, int lookBackBars) {
		super(parent);
		this.lookBackBars = lookBackBars;
	}

	@Override
	public double calculate() {
		List<IndicatorValue> indicatorHistory = parent.getHistory();
		int barNow = indicatorHistory.size() - 1;
		int barThen = indicatorHistory.size() - 1 - lookBackBars;

		double valueNow = indicatorHistory.get(barNow).getValue();
		double valueThen = indicatorHistory.get(barThen).getValue();

		value = (valueNow - valueThen) / lookBackBars;
		return value;
	}
}
