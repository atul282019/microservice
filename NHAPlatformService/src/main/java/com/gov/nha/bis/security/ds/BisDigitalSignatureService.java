package com.gov.nha.bis.security.ds;


import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import org.w3c.dom.Document;

import com.gov.nha.bis.security.exception.BisException;

public interface BisDigitalSignatureService {
  public static final int SIGNATURE_NOT_FOUND = 0;
  
  public static final int SIGNATURE_VALID = 1;
  
  public static final int SIGNATURE_INVALID = 2;
  
  Document sign(Document paramDocument) throws BisException;
  
  Document sign(Document paramDocument, boolean paramBoolean) throws BisException;
  
  boolean verify(Document paramDocument) throws BisException;
  
  boolean verify(Document paramDocument, String paramString) throws BisException;
  
  boolean verify(Document paramDocument, List<String> paramList) throws BisException;
  
  boolean verify(Document paramDocument, String paramString1, String paramString2) throws BisException;
  
  boolean verify(Document paramDocument, String paramString, List<String> paramList) throws BisException;
  
  boolean verify(Document paramDocument, int paramInt) throws BisException;
  
  OutputStream sign(InputStream paramInputStream) throws BisException;
  
  int verify(InputStream paramInputStream, String paramString) throws BisException;
}
