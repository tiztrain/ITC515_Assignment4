import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Bug4Test {

	int roundCount;
	Face pick;
	int winnings;
	double roundsWon;
	double roundsLost;
	int bet;
	int balance;
	int limit;
	String name;
	
	Punter punter;
	ArrayList<Die> dice;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		name = "Adam";
		balance = 1000000;
		limit = 10;
		punter = new Punter(name, balance, limit);
		dice = new ArrayList<Die>();
		roundCount = 0;
		bet = 10;
		pick = Face.getRandom();
		winnings = Round.play(punter, dice, pick, bet);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testBug4() {
		//arrange
		double winRatio = roundsWon/(roundsLost + roundsWon);
		//act
		
		//assert
		assertEquals(0.42, winRatio, 0.01);
	}

}
