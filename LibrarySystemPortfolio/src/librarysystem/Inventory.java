package librarysystem;


import java.util.ArrayList;

public class Inventory {
	
	private ArrayList<Book> inventory;
	private ArrayList<Book> borrowedBooks;
	
	public Inventory() {
		
		inventory = new ArrayList<>();
		borrowedBooks = new ArrayList<>();
		
		
		
	}
	
	
	public void addBook(Book book) {
		
		inventory.add(book);
		System.out.println("Book added to the library!");
		
		
		
	}
	
	
	public boolean borrowBook(int id) {
		
		for(int i = 0; i < inventory.size(); i++) {
			
			
			if(inventory.get(i).getId() == id) {
				
				borrowedBooks.add(inventory.get(i));
				inventory.remove(i);
				System.out.println("Book successfully borrowed");
				return true;
				
				
			}
			
			
			
		}
		
		System.out.println("Book not found or already borrowed!");
		return false;
		
	}
	
	public boolean returnBook(int id) {
		
		for (int i = 0; i < borrowedBooks.size(); i++) {
			
			if(borrowedBooks.get(i).getId() == id) {
				
				
				inventory.add(borrowedBooks.get(i));
				borrowedBooks.remove(i);
				System.out.println("Book successfully returns");
				return true;
			}
			
			
		}
		
		System.out.println("Book is not currently borrowed!");
		return false;
		
		
	}
	
	public void printAll() {
		
		
		if (inventory.isEmpty()) {
			
			System.out.println("No books available");
			return;
			
			
		}
		
		
		for(Book book : inventory) {
			
			book.printBookInfo();
			
		}
		
		
		
		
	}
	
	
	public void searchByTitle(String title) {
		
		boolean found = false;
		
		
		for (Book book : inventory) {
			
			if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
				
				book.printBookInfo();
				
				
				found = true;
				
				
				
			}
			
			
			
		}
		
		
		if(!found) {
			
			System.out.println("No matching book found!");
			
			
			
		}
		
		
		
	}
	
	public int getMainInventoryCount() {
		
		return inventory.size();
		
	}
	
	
	
	
	
}
