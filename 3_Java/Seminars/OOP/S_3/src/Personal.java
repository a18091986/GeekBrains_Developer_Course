import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Personal implements Iterable<User> {
    List<User> users = new ArrayList<>();


    public int getSize () {
        return users.size();
    }

    @Override
    public Iterator<User> iterator() {
        return new Iterator<User>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < users.size();
            }
            @Override
            public User next() {
                return users.get(index++);
            }
        };
    }

    public Personal addUser(User user) {
        users.add(user);
        return this;
    }

    public List<User> toList() {
        List<User> users = new ArrayList<>();
        for (User user: this) {
            users.add(user);
        }
        return users;
    }
}

//    @Override
//    public void forEach(Consumer<? super User> action) {
//        Iterable.super.forEach(action);
//    }
//
//    @Override
//    public Spliterator<User> spliterator() {
//        return Iterable.super.spliterator();
//    }
//}
