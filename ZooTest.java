import org.junit.Test;

public class ZooTest{
	
	Zoo zoo = new Zoo(1);
	Animal mouse = new Animal("grey", "mouse", 1.0, 10.0);
	Animal rabbit = new Animal("white", "rabbit", 2.0, 10.0);
	Animal rabbit2 = new Animal("white", "rabbit", 4.0, 10.0);
	
	@Test
	public void testZooConstructor() throws AssertException{
		//Initializes zoo object using constructor
		Zoo zoo = new Zoo(0);
		
		//Checks capacity set to 0
		Assert.assertEquals(0, zoo.getCapacity());
		
		//Checks Weight and Height are zero
		Assert.assertEquals(0, zoo.getAverageWeight(), 0.1);
		Assert.assertEquals(0, zoo.getTotalHeight(), 0.1);
		
		//Initialized zoo object using constructor 
		Zoo zoo2 = new Zoo(10);
		
		//Checks capacity is set to 10
		Assert.assertEquals(10, zoo2.getCapacity());
	}
	
	@Test
	public void testAddandExpand() throws AssertException{
		zoo.addAnimal(mouse);
		
		Assert.assertEquals(1, zoo.getCapacity());
		
		zoo.addAnimal(rabbit);
		Assert.assertEquals(2, zoo.getCapacity());
		
		//ToDo find a way to test animal gets added into animal array 
		//Assert.assertEquals(zoo, zoo.getAnimals().toString());
	}
	
	@Test
	public void testGetters() throws AssertException{
		Zoo zoo = new Zoo(1);
		zoo.addAnimal(mouse);
		zoo.addAnimal(rabbit);
		
		Assert.assertEquals(2, zoo.getCapacity());
		Assert.assertEquals(20.0, zoo.getTotalHeight());
		Assert.assertEquals(1, zoo.getAverageWeight());
		
		zoo.addAnimal(rabbit2);
		Assert.assertEquals(3,zoo.getAverageWeight("white"));
		
		//Assert.assertEquals(animals, zoo.getAnimals());
	}
}