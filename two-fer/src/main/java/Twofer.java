import java.util.Optional;

public class Twofer {
    public String twofer(String name) {
        if (name == null) {
            return "One for you, one for me.";
        }
        else return String.format("One for %s, one for me.", name);
    }

    public static void main(String[] args) {
        System.out.println(new Twofer().twofer("Peter"));
    }
}