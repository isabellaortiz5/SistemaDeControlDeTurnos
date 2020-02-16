package customeExceptions;

@SuppressWarnings("serial")
public class InvalidOptionException  extends Exception {
	 public InvalidOptionException(int a){
		 super("The option "+ a + " is invalid, please write a number between 1 and 4");
	 }

}
