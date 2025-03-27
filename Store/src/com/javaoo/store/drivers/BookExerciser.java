package com.javaoo.store.drivers;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.javaoo.store.Book;

public class BookExerciser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String location = "/Users/paulo/eclipse-workspace-coursera/Store/src/com/javaoo/store/books.txt";
		
		List<Book> books = readBooksFromFile(location);
		
		System.out.println();
		
		for (Book book : books) {
			System.out.println(book.getTitle());
		}
		
	}
	
	public static List<Book> readBooksFromFile(String name) {
		
		List<Book> books = null;
		
		try (
				FileInputStream inFile = new FileInputStream(name);
				InputStreamReader inReader = new InputStreamReader(inFile);
				LineNumberReader lineReader = new LineNumberReader(inReader);
			) {
			
			books = new ArrayList<>();
			String line;
			while ((line = lineReader.readLine()) != null) {
				System.out.printf("%d: %s%n", lineReader.getLineNumber(), line);
				String title = line;
				String author = lineReader.readLine();
				double price = Double.parseDouble(lineReader.readLine());
				System.out.printf("Book: [Title: %s, Author: %s, Price: $%.2f%n", title, author, price);
				books.add(new Book(title, price, 5, author, null, "NON-FICTION"));
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return books;
	}

}
