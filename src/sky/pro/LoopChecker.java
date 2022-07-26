package sky.pro;

public class LoopChecker implements Checker{
    public static final String ValidCharacter = "0123456789_abcdifghijklmnoprstuvwxyzABCDIFGIJKLMNOPRSTUVWXYZ";
    @Override
    public void check(String s, boolean login) throws WrongLoginException, WrongPasswordException {
        for (int i = 0; i < s.length(); i++) {
            if (!ValidCharacter.contains(String.valueOf(s.charAt(i)))) {
                if (login) {
                    throw new WrongLoginException("Логин должен содержать только символы латинского алфавита, цифры и знак подчеркивания");
                } else {
                    throw new WrongPasswordException("Пароль должен содержать только символы латинского алфавита, цифры и знак подчеркивания");
                }
            }
        }
    }
}
