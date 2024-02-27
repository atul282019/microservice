package com.gov.nha.bis.security.exception;

public class BisException extends Exception {
 
	
  /**
	 * 
	 */
	private static final long serialVersionUID = -50592489852900050L;
private int errorCode = -1;

  
  public BisException() {}
  
  public BisException(String message) {
    super(message);
  }
  
  public BisException(String message, int errorCode) {
    super(message);
    this.errorCode = errorCode;
  }
  
  public BisException(Throwable cause) {
    super(cause);
  }
  
  public BisException(String message, Throwable cause) {
    super(message, cause);
  }
  
  public Throwable getRootCause() {
    Throwable e = getCause();
    Throwable eParent;
    for (eParent = this; e != null && e != eParent; e = e.getCause())
      eParent = e; 
    return eParent;
  }
  
  public int getErrorCode() {
    return this.errorCode;
  }
}
