package com.gov.nha.bis.security;

import java.security.cert.Certificate;

import com.gov.nha.bis.security.exception.BisException;

public interface CertificateTrustValidator {
  void validateCA(Certificate paramCertificate) throws BisException;
  
  void reloadCAStore();
}
