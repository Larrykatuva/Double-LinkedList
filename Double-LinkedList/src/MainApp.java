
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main running");
		//Making a new list
		DoubleLinkedList children = new DoubleLinkedList();
		
		//Inserting children
		children.insertFirst(7, "Ian");
		children.insertFirst(8, "Keziah");
		children.insertFirst(5, "Kayla");
		children.insertFirst(10, "Mumo");
		children.insertLast(6, "Esther");
		
		System.out.print("\n"+children.isEmpty()+"\n");
		
		//Display the children list
		children.displayLinkedList();
		System.out.print("\n");
		
		children.deleteFirstChild();
		
		children.displayLinkedList();
		System.out.print("\n");
	}

}
