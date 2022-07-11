package mavenfiles;

public class BookAuthorExample {

	public static void main(String[] args) {
		GenericDao dao = new GenericDao();
		// adding authors
		Author author = new Author();
		author.setName("elisabeth robson");
		author.setEmail("elisabeth@gmail.com");
		dao.save(author);
		
		
		//adding book alongwith author details
		Book book = new Book();
		book.setName("head first design pattern");
		book.setCost(2500);
		List<author> authors = new 
		book.setAuthors(authors);
		dao.save(book);
		
		//then mension authors of this book
		
		Book book =(book)dao.fetchById(Book.class,2);
		List<Author>authors = new ArraList<>();
		Authors.add(Authors)dao.fetchById(Author.Class,)
	}

}
