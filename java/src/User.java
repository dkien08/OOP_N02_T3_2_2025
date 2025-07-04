public class User {
    private static String userName;
    private static String userPassword;

    public static String getUser(){
        return userName;
    }
    public static String getPassword(){
        return userPassword;
    }
    public static void setUser(String name, String password){
        userName = name;
        userPassword = password;
    }
}
