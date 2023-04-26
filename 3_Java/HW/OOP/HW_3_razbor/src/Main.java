public class Main {
    public static void main(String[] args)
    {
        ListNodes listNodes = new ListNodes();
        listNodes.addLast(5);
        listNodes.addLast(6);
        listNodes.addLast(7);
        listNodes.addLast(4);

//        listNodes.printList();

        for (Integer data: listNodes) {
            System.out.println(data);
        }
    }
}