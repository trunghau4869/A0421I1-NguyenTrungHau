package Bai8_cleancode_and_refactoring.bai_tap.refactoring;

import org.junit.jupiter.api.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TennisGameTest {
    private int playerFirst;
    private int playerSecond;
    private String expectedScore;

    public TennisGameTest(int playerFirst, int playerSecond, String expectedScore) {
        this.playerFirst = playerFirst;
        this.playerSecond = playerSecond;
        this.expectedScore = expectedScore;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getAllScores() {
        return Arrays.asList(new Object[][]{
                {0, 0, "Love-All"},
                {1, 1, "Fifteen-All"},
                {2, 2, "Thirty-All"},
                {3, 3, "Forty-All"},
                {4, 4, "Deuce"},

                {1, 0, "Fifteen-Love"},
                {0, 1, "Love-Fifteen"},
                {2, 0, "Thirty-Love"},
                {0, 2, "Love-Thirty"},
                {3, 0, "Forty-Love"},
                {0, 3, "Love-Forty"},
                {4, 0, "Win for player1"},
                {0, 4, "Win for player2"},

                {2, 1, "Thirty-Fifteen"},
                {1, 2, "Fifteen-Thirty"},
                {3, 1, "Forty-Fifteen"},
                {1, 3, "Fifteen-Forty"},
                {4, 1, "Win for player1"},
                {1, 4, "Win for player2"},

                {3, 2, "Forty-Thirty"},
                {2, 3, "Thirty-Forty"},
                {4, 2, "Win for player1"},
                {2, 4, "Win for player2"},

                {4, 3, "Advantage player1"},
                {3, 4, "Advantage player2"},
                {5, 4, "Advantage player1"},
                {4, 5, "Advantage player2"},
                {15, 14, "Advantage player1"},
                {14, 15, "Advantage player2"},

                {6, 4, "Win for player1"},
                {4, 6, "Win for player2"},
                {16, 14, "Win for player1"},
                {14, 16, "Win for player2"},
        });
    }

    @Test
    public void checkAllScores() {
        int highestScore = Math.max(this.playerFirst, this.playerSecond);
        int scorePlayerFirst = 0;
        int scorePlayerSecond = 0;
        for (int i = 0; i < highestScore; i++) {
            if (i < this.playerFirst)
                scorePlayerFirst += 1;
            if (i < this.playerSecond)
                scorePlayerSecond += 1;
        }
        assertEquals(this.expectedScore, TennisGame.getScore("John", "Bill", scorePlayerFirst, scorePlayerSecond));
    }
}
