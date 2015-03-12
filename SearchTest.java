
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SearchTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SearchTest
{

    int [] testArray = {9, 4, 2, 10, 3, 23, -6, 7, 22, -18, 13};

    /**
     * Default constructor for test class SearchTest
     */
    public SearchTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testSearch1()
    {
        assertTrue(Search.search(testArray, 2));
    }
    
    @Test
    public void testSearch2()
    {
        assertTrue(Search.search(testArray, 7));
    }
    
    @Test
    public void testSearch3()
    {
        assertFalse(Search.search(testArray, -76));
    }
    
    @Test
    public void testSearchRecursive1()
    {
        assertTrue(Search.searchRecursive(testArray, 2));
    }
    
    @Test
    public void testSearchRecursive2()
    {
        assertTrue(Search.searchRecursive(testArray, 7));
    }
    
    @Test
    public void testSearchRecursive3()
    {
        assertFalse(Search.searchRecursive(testArray, -76));
    }

    @Test
    public void testSearchRecursive4()
    {
        assertTrue(Search.searchRecursive(testArray, 13));
    }
    
    @Test
    public void testSearchRecursive5()
    {
        assertTrue(Search.searchRecursive(testArray, 9));
    }
    
    
    

}

