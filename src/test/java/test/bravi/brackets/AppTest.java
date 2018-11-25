package test.bravi.brackets;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void isValid_simple_structure() {
	    String bracketString = "(){}[]";
	    assertTrue(App.isValid(bracketString));
	}
	
	@Test
	public void isValid_nested_structure() {
	    String bracketString = "[{()}]";
	    assertTrue(App.isValid(bracketString));
	}
	
	@Test
	public void isValid_nested_complex_structure() {
	    String bracketString = "[{()}](){}";
	    assertTrue(App.isValid(bracketString));
	}
	
	@Test
	public void isNotValid_shufled_brackets() {
	    String jsonString = "[{(}](])({[)]{";
	    assertFalse(App.isValid(jsonString));
	}
	
	@Test
	public void isNotValid_opened_brackets() {
	    String jsonString = "[]{()}]]";
	    assertFalse(App.isValid(jsonString));
	}	

	@Test
	public void isNotValid_too_many_opened_brackets() {
	    String jsonString = "[()[[[{{{{";
	    assertFalse(App.isValid(jsonString));
	}
	
	@Test
	public void isNotValid_complex_brackets() {
	    String jsonString = "[]{()}]";
	    assertFalse(App.isValid(jsonString));
	}	
	
	@Test
	public void isValid_complex_brackets() {
	    String jsonString = "[][{()}]";
	    assertTrue(App.isValid(jsonString));
	}	

	
	@Test
	public void isNotValid_too_many_closed_brackets() {
	    String jsonString = "[{())))}}}]]";
	    assertFalse(App.isValid(jsonString));
	}	
	
	@Test
	public void isNotValid_nested_missing_closed_brackets() {
	    String jsonString = "[{()(}](){}";
	    assertFalse(App.isValid(jsonString));
	}
	
	@Test
	public void isValid_nested_brackets() {
	    String jsonString = "[{()()}](){}";
	    assertTrue(App.isValid(jsonString));
	}	

	@Test
	public void isNotValid_nested_closed_complex_brackets() {
	    String jsonString = "[{}}}]](){}[";
	    assertFalse(App.isValid(jsonString));
	}
	
	@Test
	public void isNotValid_Size() {
	    String jsonString = "[{}}}]](){}[";
	    assertFalse(App.isValid(jsonString));
	}	
}