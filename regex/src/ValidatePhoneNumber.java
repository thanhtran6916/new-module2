public class ValidatePhoneNumber {
    public static void main(String[] args) {
        String regex = "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";
        String string = "(84)-(0978489648)";
        System.out.println(string.matches(regex));
    }
}
