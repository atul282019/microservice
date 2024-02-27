/**
 * @author Vinay Kushwaha
 * @Email  vinaykushwaha85@gmail.com

 */
package com.gov.nha.bis.server.util;

import java.io.ByteArrayOutputStream;

import com.ximpleware.AutoPilot;
import com.ximpleware.VTDGen;
import com.ximpleware.VTDNav;
import com.ximpleware.XMLModifier;

public class RemoveNameSpace {
		
	@SuppressWarnings("unused")
	public static String removeNameSpace(String xml) {
		
        try {
            VTDGen vg = new VTDGen(); 
    	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    	    vg.setDoc(xml.getBytes());
    	    vg.parse(false); 
    	    VTDNav vn = vg.getNav();
    	    AutoPilot ap = new AutoPilot(vn);
    	    XMLModifier xm = new XMLModifier(vn);
    	    ap.selectXPath("//@xmlns");
    	    int i=0;
    	    while((i=ap.evalXPath())!=-1){
    	      xm.remove();
    	    }
    	    xm.output(baos);

            return baos.toString();
        } catch (Exception e) {
            
        }
        return null;
    }

}
