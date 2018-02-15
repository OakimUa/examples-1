package task1;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PowerTest {
    @Test
    public void power() throws Exception {
        final Power power = new Power();
        assertThat(power.calculate(2,8), is(256L));
        assertThat(power.calculate(2,10), is(1024L));
        assertThat(power.calculate(10,10), is(10000000000L));
        assertThat(power.calculate(1,10), is(1L));
        assertThat(power.calculate(10,1), is(10L));
        assertThat(power.calculate(10,0), is(1L));
        assertThat(power.calculate(0,10), is(0L));
        assertThat(power.calculate(-2,10), is(1024L));
        assertThat(power.calculate(-2,11), is(-2048L));
    }

}