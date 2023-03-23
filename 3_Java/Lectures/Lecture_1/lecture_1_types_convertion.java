public class lecture_1_types_convertion {
    public static void main(String[] args) {
        
        byte b = Byte.parseByte("12");
        System.out.println(b);
        // byte c = Byte.parseByte("1223"); // получим переполнение, т.к. тип byte позволяет хранить до 255

    }
    
}
