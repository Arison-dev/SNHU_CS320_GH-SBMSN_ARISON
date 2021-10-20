import java.util.LinkedList;


/**
 * 
 */

/**
 * @author arison
 *
 */
public class ContactService {
	Contact contact = new Contact("0", "name", "last name", "phone", "address");
	static LinkedList<String> contactIDList = new LinkedList<String>();
	static LinkedList<String> contactList = new LinkedList<String>();
	
	public ContactService() {
		// TODO Auto-generated constructor stub
		
	}

	/**
	 * @param args int num
	 */
	/* The contact service shall be able to add contacts with a 
	 * 		unique ID.
	*/
	public LinkedList<String> add(int num) {
		if(!contactIDList.contains(String.valueOf(num))) {
//			Array calls for easy data manipulation
			String id = contact.toArray()[0];
			String name = contact.toArray()[1];
			String lname = contact.toArray()[2];
			String phone = contact.toArray()[3];
			String ad = contact.toArray()[4];
//			cross reference ID list
			contactIDList.add(id);
//			create new instance of contact
			Contact contact = new Contact(id, name, lname, phone, ad);
//			add new contact object to contact list
			contactList.add(contact.toString());	
		}else {
//			sets contact information per unique id value
			contactList.set(num, contact.toString());
		}
		return contactList;
	}
	/**
	 * @param args String contactID
	 */
	/* 
	 * The contact service shall be able to delete contacts per 
	 *		contact ID.
	 */ 
	public void delete(String contactID) {
//		delete contact object per unique id 
		if(contactIDList.contains(contactID)) {
			int contactElement = contactIDList.indexOf(contactID);
			contactList.remove(contactElement);
			contactIDList.remove(contactElement);
		}
	}
	/**
	 * @param args int ans , String contactID, String field
	 */
	 /* 
	 * The contact service shall be able to update contact fields 
	 * 		per contact ID. The following fields are updatable:
	 * 		- firstName
	 * 		- lastName
	 * 		- Number
	 * 		- Address
	 */
	public Contact update(int ans , String contactID, String field) {
//		Switch statement for updating fields, see add(int);				
		switch(ans){
		case 0: 
//			*Process is repeated for each case *
//			retrieve contact index
			contactList.indexOf(contactID);
//			set contact field
			contact.setFirstName(field);
//			easy data manipulation with array
			contact.toArray()[1] = field;
//			add updated info with old info to list
			add(Integer.valueOf(contactID));
			break;
		case 1:
			contactList.indexOf(contactID);
			contact.setLastName(field);
			contact.toArray()[2] = field;
			add(Integer.valueOf(contactID));
			break;
		case 2: 
			contactList.indexOf(contactID);
			contact.setPhone(field);
			contact.toArray()[3] = field;
			add(Integer.valueOf(contactID));
			break;
		case 3: 
			contactList.indexOf(contactID);
			contact.setAddress(field);
			contact.toArray()[4] = field;
			add(Integer.valueOf(contactID));
			break;
		}	
		return contact;
	}
}
