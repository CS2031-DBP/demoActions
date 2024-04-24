package dbp.e2e.gabriel2.author.domain;

import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @Test
    void testSetUpAuthor(){
        Author author = new Author();
        author.setFirstname("Pepito");
        author.setLastname("Flores");
        assertEquals("Pepito", author.getFirstname());
        assertEquals("Flores", author.getLastname());
    }
}