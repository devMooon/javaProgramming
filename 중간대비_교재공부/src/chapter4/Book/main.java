package chapter4.Book;

import java.util.Scanner;

public class main {
	
	public static void show(Book[] books) {
		for(Book b: books) {
			System.out.print("(" +b.getName() + ", " + b.getAutor() + ")");
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Book[] books = new Book[2];
		
		
		for(int i = 0; i < books.length; i++) {
			books[i] = new Book();
			System.out.print("제목>>");
			books[i].setName(s.nextLine());
			System.out.print("저자>>");
			books[i].setAutor(s.nextLine());
		}
		
		show(books);
	}

	

}
