public class Person {

    public boolean checkUser(String userName) {
        return (userName.length() > 7) && !userName.matches("[!@#$%^&*()_+=-{}/?|~`']*");
    }

    public boolean checkPassword(String password) {
        return (password.length() > 7) && password.matches("^(?=.*\\d)(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>])");
    }
}
