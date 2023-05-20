package solid.utils;

public class Persister implements Saveable {
    public Persister() {
    }

    @Override
    public void save(User user) {
        System.out.println("Save user: " + user.getName());
    }
}