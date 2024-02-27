/**
 * @author Vinay Kushwaha
 * @Email  vinaykushwaha85@gmail.com

 */
package com.gov.nha.bis.server.util;

import java.io.InputStream;
import java.io.OutputStream;

import org.w3c.dom.Element;

import com.gov.nha.bis.security.exception.BisException;

public abstract interface XMLTranscoder
{
  public abstract String marshal(Object paramObject)
    throws BisException;

  public abstract String marshal(Object paramObject, boolean paramBoolean1, boolean paramBoolean2)
    throws BisException;

  public abstract String marshal(Object paramObject, boolean paramBoolean1, boolean paramBoolean2, Helper paramHelper)
    throws BisException;

  public abstract Object unmarshal(String paramString)
    throws BisException;

  public abstract Object unmarshal(Element paramElement, @SuppressWarnings("rawtypes") Class paramClass)
    throws BisException;

  public abstract Object unmarshal(Element paramElement)
    throws BisException;

  public abstract <T> T unmarshal(String paramString, Class<T> paramClass)
    throws BisException;

  public abstract Object unmarshal(String paramString, boolean paramBoolean1, boolean paramBoolean2)
    throws BisException;

  public abstract <T> T unmarshal(String paramString, Class<T> paramClass, boolean paramBoolean1, boolean paramBoolean2)
    throws BisException;

  public abstract String getNamespace(String paramString)
    throws BisException;

  public abstract String getNamespace(byte[] paramArrayOfByte)
    throws BisException;

  public abstract String getNamespace(Element paramElement)
    throws BisException;

  public abstract String marshal(Object paramObject, OutputStream paramOutputStream)
    throws BisException;

  public abstract <T> T unmarshal(Class<T> paramClass, InputStream paramInputStream, boolean paramBoolean1, boolean paramBoolean2)
    throws BisException;

  public abstract <T> T unmarshal(Class<T> paramClass, byte[] paramArrayOfByte)
    throws BisException;

  public abstract <T> T unmarshal(Class<T> paramClass, byte[] paramArrayOfByte, boolean paramBoolean)
    throws BisException;

  public abstract <T> T unmarshal(byte[] paramArrayOfByte)
    throws BisException;

  public abstract <T> T unmarshal(byte[] paramArrayOfByte, boolean paramBoolean1, boolean paramBoolean2)
    throws BisException;

  public abstract <T> T unmarshal(byte[] paramArrayOfByte, boolean paramBoolean)
    throws BisException;
}
