package task2;

import org.junit.Test;

import static org.hamcrest.Matchers.hasItems;
import static org.junit.Assert.assertThat;

public class EratosthenesTest {
    @Test
    public void primeNumbers() throws Exception {
        assertThat(new Eratosthenes(30L).primeNumbers(), hasItems(2L, 3L, 5L, 7L, 11L, 13L, 17L, 19L, 23L, 29L));
    }

}