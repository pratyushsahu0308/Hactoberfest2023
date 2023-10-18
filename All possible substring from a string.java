public class SubstringExample {
    public static void main(String[] args) {
        String input = "example"; // Replace this with your input string
        findAllSubstrings(input);
    }

    public static void findAllSubstrings(String input) {
        int length = input.length();

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                String substring = input.substring(i, j);
                System.out.println(substring);
            }
        }
    }
}
