import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author arison
 *
 */
public class ContactTest {
//	ContactService cs = new ContactService();
	Contact contact = new Contact("lengthcheck","lengthcheck","lengthcheck","lengthcheck","lengthchecklengthchecklengthcheck");
	
	

//	The contact object shall have a required unique contact 
//	ID string that cannot be longer than 10 characters.
	
//	The contact ID shall not be null and shall not be updatable.
	
//	The contact object shall have a required firstName String 
//	field that cannot be longer than 10 characters. 
	
//	The firstName field shall not be null.
	
//	The contact object shall have a required 
//	lastName String field that cannot be longer than 10 characters. 
	
//	The lastName field shall not be null.
	
//	The contact object shall have a required phone String field 
//	that must be exactly 10 digits. 
	
//	The phone field shall not be null.
	
//	The contact object shall have a required address field that 
//	must be no longer than 30 characters. The address field shall not be null.
//	
	@Test
	  public void testAssertTrue() {
	    assertTrue("failure - should be true", contact.toArray()[0].length() <= 10);
	    assertTrue("failure - should be true", contact.toArray()[1].length() <= 10);
	    assertTrue("failure - should be true", contact.toArray()[2].length() <= 10);
	    assertTrue("failure - should be true", contact.toArray()[3].length() <= 10);
	    assertTrue("failure - should be true", contact.toArray()[4].length() <= 30);
	    
	    assertTrue("failure - should be true", contact.toArray()[0] != null);
	    assertTrue("failure - should be true", contact.toArray()[1] != null);
	    assertTrue("failure - should be true", contact.toArray()[2] != null);
	    assertTrue("failure - should be true", contact.toArray()[3] != null);
	    assertTrue("failure - should be true", contact.toArray()[4] != null);
	    
//	    assertThat(cs.contact.toString(), is(cs.update(0, "-1", "***update")));
	  }

}
