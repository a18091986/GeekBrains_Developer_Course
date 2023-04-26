public class ShieldType_1 implements Protect{
    @Override
    public int save() {
        return 7;
    }

    @Override
    public String toString() {
        return String.format("ShieldType_1, max save: %d", save());
    }
}
