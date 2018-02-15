package task1;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BaseTransformerTest {
    @Test
    public void transform10to2() throws Exception {
        final BaseTransformer transformer = new BaseTransformer(BaseTransformer.BASE_10, BaseTransformer.BASE_2);
        assertThat(transformer.transform("10"), is("1010"));
        assertThat(transformer.transform("0"), is("0"));
        assertThat(transformer.transform("39285"), is("1001100101110101"));
        assertThat(transformer.transform("29345729940"), is("01101101010100100100110110010100"));
    }

    @Test
    public void transform10to16() throws Exception {
        final BaseTransformer transformer = new BaseTransformer(BaseTransformer.BASE_10, BaseTransformer.BASE_16);
        assertThat(transformer.transform("10"), is("A"));
        assertThat(transformer.transform("0"), is("0"));
        assertThat(transformer.transform("39285"), is("9975"));
        assertThat(transformer.transform("29345729940"), is("6D5244D94"));
    }

    @Test
    public void transform2to10() throws Exception {
        final BaseTransformer transformer = new BaseTransformer(BaseTransformer.BASE_10, BaseTransformer.BASE_2);
        assertThat(transformer.transform("1010"), is("10"));
        assertThat(transformer.transform("0"), is("0"));
        assertThat(transformer.transform("1001100101110101"), is("39285"));
        assertThat(transformer.transform("01101101010100100100110110010100"), is("29345729940"));
    }

    @Test
    public void transform16to10() throws Exception {
        final BaseTransformer transformer = new BaseTransformer(BaseTransformer.BASE_10, BaseTransformer.BASE_16);
        assertThat(transformer.transform("A"), is("10"));
        assertThat(transformer.transform("0"), is("0"));
        assertThat(transformer.transform("9975"), is("39285"));
        assertThat(transformer.transform("6D5244D94"), is("29345729940"));
    }

    @Test
    public void transform2to16() throws Exception {
        final BaseTransformer transformer = new BaseTransformer(BaseTransformer.BASE_10, BaseTransformer.BASE_2);
        assertThat(transformer.transform("1010"), is("A"));
        assertThat(transformer.transform("0"), is("0"));
        assertThat(transformer.transform("1001100101110101"), is("9975"));
        assertThat(transformer.transform("01101101010100100100110110010100"), is("6D5244D94"));
    }

    @Test
    public void transform16to2() throws Exception {
        final BaseTransformer transformer = new BaseTransformer(BaseTransformer.BASE_10, BaseTransformer.BASE_16);
        assertThat(transformer.transform("A"), is("1010"));
        assertThat(transformer.transform("0"), is("0"));
        assertThat(transformer.transform("9975"), is("1001100101110101"));
        assertThat(transformer.transform("6D5244D94"), is("01101101010100100100110110010100"));
    }

    @Test
    public void transform10toX() throws Exception {
        final BaseTransformer transformer = new BaseTransformer(BaseTransformer.BASE_10, new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'});
        assertThat(transformer.transform("10"), is("bc"));
        assertThat(transformer.transform("0"), is("a"));
        assertThat(transformer.transform("39285"), is("bbefgf"));
        assertThat(transformer.transform("29345729940"), is("ddcfbbaeggce"));
    }

}