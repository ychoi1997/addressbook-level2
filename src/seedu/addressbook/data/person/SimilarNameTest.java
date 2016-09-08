package seedu.addressbook.data.person;

import static org.junit.Assert.*;

import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class SimilarNameTest {
	@Test
	public void test() throws IllegalValueException {
		Name n1 = new Name("Nick");
		Name n2 = new Name("Nicky");
		assertTrue(n1.isSimilar(n2));
	}
}
