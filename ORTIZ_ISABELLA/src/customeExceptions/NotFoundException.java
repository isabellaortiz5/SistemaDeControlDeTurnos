package customeExceptions;

@SuppressWarnings("serial")
public class NotFoundException extends Exception {

	public NotFoundException(String dt, String id) {
		super("The user with document type: "+ dt + " and document number: "+ id + " was not found");
	}

	
}
