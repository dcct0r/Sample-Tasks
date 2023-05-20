package sample_6.defFactory;
public class Main {
    public static Human getHuman(HumanType type) {
        Human toReturn = null;
        switch (type) {
            case MALE:
                toReturn = new Rick();
                break;
            case FEMALE:
                toReturn = new Stella();
                break;
            default:
                throw new IllegalArgumentException("Wrong type: " + type);
        }
        return toReturn;
    }
    public static void main(String[] args) {
        Human man = getHuman(HumanType.MALE);
        Human girl = getHuman(HumanType.FEMALE);
        man.firstName();
        girl.firstName();
    }
}