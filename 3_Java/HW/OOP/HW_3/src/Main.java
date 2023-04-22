public class Main {
    public static void main(String[] args) {
        List linkedList = new List();
        linkedList.addFirst("Home");
        linkedList.addFirst("Work");
        linkedList.addFirst("3");

        for (String item: linkedList) {
            System.out.println(item);
        }

        System.out.println("First: " + linkedList.getFirst());
        linkedList.removeFirst();
        System.out.println(linkedList);

        for (String item: linkedList) {
            System.out.println(item);
        }
    }
}