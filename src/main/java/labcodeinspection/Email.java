package labcodeinspection;

public class Email {

	private final String m_firstName;
	private final String m_lastName;
	private String password;
	private String department;
	private final int passLength = 8;
	private String email;

	/**
	* 
	*
	* @author Lab2
	* @param firstName lastName
	*/
	public Email(final String firstName, final String lastName) {
		this.m_firstName = firstName;
		this.m_lastName = lastName;
	}

	/**
	* 
	*
	* @author Lab2
	*/
	public void showInfo() {
		System.out.println("\nFIRST NAME= " + m_firstName + "\nLAST NAME= " + m_lastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}

	/**
	* 
	*
	* @author Lab2
	* @param depChoice
	*/
	public void setDeparment(final int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		default:
			
		}
	}

	private String randomPassword(final int length) {
		final String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			final int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}

	/**
	* 
	*
	* @author Lab2
	*/
	public void generateEmail() {
		this.password = this.randomPassword(this.passLength);
		this.email = this.m_firstName.toLowerCase() + this.m_lastName.toLowerCase() + "@" + this.department
				+ ".espol.edu.ec";
	}
}
