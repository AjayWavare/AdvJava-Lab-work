package mavenfiles;

import java.util.List;

public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double cost;
	private List<Author> authors;

}
