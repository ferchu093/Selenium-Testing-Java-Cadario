package testingasserts;

import org.testng.Assert;
import org.testng.annotations.Test;

import testingchrome.CalculateOperation;
import testingchrome.Person;

public class AssertsTests {

	CalculateOperation calculateOperation = new CalculateOperation();
	
	@Test 
	public void testSumTwoNumbers() {
		int testNumber = calculateOperation.SumTwoNumbers(5, 5);
		Assert.assertTrue(testNumber==10);
	}
	
	@Test 
	public void testFaildSumTwoNumbers() {
		int testNumber = calculateOperation.SumTwoNumbers(5, 5);
		Assert.assertFalse(testNumber==11);
	}
	
	@Test 
	public void testEqualsReturnNumberTen() {
		int resultnumber = calculateOperation.returnNumberTen();
		Assert.assertEquals(resultnumber+10,resultnumber+5);
	}
	@Test
	public void testNotEqualsReturnNumberTen() {
		int resultnumber = calculateOperation.returnNumberTen();
		Assert.assertNotEquals(resultnumber-10,resultnumber*5);
	}
	@Test
	public void testNullPerson() {
		Person person = new Person("Pepe", "Gonzales");
		Assert.assertNull(person);
	}
	
	@Test
	public void testNotNullPerson() {
		Person person = new Person("Pepe", "Gonzales");
		Assert.assertNotNull(person);
	}
	@Test
	public void testNotSamePerson() {
		Person person = new Person("Pepe", "Gonzales");
		Person personTwo = new Person("Pepe", "Gonzales");
		Assert.assertNotSame(person, personTwo);
	}
	
	@Test
	public void testSamePerson() {
		Person person = new Person("Pepe", "Gonzales");
		Person personTwo = person;
		Assert.assertSame(person, personTwo);
	}
	
	

}
