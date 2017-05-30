package src.model;

import java.util.Comparator;

public class ZeitComp implements Comparator<Telefonat>{

	@Override
	public int compare(Telefonat t1, Telefonat t2){
		
		return t2.getZeit().compareTo(t1.getZeit());
		
	}
	
}