package estructuradedatos;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class main {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		
		list.add("Pedro");
		list.add("Maria");
		list.add("Jose");
		list.add("Manuel");
		
		//obtener un intinerador y recorrer la lista 
		
			Iterator iter = list.iterator();
			while(iter.hasNext())//indica si hay elementos en la lista hasNext {
				
				System.out.println(iter.next());
				
			}
	}


