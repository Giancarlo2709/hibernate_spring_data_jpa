package guru.springframework.sdjpa.intro.repositories;

import guru.springframework.sdjpa.intro.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
