package kh146volovik;

import java.util.Calendar;
import java.util.Date;

import junit.framework.TestCase;
import kh146volovik.User;

public class UserTest extends TestCase {
	
	private User user;
	private Date dateOfBirthd;
	
	public void setUp() throws Exception {
		super.setUp();
		user = new User();
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(1984, Calendar.MAY, 26);
		dateOfBirthd = calendar.getTime();
	}

	public void testGetFullName(){
		// Arrange
		// Act
		user.setFirstName("John");
		user.setLastName("Doe");
		
		// Assert
		assertEquals("Doe, John", user.getFullName());
	}
	
	public void testGetAge(){
		user.setDateOfBirthd(dateOfBirthd);
		assertEquals(2016 - 1984, user.getAge());
	}
}
