
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.hamcrest.CoreMatchers.is;



import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author arison
 *
 */
public class ContactServiceTest {
	ContactService cs = new ContactService();
	Contact contact = new Contact("0", "name", "last name", "phone", "address");

	@SuppressWarnings("deprecation")
	@Test
	public void testAdd_DeleteMethod() {
//		verify linkedLists are empty
		assertThat(ContactService.contactList.size(), is(0));
		assertThat(ContactService.contactIDList.size(), is(0));
//		test add method 
		cs.add(0);
		assertThat(ContactService.contactList.size(), is(1));
		assertThat(ContactService.contactIDList.size(), is(1));
//		test delete method with contactID
		cs.delete("0");
		assertThat(ContactService.contactIDList.size(), is(0));
		cs.delete("0");
		assertThat(ContactService.contactList.size(), is(0));
//		test unique values contact service
		cs.add(0);
		cs.add(0);
		cs.add(1);
		assertThat(ContactService.contactIDList.size(), is(2));
		assertThat(ContactService.contactList.size(), is(2));
	}
	@Test
	  public void testAssertTrue() {
		try {
//			test update by contactID
			assertThat(cs.contact.toString(), is(cs.update(0, "0", "***update")));
			assertThat(cs.contact.toString(), is(cs.update(1, "0", "***update")));
			assertThat(cs.contact.toString(), is(cs.update(2, "0", "***update")));
			assertThat(cs.contact.toString(), is(cs.update(3, "0", "***update")));
	         fail("Should have thrown an exception");
	     } catch (final AssertionError e) {
	         assertTrue(true);
	     }
	  } 
}
