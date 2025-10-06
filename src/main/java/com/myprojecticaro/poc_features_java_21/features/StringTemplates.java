public class StringTemplates {
    public static void run() {
        int a = 5, b = 10;
        String result = STR."The sum of \{a} and \{b} is \{a + b}";
        System.out.println(result);
    }
}
