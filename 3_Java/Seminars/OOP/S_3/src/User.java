public class User implements Comparable<User>{
    private String firstName;
    private String lastName;
    private int age;

    private Personal subordinates;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("\nUser: firstname: %s, lastname: %s, age: %d", firstName, lastName, age);
    }

    @Override
    public int compareTo(User o) {
//        return Integer.compare(this.age, o.age);
        int name_compare = this.firstName.compareTo(o.firstName);
        if (name_compare != 0)
            return name_compare;
        int lastname_compare = this.lastName.compareTo(o.lastName);
        if (lastname_compare != 0)
            return lastname_compare;
        else
            return this.age - o.age;
    }

    public void setSubordinates(Personal subordinates) {
        this.subordinates = subordinates;
    }

    public Personal getSubordinates() {
        return subordinates;
    }
}
