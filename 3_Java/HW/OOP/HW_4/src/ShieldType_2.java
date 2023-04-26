public class ShieldType_2 implements Protect{
    @Override
    public int save() {
        return 10;
    }

    @Override
    public String toString() {
        return String.format("ShieldType_2, max save: %d", save());
    }
}
