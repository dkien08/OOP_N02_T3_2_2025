public class TestUser {
    public static void testUser(){
        User.setUser("Duc Kien","Sd@12345");
        System.out.println("User Name: " + User.getUser() + ", Password: "+ User.getPassword());
    }
}
