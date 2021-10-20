

/**
 * 
 */

/**
 * @author arison
 *
 */
public class Contact {
	
	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
//	public Contact() {
//		// TODO Auto-generated constructor stub
//		
//	}
	public Contact(String contactID, String firstName, String lastName, String phone,
			String address) {
//		do not update contact ID!!!
//		System.out.print("this ID is: " + this.contactID + "\n");
		if(this.contactID == null) {
			this.contactID = contactID;
		}if(this.contactID.length() > 10) {
			this.contactID = "too long";
		}
//		updateable fields
		setFirstName(firstName);
		setLastName(lastName);
		setPhone(phone);
		setAddress(address);	
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	}
	/**
	 * @return the contactID
	 */
	public String getContactID() {
			return this.contactID;	
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		firstName = fieldConstraint(firstName, "first");
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		String newLastName = fieldConstraint(lastName, "last");
		this.lastName = newLastName;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		phone = fieldConstraint(phone, "phone");
		this.phone = phone;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		address = addressConstraint(address);
		this.address = address;
	}
	/**
	 * @param String field, String type)
	 * this method checks for all requirements first name
	 * last name, and phone, null, length, and minimum length *phone
	 */
	public String fieldConstraint(String field, String type) {
		
		if(field.length() < 10 && type == "phone") {
			field = null;
		}
		if(field == null) {
			//field null throw invalid field
			field = "invalid field";
		}
		if(field.length() >= 9) {
			field = field.substring(0, 9);
		}
		
		return field;
	}
	/**
	 * @param String addField
	 * conditionals method for address null, & length ceiling
	 */
	public String addressConstraint(String addField) {
		if(addField == null) {
			//throw invalid address field
			addField = "insert name";
		}
		if(addField.length() > 30) {
			addField = addField.substring(0, 29);
		}
		return addField;
	}
	/**
	 * @param address the address to set
	 */
	public String[] toArray() {
		 String id = getContactID();
		 String fname = getFirstName();
		 String lname = getLastName();
		 String phone = getPhone();
		 String ad = getAddress();
		 
		 String[] list = new String[]{id, fname, lname, phone, ad};
		
		return list;		
	}
	/**
	 * @param address the address to set
	 */
	public String toString() {
		 String id = getContactID();
		 String fname = getFirstName();
		 String lname = getLastName();
		 String phone = getPhone();
		 String ad = getAddress();
		 
		return id +" "+ fname +" "+ lname +" "+ phone +" "+ ad;			
	}	
}