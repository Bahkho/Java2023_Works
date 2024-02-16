public class Person {

    private String firstName;
    private String lastName;
    private boolean isInvited;

    public Person(String firstName, String lastName, boolean isInvited) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isInvited = isInvited;
    }
    public boolean isInvited() {
        return isInvited;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

}
class Friend extends Person {
    private String foodToBring;

    public Friend(String firstName, String lastName, boolean isInvited, String foodToBring) {
        super(firstName, lastName, isInvited);
        this.foodToBring = foodToBring;
    }

    @Override
    public String toString() {
        if (isInvited()) {
            return getFullName() + " is bringing " + foodToBring + ". They are invited to the party.";
        } else {
            return getFullName() + " is bringing " + foodToBring + ". They are NOT invited to the party.";
        }
    }
}

