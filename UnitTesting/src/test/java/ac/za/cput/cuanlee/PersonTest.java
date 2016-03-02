package ac.za.cput.cuanlee;

import junit.framework.TestCase;
import org.junit.Before;
import org.testng.annotations.Test;

/**
 * Created by Cuan on 3/2/2016.
 */
public class PersonTest extends TestCase {

    Person p1,p2,p3,p4;
    private int array1[] = {12, 13, 45, 98};
    private int array2[] = {12, 13, 45, 98};


    @Before
    public void setUp()
    {
        p1 = new Person("Cuan","Lee",23,80.1f,array1,false);
        p2 = new Person("Jason", "Hans",22,70.4f, array2,true);

        p4 = p1;
    }

    @Test
    public void testFloatingPoint()
    {
        p2.setSalary(80.1f);
        assertEquals(p1.getSalary(), p2.getSalary());
    }

    @Test
    public void testInteger()
    {
        p2.setAge(23);
        assertEquals(p1.getAge(), p2.getAge());
    }

    @Test
    public void testNullness()
    {
        assertNull(p3);
    }

    @Test
    public void testNotNull()
    {
        assertNotNull(p1);
    }

    @Test
    public void testObjectEquality()
    {
        assertEquals(p1,p1);
    }

    @Test
    public void testObjectIdentity()
    {
        assertSame(p1,p4);
    }

    @Test
    public void testArray()
    {
        assertEquals(p1.getNumbers(),p4.getNumbers());
    }

    @Test
    public void testBool()
    {
        assertEquals(p1.isDependent(), p4.isDependent());
    }
}
