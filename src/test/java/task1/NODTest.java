package task1;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class NODTest {
    @Test
    public void calculate() throws Exception {
        final NOD nod = new NOD();
        assertThat(nod.calculate(54, 24), is(6L));
        assertThat(nod.calculate(24, 54), is(6L));
        assertThat(nod.calculate(0, 17), is(17L));
        assertThat(nod.calculate(22, 0), is(22L));
        assertThat(nod.calculate(67, 1), is(1L));
        assertThat(nod.calculate(1, 15), is(1L));
        assertThat(nod.calculate(199 * 167, 199 * 179), is(199L));
    }

}