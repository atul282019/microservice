package com.gov.nha.bis.security.exception;

public class KeyExpiredException extends BisException {
  private static final long serialVersionUID = -4064529933657504359L;
  
  public KeyExpiredException() {}
  
  public KeyExpiredException(String message) {
    super(message);
  }
  
  public KeyExpiredException(Throwable cause) {
    super(cause);
  }
  
  public KeyExpiredException(String message, Throwable cause) {
    super(message, cause);
  }
  
  public Throwable getRootCause() {
    Throwable throwable1 = null, e = getCause();
    for (KeyExpiredException keyExpiredException = this; e != null && e != keyExpiredException; e = e.getCause())
      throwable1 = e; 
    return throwable1;
  }
}
