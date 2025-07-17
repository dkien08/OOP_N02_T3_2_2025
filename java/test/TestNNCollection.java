public class TestNNCollection {
    public static void testNN() {
        NNCollection c = new NNCollection();
        c.insert(new NameNumber("Kien", "1234567"));
        c.insert(new NameNumber("Duc", "9876543"));
        c.insert(new NameNumber("An", "5555555"));
        c.insert(new NameNumber("Binh", "1111111"));
        c.insert(new NameNumber("Nam", "2222222"));

        System.out.println("Tìm số điện thoại của An: " + c.findNumber("An"));
        c.printAll();
        System.out.println("Xóa số điện thoại của Binh: " + c.remove("Binh"));
        c.printAll();
        System.out.println("Tìm số điện thoại của Binh: " + c.findNumber("Binh"));
    }
}
