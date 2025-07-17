public class NNCollection {
    private NameNumber[] nnArray = new NameNumber[100];
    private int free;

    public NNCollection() {
        free = 0;
    }

  
public void insert(NameNumber n) {
    int index = free;
    for (int i = free; i > 0 && nnArray[i - 1].getLastName().compareTo(n.getLastName()) > 0; i--) {
        nnArray[i] = nnArray[i - 1];
        index = i - 1;
    }
    nnArray[index] = n;
    free++;
}

    public String findNumber(String IName) {
        for (int i = 0; i != free; i++) {
            if (nnArray[i].getLastName().equals(IName)) {
                return nnArray[i].getTelNumber();
            }
        }
        return new String("Name not found");
    }

    

    public boolean remove(String name) {
        for (int i = 0; i < free; i++) {
            if (nnArray[i].getLastName().equals(name)) {
                for (int j = i; j < free - 1; j++) {
                    nnArray[j] = nnArray[j + 1];
                }
                nnArray[free - 1] = null;
                free--;
                return true;
            }
        }
        return false;
    }

    public void printAll() {
    System.out.println("Danh ba:");
    for (int i = 0; i < free; i++) {
        System.out.println("Tên: " + nnArray[i].getLastName() + ", Số: " + nnArray[i].getTelNumber());
    }
}
}
