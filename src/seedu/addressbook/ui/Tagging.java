package seedu.addressbook.ui;

import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.tag.Tag;

public class Tagging {

	private TagStatus tagStatus;
	private final Person person;
	private final Tag tag;
	
	public enum TagStatus {
		ADDED, DELETED;
	}
	
	public Tagging(TagStatus ts, Person p, Tag t) {
		tagStatus = ts;
		person = p;
		tag = t;
	}
	
	public String toString() {
		String temp = "";
		if (tagStatus.equals(TagStatus.ADDED)) {
			temp = "+" + person.getName() + tag;
		} else if (tagStatus.equals(TagStatus.DELETED)) {
			temp = "-" + person.getName() + tag;
		}
		return temp;
	}
}
