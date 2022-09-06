package bowling;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoreCalculatorShould {

	private final ScoreCalculator scoreCalculator = new ScoreCalculator();

	@ParameterizedTest
	@CsvSource({
			"'-1|-1|-1|-1|-1|-1|-1|-1|-1|-1||', 10",
			"'-2|-2|-2|-2|-2|-2|-2|-2|-2|-2||', 20",
			"'9-|9-|9-|9-|9-|9-|9-|9-|9-|9-||', 90",
			"'22|22|22|22|22|22|22|22|22|22||', 40"
	})
	void return_score_for_numbered_frames(String scoreCard, int score) {
		assertEquals(score, scoreCalculator.calculate(scoreCard));
	}

	@ParameterizedTest
	@CsvSource({
			"'5/|5/|5/|5/|5/|5/|5/|5/|5/|5/||5', 150"
	})
	void return_score_for_frames_including_a_spare(String scoreCard, int score) {
		assertEquals(score, scoreCalculator.calculate(scoreCard));
	}


}
