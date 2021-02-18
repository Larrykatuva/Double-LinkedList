
public class DoubleLinkedList {
	private Child firstChild;
	private Child lastChild;
	
	/*
	 * Double linked list constructor 
	 */
	public DoubleLinkedList() {
		this.firstChild = null;
		this.lastChild = null;
	}
	
	/*
	 * Checking if the linked list is empty
	 * Arguments: none
	 * Return: Boolean
	 */
	public boolean isEmpty() {
		return this.firstChild == null;
	}
	
	/*
	 * Inserting Child into the linked list
	 * Arguments: String name and Int age
	 * Returns: none
	 */
	public void insertFirst(int age, String name) {
		//Creating new Child instance
		Child newChild = new Child(age, name);
		
		//If the linked list is empty
		if(this.isEmpty())
			// newChild <-- lastChild
			this.lastChild = newChild;
		// newChild link --> old firstChild
		newChild.next = this.firstChild;
		// firstChild --> newChild link
		this.firstChild = newChild;
	}
	
	
	/*
	 * Inserting Child at the last of the linked list
	 * Arguments: String name, Int age
	 * Returns: none
	 */
	public void insertLast(int age, String name) {
		//Creating a new Child instance
		Child newChild = new Child(age, name);
		
		//If the liked list id empty
		if(this.isEmpty())
			// firstChild --> newChild
			this.firstChild = newChild;
		else
			// old lastChild --> newChild
			this.lastChild.next = newChild;
		// newChild <-- lastChild
		this.lastChild = newChild;
	}
	
	/*
	 * Deleting the first child in the linked list
	 * Arguments: none
	 * Returns: Child deletedChild
	 */
	public Child deleteFirstChild() {
		//Getting the first child
		Child deletedChild = this.firstChild;
		// if only one Child
		if(this.firstChild.next == null)
			// null <-- lastChild
			this.lastChild = null;
		// firstChild --> old next Child
		this.firstChild = this.firstChild.next;
		//return deleted child
		return deletedChild;
	}
	
	/*
	 * Displaying the linked list
	 * Arguments: none
	 * Returns: none
	 */
	public void displayLinkedList() {
		System.out.print("List (first-->last): ");
		//Starting at the beginning of the list
		Child currentChild = this.firstChild;
		//Looping until the end
		while(currentChild != null) {
			//printing the current child
			currentChild.displayChild();
			//Moving to the next child
			currentChild = currentChild.next;
			System.out.print(" ");
		}
	}
	

}
