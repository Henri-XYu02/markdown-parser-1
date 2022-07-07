import static org.junit.Assert.*;
import org.junit.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks(){
        try{
            assertEquals(MarkdownParse.getLinks(Files.readString(Path.of("test-file.md"))), List.of("https://something.com","some-thing.html"));
        }catch(Exception e){} 
    }

    
}