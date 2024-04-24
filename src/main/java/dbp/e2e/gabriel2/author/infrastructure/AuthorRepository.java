package dbp.e2e.gabriel2.author.infrastructure;

import dbp.e2e.gabriel2.author.domain.Author;
import jakarta.validation.constraints.Null;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    Optional<Author> findAllByFirstname(String name);
}
