package person_proj;

public class Person {
	Mobile mobile;

	public Person(Mobile mobile) {
		super();
		this.mobile = mobile;
	}
	public void use()
	{
		mobile.using();
		System.out.println("Person is using Mobile");
	}
	
    }
