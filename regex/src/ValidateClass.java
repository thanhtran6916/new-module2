public class ValidateClass {
    public static void main(String[] args) {
        String regex = "^[ACP][0-9]{4}[a-zA-Z]*[GHIKLM]$";

        String[] string = {"C0318G", "M0318G", "P0323A"};
        for (int i = 0; i < string.length; i++) {
            System.out.println(string[i].matches(regex));
        }
    }
}
