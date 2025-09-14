package level2String;
public class return1 {
    public static void main(String[] args) {
        String str = "Java Programming";

        int length = 0;
        for (char _ : str.toCharArray()) {
            length++;
        }

        System.out.println("String: " + str);
        System.out.println("Length without length() = " + length);
    }
}