import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Company implements Iterable<User>{
    private User user;
    public Company(User user){
        this.user = user;
    }

    private List<User> deepTree (User user) {
        List<User> subordinates = new ArrayList<>();
        subordinates.add(user);
        if (user.getSubordinates() == null || user.getSubordinates().getSize() == 0)
            return subordinates;
        for (User el: user.getSubordinates())
            subordinates.addAll(deepTree(el));
        return subordinates;
    }
    @Override
    public Iterator<User> iterator() {
        return new Iterator<User>() {
            List<User> iterUser = deepTree(user);
            Iterator<User> iterator = iterUser.iterator();
            @Override
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override
            public User next() {
                return iterator.next();
            }
        };
    }
}
