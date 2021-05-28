package day47_constructors;

public class Student {

    public Student() {
        System.out.println("No-Args constructor");
    }
    String name;
    int age;
    String gender;
    String university = "Cybertek University";

    public Student(String name, int age, String gender){
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
            this.gender = gender;
        }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", university='" + university + '\'' +
                '}';
    }

}

