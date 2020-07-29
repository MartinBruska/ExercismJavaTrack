public class PangramChecker {

    public boolean isPangram(final String input) {
        String input1 = input.toLowerCase().replaceAll("[^a-zA-Z]", "");
        int len = (int) input1.chars().filter(letter -> (letter >= 'a' && letter <= 'z'))
                .distinct().count();
        System.err.println(len);
        return (!input1.equals("") && input1 != null && len == 26);
    }   
}
