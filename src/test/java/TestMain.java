
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.sandeep.example.Main;

public class TestMain {
	@Test
	public void testInputIsEven(){
		assertTrue(Main.checkIfInputIsAnEvenNumber(22)); //Assertion
	}
}
