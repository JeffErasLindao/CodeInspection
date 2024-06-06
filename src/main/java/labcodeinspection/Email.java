package labcodeinspection;

public class Email {

	private String firstName;
	private String lastName;
	private String department;
	private int defaultpasswordLength = 8;
	private String correo;
	public String password;


	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void showInfo() {
		System.out.println("\nFIRST NAME= " + firstName + "\nLAST NAME= " + lastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + correo + "\nPASSWORD= " + password);
	}

	public void setDeparment(int depChoice) {
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
			break;
		}
	}

	private String randomPassword(int length) {
		String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] contrasena = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * set.length());
			contrasena[i] = set.charAt(rand);
		}
		return new String(contrasena);
	}

	public void generateEmail() {
		this.password = this.randomPassword(this.defaultpasswordLength);
		this.correo = this.firstName.toLowerCase() + this.lastName.toLowerCase() + "@" + this.department
				+ ".espol.edu.ec";
	}
}
