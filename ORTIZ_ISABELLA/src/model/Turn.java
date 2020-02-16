package model;

public class Turn {
	private String code;
	private boolean status;
	private boolean attended;
	
	
	public Turn(String code) {
		this.code = code;
		this.status = false;
		this.attended = false;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public boolean isAttended() {
		return attended;
	}
	public void setAttended(boolean attended) {
		this.attended = attended;
	}
	

}
