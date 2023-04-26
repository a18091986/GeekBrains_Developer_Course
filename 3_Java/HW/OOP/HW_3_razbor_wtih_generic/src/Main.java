public class Main {
    public static void main(String[] args)
    {
        ListNodes <Integer> listNodes = new ListNodes<>();
        listNodes.addLast(5);
        listNodes.addLast(6);
        listNodes.addLast(7);
        listNodes.addLast(4);

        for (Integer data: listNodes) {
            System.out.println(data);
        }

        ListNodes <String> listNodes_1 = new ListNodes<>();
        listNodes_1.addLast("asd");
        listNodes_1.addLast("sdf");

        for (String data: listNodes_1) {
            System.out.println(data);
        }
    }
}