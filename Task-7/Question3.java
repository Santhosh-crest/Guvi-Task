package task7;
public class Question3 extends InvalidAgeException {
	public static void age(int a) throws InvalidAgeException {
		if(a>=18) {
			System.out.println("Age is greater than 18");
		}
		else {
			
			throw new InvalidAgeException();
		}
	}

	public static void main(String[] args) throws InvalidAgeException {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		age(17);
		

	}

}
