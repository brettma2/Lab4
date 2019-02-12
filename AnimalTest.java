import org.junit.Test;

/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
	@Test
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }
	
	//Set constants
	private double TEST_WEIGHT = 10;
	private double TEST_HEIGHT = 20;
	private double TEST_WEIGHT2 = -10.55;
	private double TEST_HEIGHT2 = -11.21;
	
	@Test
	public void fullConstructorTest() throws AssertException
	{
		// Full Constructor
		Animal animal = new Animal("blue","test",TEST_WEIGHT,TEST_HEIGHT);
		Animal animal2 = new Animal("RED","TEST",TEST_WEIGHT2,TEST_HEIGHT2);
		
		// Name should be test, color blue, weight 10, height 20
		Assert.assertEquals("blue", animal.getColor());
		Assert.assertEquals("test", animal.getName());
		Assert.assertEquals(TEST_WEIGHT, animal.getWeight(), 0.01);
		Assert.assertEquals(TEST_HEIGHT, animal.getHeight(), 0.01);
		
		// Test case 2, Name:TEST Color:RED Weight:-10.55 Height:-11.21 
		Assert.assertEquals("RED", animal2.getColor());
		Assert.assertEquals("TEST", animal2.getName());
		Assert.assertEquals(TEST_WEIGHT2, animal2.getWeight(), 0.01);
		Assert.assertEquals(TEST_HEIGHT2, animal2.getHeight(), 0.01);
	}

    // TODO: test full constructor, getters, and toString
    
	@Test 
	public void testEquals() throws AssertException{
		Animal animal1 = new Animal("blue", "test", TEST_WEIGHT,TEST_HEIGHT);
		Animal animal2 = new Animal("blue", "test", TEST_WEIGHT,TEST_HEIGHT);
		Animal animal3 = new Animal("RED", "BLUE", TEST_WEIGHT2,TEST_HEIGHT2);
		
		Assert.assertEquals(true, animal1.equals(animal2));
		Assert.assertEquals(false, animal1.equals(animal3));
	}
	
	@Test
	public void testGetters() throws AssertException
	{
		Animal animal = new Animal("blue","test",TEST_WEIGHT,TEST_HEIGHT);
		
		Assert.assertEquals("blue", animal.getColor());
		Assert.assertEquals("test", animal.getName());
		Assert.assertEquals(TEST_WEIGHT, animal.getWeight(), 0.01);
		Assert.assertEquals(TEST_HEIGHT, animal.getHeight(), 0.01);
	}
}

