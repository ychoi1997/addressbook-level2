package seedu.addressbook.data.tag;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

import seedu.addressbook.common.Utils;

public class UtilsTest {
	@Test
	public void containsNull_returnTrue() {
		Object[] arr = {"sdkjfsdf", 123123, null};
		boolean test = Utils.isAnyNull(arr);
		assertTrue(test);
	}
	
	@Test
	public void doesNotContainNull_returnFalse() {
		Object[] arr = {"qwe", "ert", "ert"};
		boolean test = Utils.isAnyNull(arr);
		assertFalse(test);
	}
	
	@Test
	public void isUnique_returnsTrue() {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("hi");
		arr.add("world");
		arr.add("testing");
		boolean test = Utils.elementsAreUnique(arr);
		assertTrue(test);
	}
}
