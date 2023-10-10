package mediatheque;

import java.util.LinkedList;
import java.util.List;


public class Mediatheque {





	private final List<Item> items = new LinkedList<>();

	private final VisitorBook visitorBook= new VisitorBook();
	private final VisitorCD  visitorCD= new VisitorCD();
	private final VisitorGlobal visitorGlobal= new VisitorGlobal();
	

	public void addItem(Item i) {
		items.add(i);
	}
	
	
	public void printCatalog() {
		for (Item i : items)
			System.out.print(i.accept(visitorGlobal));
	}
	
	public void printOnlyBooks() {
		for(Item i : items)
		System.out.print(i.accept(visitorBook));
				
	}

	public void printOnlyCDs() {
		for(Item i : items)
		System.out.print(i.accept(visitorCD));
	}

}
