package seedu.addressbook.data.person;

public class Contact {

    public String value;
    protected boolean isPrivate;

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
    @Override
    public String toString() {
        return value;
    }
}
