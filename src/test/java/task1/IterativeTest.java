package task1;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class IterativeTest {
    @Test
    public void amountOfNubersWithDigitSumEqualsTo() throws Exception {
        Iterative iterative = new Iterative(1L, 100L);
        assertThat(iterative.amountOfNubersWithDigitSumEqualsTo(5), is(6L));
        assertThat(iterative.amountOfNubersWithDigitSumEqualsTo(0), is(0L));
        assertThat(iterative.amountOfNubersWithDigitSumEqualsTo(20), is(0L));
        iterative = new Iterative(0L, 100000L);
        assertThat(iterative.amountOfNubersWithDigitSumEqualsTo(5), is(126L));
        assertThat(iterative.amountOfNubersWithDigitSumEqualsTo(0), is(1L));
        assertThat(iterative.amountOfNubersWithDigitSumEqualsTo(20), is(5631L));
    }

    @Test
    public void amountOfLuckyNumbers() throws Exception {
        assertThat(new Iterative(1L, 100L).amountOfLuckyNumbers(), is(18L));
        assertThat(new Iterative(0L, 999999L).amountOfLuckyNumbers(), is(57285L));
        assertThat(new Iterative(1000L, 100000L).amountOfLuckyNumbers(), is(6765L));
        assertThat(new Iterative(10L, 12345678L).amountOfLuckyNumbers(), is(634512L));
    }

    @Test
    public void amountOfMultipleTo() throws Exception {
        Iterative iterative = new Iterative(1L, 100L);
        assertThat(iterative.amountOfMultipleTo(3), is(33L));
        assertThat(iterative.amountOfMultipleTo(5), is(19L));
        assertThat(iterative.amountOfMultipleTo(10), is(9L));
        iterative = new Iterative(0L, 999999L);
        assertThat(iterative.amountOfMultipleTo(3), is(333333L));
        assertThat(iterative.amountOfMultipleTo(5), is(200000L));
        assertThat(iterative.amountOfMultipleTo(7), is(142857L));
        assertThat(iterative.amountOfMultipleTo(10), is(100000L));
    }

}