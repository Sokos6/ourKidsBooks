package ourKidsBooks.model;

import java.util.List;
import ourKidsBooks.model.Author;

public class Book {
	private Long id;
	private Long categoryId;
	private String bookTitle;
	private List<Author> authors;
	private String publishersName;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public List<Author> getAuthors() {
		return authors;
	}
	
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	public String getPublishersName() {
		return publishersName;
	}
	public void setPublishersName(String publishersName) {
		this.publishersName = publishersName;
	}
	
	public String toString() {
        return "Book - Id: " + id + ", Book Title: " + bookTitle;
    }
	
}
