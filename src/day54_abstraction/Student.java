package day54_abstraction;

public abstract class Student {
    public void code(String language){
        System.out.println("Student is coding in " + language + " language");
    }
    public abstract void attendClass();
}

class OnlineStudent extends Student {
    @Override
    public void attendClass(){
        System.out.println("Student is attending class online");
    }
}

class CampusStudent extends Student {
    @Override
    public void attendClass(){
        System.out.println("Student is attending class in person");
    }
}

class School {
    public static void main(String[] args) {
        OnlineStudent student = new OnlineStudent();
        student.code("Java");
        student.attendClass();

        CampusStudent campStudent = new CampusStudent();
        campStudent.code("Ruby");
        campStudent.attendClass();
    }
}
