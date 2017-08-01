package base;

public class IntegerSample {
    public static void main(String[] args) {
        System.out.println(isInt("1"));
        System.out.println(isInt("1a"));
    }

    public static boolean isInt(String string){
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
