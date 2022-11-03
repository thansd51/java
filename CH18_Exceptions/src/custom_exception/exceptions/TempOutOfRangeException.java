package custom_exception.exceptions;

public class TempOutOfRangeException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public TempOutOfRangeException(String m) {
		super(m); //예외 메세지 생성
	}

}
