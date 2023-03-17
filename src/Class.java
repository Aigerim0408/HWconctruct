import java.util.Arrays;

public class Class {
    String name;
    String phoneNum;
    int [] massiv;

    public Class(String name,String phoneNum, int[]massiv) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.massiv = massiv;

    }

    @Override
    public String toString() {
        return "Class{" +
                "name: " + name + "\n" +
                "phoneNum: " + phoneNum +"\n"+
                "massiv: " + Arrays.toString(massiv);
    }
}
