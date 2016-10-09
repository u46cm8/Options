// This is a program to make a choice of subject to Study
import java.util.Random;

public class SubjectChoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] subjects = new String[]{"java", "Maths","intro to comps and nets","info sys"};
		//list of subjects made into an array 
		
		Random rand = new Random();
		
		int randomSelection = rand.nextInt(3- 0 +1) + 0;
		
		// Random number is used to select the index of a subject
		
		System.out.println(subjects[randomSelection]);
		
	}

}
