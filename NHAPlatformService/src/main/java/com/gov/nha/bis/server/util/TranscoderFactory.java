/**
 * @author Vinay Kushwaha
 * @Email  vinaykushwaha85@gmail.com

 */
package com.gov.nha.bis.server.util;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class TranscoderFactory
{
  private static XMLTranscoder transcoder;

  public static XMLTranscoder getDefaultTranscoder()
  {
    try
    {
      if (transcoder == null)
        transcoder = createNewTranscoder();
    }
    catch (Exception e) {
      return null;
    }

    return transcoder;
  }

  @SuppressWarnings({ "rawtypes", "unchecked" })
private static XMLTranscoder createNewTranscoder() throws IOException {
    List bindingFiles = new ArrayList();
    Enumeration resourceEnum = TranscoderFactory.class.getClassLoader().getResources("packaged/binding.xml");

    while (resourceEnum.hasMoreElements()) {
      bindingFiles.add(resourceEnum.nextElement());
    }
    return new CastorXMLTranscoderImpl((URL[])bindingFiles.toArray(new URL[0]));
  }
}