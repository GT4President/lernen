
package src.model;

import java.util.Comparator;

public class TelNrComp implements Comparator<Telefonat>{

	@Override
	public int compare(Telefonat t1, Telefonat t2){
		
		return t1.getEigeneTelNr().compareTo(t2.getEigeneTelNr());
		
	}
	
}
