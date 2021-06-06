package day50_inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Angela";
        p1.age = 31;

        p1.talk();
        p1.walk();
        p1.work("SDET");

        Teacher t1 = new Teacher();
        t1.teacherID = 123456;
        t1.teach("Coding Java");
        t1.name = "Koga";
        t1.age = 10;
        t1.talk();
        t1.walk();
        t1.work("Cuddle Buddy");

        Student s1 = new Student();
        s1.name = "Athena";
        s1.schoolName = "Cybertek";
        s1.study();
        System.out.println(s1.name + " attends " + s1.schoolName);
    }
}
