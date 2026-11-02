package OOPS;

public class OOPS3 {
    public static void main(String[] args) {
        Student s1 = new Student("Wasil");
        s1.roll = 20;
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;



//        Student s2 = new Student();
        Student s3 = new Student(20);

        Student s4 = new Student(s1);
//        System.out.println(s4.roll);
        s1.marks[2] = 100;
        for(int i = 0; i < 3; i++){
            System.out.println(s4.marks[i]);
        }
    }
}

class Student{
    String name;
    int roll;
    int marks[];

    Student(){
        System.out.println("Constructor is called");
        marks = new int[3];
    }

    Student(String name){
        this.name = name;
        marks = new int[3];
    }

    Student(int roll){
        this.roll = roll;
        marks = new int[3];
    }

//    Student(Student s1){ // copy constructor // shallow copy
//        this.name = s1.name;
//        this.roll = s1.roll;
//        this.marks = s1.marks;
//    }

    Student(Student s1){ // copy constructor // deep copy
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i = 0; i < marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }
}
