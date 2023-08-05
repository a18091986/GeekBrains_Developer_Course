public class Main {

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>(4);

        String res = hashMap.put("+1", "n1");
        res = hashMap.put("+2", "n2");
        res = hashMap.put("+3", "n3");
        res = hashMap.put("+5", "n4");
        res = hashMap.put("+5", "n5");
        
        hashMap.remove("+3");
        
        for (HashMap.Entity element : hashMap) {
            System.out.println(element.key + " - " + element.value);
        }

    }

}