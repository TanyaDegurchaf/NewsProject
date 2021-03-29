package by.htp.ll.dao;

public class DAOException extends Exception{
	private static final long serialVersionUID = 2115256281883570390L;

	public DAOException() {
		super();
	}
	
	public DAOException(String message) {
		super(message);
	}
	
	public DAOException(Exception e) {
		super(e);
	}
	
	public DAOException(String message, Exception e) {
		super(message, e);
	}
	
}
