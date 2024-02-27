package com.gov.nha.bis.security.exception;

public class KeyNotYetValidException extends BisException {
  private static final long serialVersionUID = -4064529933657504359L;
  
  public KeyNotYetValidException() {}
  
  public KeyNotYetValidException(String message) {
    super(message);
  }
  
  public KeyNotYetValidException(Throwable cause) {
    super(cause);
  }
  
  public KeyNotYetValidException(String message, Throwable cause) {
    super(message, cause);
  }
  
  public Throwable getRootCause() {
    Throwable throwable1 = null, e = getCause();
    for (KeyNotYetValidException keyNotYetValidException = this; e != null && e != keyNotYetValidException; e = e.getCause())
      throwable1 = e; 
    return throwable1;
  }
}
