package customeExceptions;

@SuppressWarnings("serial")
public class EmptyFieldException extends Exception{
	public EmptyFieldException(String what) {
		super("The obligatory field"+what+"is empty");
	}
}
