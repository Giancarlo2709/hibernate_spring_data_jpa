package guru.springframework.sdjpa.intro.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

/**
 * Created By Giancarlo on 20/12/2022.
 */
@Entity
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String title;
  private String isbn;
  private String publisher;

  public Book() {
  }

  public Book(String title, String isbn, String publisher) {
    this.title = title;
    this.isbn = isbn;
    this.publisher = publisher;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Book book = (Book) o;

    return Objects.equals(id, book.id);
  }

  @Override
  public int hashCode() {
    return id != null ? id.hashCode() : 0;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }
}
