import org.junit.Test;

public class EquipmentTest{
	
	private String testString1 = "Test/1,2.0,3.0,Description";
	private Equipment testEquipment1 = new Equipment(testString1);
	private String testString2 = "TEST/-1,-2.0,-3.0,DESCRIPTION";
	//private Equipment testEquipment2 = new Equipment(testString2);
	
	//Tests our equipment constructor
	@Test
	public void equipmentConstructorTest() throws AssertException{
		
		//Creates equipment object with string constructor
		Equipment equipment = new Equipment(testString1);
		
		//Checks each value of the object using get methods 
		Assert.assertEquals("Test", equipment.getName());
		Assert.assertEquals(1, equipment.getCount());
		Assert.assertEquals(2.0, equipment.getTotalWeight());
		Assert.assertEquals(3.0, equipment.getTotalPrice());
		Assert.assertEquals("Description", equipment.getDescription());
	}
	
	//Tests for our get methods 
	
	@Test
	public void testGetName() throws AssertException{
		
		//Tests each get method
		Assert.assertEquals("Test", testEquipment1.getName());
		Assert.assertEquals(1, testEquipment1.getCount());
		Assert.assertEquals(2.0, testEquipment1.getTotalWeight());
		Assert.assertEquals(3.0, testEquipment1.getTotalPrice());
		Assert.assertEquals("Description", testEquipment1.getDescription());
		
	}
	
	@Test
	public void testEquals() throws AssertException{
		Equipment equipment1 = new Equipment(testString1);
		Equipment equipment2 = new Equipment(testString1);
		Equipment equipment3 = new Equipment(testString2);
		
		Assert.assertEquals(true, equipment1.equals(equipment2));
		Assert.assertEquals(false, equipment1.equals(equipment3));
	}
}
