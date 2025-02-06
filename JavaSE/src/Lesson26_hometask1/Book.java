package Lesson26_hometask1;

public class Book {
	String title;
	String author;
	int year;
	
	public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', year=" + year + "}";
    }
  
}
