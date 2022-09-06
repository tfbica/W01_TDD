package bowling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoreCalculatorShould {

	private final ScoreCalculator scoreCalculator = new ScoreCalculator();

	@Test
	void return_10_when_just_one_hit_on_every_frame() {
		String scoreCard = "-1|-1|-1|-1|-1|-1|-1|-1|-1|-1||";
		assertEquals(10, scoreCalculator.calculate(scoreCard));
	}

	@Test
	void return_20_when_just_one_hit_two_every_frame() {
        String scoreCard = "-2|-2|-2|-2|-2|-2|-2|-2|-2|-2||";
        assertEquals(20, scoreCalculator.calculate(scoreCard));
	}

	@Test
	void return_40_when_two_pins_hit_per_turn() {
        String scoreCard = "22|22|22|22|22|22|22|22|22|22||";
        assertEquals(40, scoreCalculator.calculate(scoreCard));
	}

}
