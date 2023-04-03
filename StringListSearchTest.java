import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class StringListSearchTest {
    @Test
    public void testUnorderedSearch() {
        ArrayList<String> inputItems;
        String inputTerm;
        int expectedOutput;
        int actualOutput;

        // some positive numbers
        inputItems = new ArrayList<>(Arrays.asList("there", "is", "the", "mountain"));
        inputTerm = "the";
        expectedOutput = 2;
        actualOutput = StringListSearch.unorderedSearch(inputItems, inputTerm);
        assertEquals(expectedOutput, actualOutput);
        // some positive numbers
        inputItems = new ArrayList<>(Arrays.asList("there", "is", "the", "mountain"));
        inputTerm = "valley";
        expectedOutput = -1;
        actualOutput = StringListSearch.unorderedSearch(inputItems, inputTerm);
        assertEquals(expectedOutput, actualOutput);

    }
    @Test
    public void testOrderedLinearSearch() {
        ArrayList<Integer> inputItems;
        int inputTerm;
        int expectedOutput;
        int actualOutput;

        // some positive numbers
        inputItems = new ArrayList<>(Arrays.asList(1,3,4,5,6,7,8,9,23,24,36));
        inputTerm = 2;
        expectedOutput = -1;
        actualOutput = StringListSearch.orderedLinearSearch(inputItems, inputTerm);
        assertEquals(expectedOutput, actualOutput);
        // some positive numbers
        inputItems = new ArrayList<>(Arrays.asList(1,3,4,5,6,7,8,9,23,24,36));
        inputTerm = 9;
        expectedOutput = 7;
        actualOutput = StringListSearch.orderedLinearSearch(inputItems, inputTerm);
        assertEquals(expectedOutput, actualOutput);

    }
    @Test
    public void testOrderedBinarySearch() {
        ArrayList<Integer> inputItems;
        int inputTerm;
        int expectedOutput;
        int actualOutput;

        // some positive numbers
        inputItems = new ArrayList<>(Arrays.asList(1,3,4,5,6,7,8,9,23,24,36));
        inputTerm = 2;
        expectedOutput = -1;
        actualOutput = StringListSearch.orderedBinarySearch(inputItems, inputTerm);
        assertEquals(expectedOutput, actualOutput);
        // some positive numbers
        inputItems = new ArrayList<>(Arrays.asList(1,3,4,5,6,7,8,9,23,24,36));
        inputTerm = 9;
        expectedOutput = 7;
        actualOutput = StringListSearch.orderedBinarySearch(inputItems, inputTerm);
        assertEquals(expectedOutput, actualOutput);

    }
}
