package book.app;

import book.vo.Book;

public class BookTest {
	public static void main(String args[]) {
		Book bookArray [] = new Book[] {
			new Book("IT", "SQL Plus", 50000, 5)
			, new Book("IT", "Java 2.0", 40000, 3)
			, new Book("IT", "JSP Servlet", 60000, 6)
			, new Book("Nobel", "davincicode", 30000, 10)
			, new Book("Nobel", "cloven hoof", 50000, 15)
		};

		double sumOfBookPrice = 0;	

		for(Book book : bookArray) {
			System.out.println(book);
			sumOfBookPrice += book.getBookPrice();
		}

		System.out.println("\n책 가격의 합 : " + sumOfBookPrice + "원");
	} 
}  
