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
        ;
    }
    
    @Test
    public void testGetLinks1(){
        try{
            assertEquals(MarkdownParse.getLinks(Files.readString(Path.of("test-file.md"))), List.of("("));
        }catch(Exception e){} 
    }

    @Test
    public void testGetLinks2(){
        try{
            assertEquals(MarkdownParse.getLinks(Files.readString(Path.of("test-file2.md"))), List.of("https://google.com","some-thing.html"));
        }catch(Exception e){} 
    }

    @Test
    public void testGetLinks3(){
        try{
            assertEquals(MarkdownParse.getLinks(Files.readString(Path.of("test-file3.md"))), List.of("more text here"));
        }catch(Exception e){} 
    }

    @Test
    public void testGetLinks4(){
        try{
            assertEquals(MarkdownParse.getLinks(Files.readString(Path.of("test-file4.md"))), List.of("("));
        }catch(Exception e){} 
    }
}
