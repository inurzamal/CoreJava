//An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).

//To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. Note that they should be in uppercase letters:

package enumEx;

enum WorkingDays {
	MONDAY, TUESDAY,WEDNESDAY, THURSDAY, FRIDAY
}

public class Color {

	public static void main(String[] args) {
		
		WorkingDays day = WorkingDays.MONDAY;
		System.out.println(day);

	}

}
