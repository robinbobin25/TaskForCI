import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by antonina_mykhailenko on 12.10.2015.
 */
public class test {
    @Test
    public void testThatSummarizeIsCorrect(){
        assertEquals("The sum is incorrect. ", Summarize.sumTwoNumbers(2, 3), 5);
    }
}
