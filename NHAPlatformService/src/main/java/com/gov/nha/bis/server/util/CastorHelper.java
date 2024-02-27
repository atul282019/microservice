/**
 * @author Vinay Kushwaha
 * @Email  vinaykushwaha85@gmail.com

 */
package com.gov.nha.bis.server.util;

import org.exolab.castor.mapping.Mapping;

public class CastorHelper implements Helper {

	private Mapping mapping = null;

	public CastorHelper(Mapping mapping) {
		this.mapping = mapping;
	}

	public Mapping getMapping() {
		return mapping;
	}

}
