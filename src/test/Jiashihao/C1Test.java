package Jiashihao;

/**
 * Created by lenovo on 2017/7/28.
 */
        import static org.junit.Assert.*;
        import org.junit.Test;
        import org.junit.Assert;
        C1 c1 = new C1();

public class C1Test extends C1{

    @Test
    public void testAdd() {

        int result = c1.add(1, 2);
        Assert.assertEquals(3,result);
    }
    @Test
    public void testSubtract()
    {
        C1 c1 = new C1();
        int result = c1.subtract(1, 2);

        Assert.assertEquals(-1, result);
    }
    @Test
    public void testMultiply()
    {
        C1 c1 = new C1();
        int result = c1.multiply(2, 3);
        Assert.assertEquals(6, result);

    }
    @Test
    public void testDivide()
    {
        C1 c1 = new C1();
        int result = c1.divide(12, 3);
        Assert.assertEquals(4, result);

    }
}