package customeExceptions;

@SuppressWarnings("serial")
public class DuplicatedUserException extends Exception {
	public DuplicatedUserException(String dt, String dn){
		super("The user with document type: "+dt+" and document number: "+dn+" is already created");
	}

}
