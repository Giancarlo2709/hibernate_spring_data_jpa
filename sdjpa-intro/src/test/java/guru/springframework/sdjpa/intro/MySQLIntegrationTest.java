package guru.springframework.sdjpa.intro;

import static org.assertj.core.api.Assertions.*;

import guru.springframework.sdjpa.intro.repositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("local")
@DataJpaTest
@ComponentScan(basePackages = {"guru.springframework.sdjpa.intro.bootstrap"})
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class MySQLIntegrationTest {

  @Autowired
  BookRepository bookRepository;

  @Test
  void testMySQL() {
    long countBefore = bookRepository.count();
    assertThat(countBefore).isEqualTo(2);
  }
}
