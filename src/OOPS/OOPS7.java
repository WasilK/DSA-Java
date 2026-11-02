package OOPS;

public class OOPS7 {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.schoolName = "MGM";

        Students s2 = new Students();
        s2.schoolName = "SJC";

        System.out.println(s1.schoolName + " " + s2.schoolName);
    }
}

class Students{
    String name;
    int rollNo;
    static String schoolName;
}
