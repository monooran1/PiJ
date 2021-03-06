package Week_05.Updated_Day_09.Q2;

public class DoubleListPatient {
	private String name;
	private int age;
	private String illness;
	private DoubleListPatient prevPatient;					// new field for a previous pointer
	private DoubleListPatient nextPatient;	


	public DoubleListPatient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.prevPatient = null;	
		this.nextPatient = null; 							// Pointer to another patient!
	}														// methods like constructors, getters
															// and setters come here...

	public DoubleListPatient getNextPatient() {
		return this.nextPatient;
		// return nextPatien;
	}

	public void setNextPatient(DoubleListPatient nextPatient) {
		this.nextPatient = nextPatient;
		// return nextPatien;
	}

	public DoubleListPatient getPrevPatient() {					// create new getter for PrevPatient
		return this.prevPatient;
	}

	public void setPrevPatient(DoubleListPatient prevPatient) {	// create new setter for PrevPatient
		this.prevPatient = prevPatient;
		// return nextPatien;
	}

	public String toString() {
		//return String output = "Name: " + name + " Age: " + age + " Illness: " + illness;
		return "Name: " + name + "\n" + "Age: " + age + "\n" + "Illness: " + illness + "\n\n";
	}

	public String getName() {
		return this.name; 
	}

} //END of class
