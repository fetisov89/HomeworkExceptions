package sky.pro;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        boolean result = Validator.validate("java_skyprogo",
                "D_1hWiKjjP_9",
                "D_1hWiKjjP_9");
        if (result) {
            System.out.println("Данные верны");
        } else {
            System.out.println("Данные не верны");
        }
    }
}
