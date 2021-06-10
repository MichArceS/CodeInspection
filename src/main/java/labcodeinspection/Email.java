package labcodeinspection;

import java.util.Locale;

public class Email {

	private static String mfirstName;
	private static String mlastName;
	private static String password;
	private static String department;
	private static int passLength = 8;
	private static String email;

	/**
	* 
	*
	* @author Lab2
	* @param firstName lastName
	*/
	public Email(final String firstName, final String lastName) {
		this.mfirstName = firstName;
		this.mlastName = lastName;
	}

	/**
	* 
	*
	* @author Lab2
	*/
	public void showInfo() {
		System.out.println("\nFIRST NAME= " + mfirstName + "\nLAST NAME= " + mlastName);
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
		this.email = this.mfirstName.toLowerCase(Locale.getDefault()) + this.mfirstName.toLowerCase(Locale.getDefault()) + "@" + this.department
				+ ".espol.edu.ec";
	}
}
