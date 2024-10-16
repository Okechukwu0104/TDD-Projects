import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

	
public class SwappingTest{
	
	@Test
	public void testForSwapping(){

	Tasks task = new Tasks();

	//given that
	int[] given = {1,2,3,4,5};
	int[] expected = {2,1,4,3,5};

	//when I
	int []result = task.swapArray(given);

	//assert that	
		assertArrayEquals(result,expected);

	}



}