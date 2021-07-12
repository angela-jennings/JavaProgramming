package day61_exceptions_collections.elem_school_examples;

public class ElementarySchool {
    private int age;
    private String name;

    public ElementarySchool() {
    }

    public ElementarySchool(int age, String name) {
        setAge(age);
        setName(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 5 && age < 12){
            this.age = age;
        }else{
            throw new IllegalArgumentException("Age limit has been reached");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException ("Name cannot be empty");
        }
            this.name = name;
        }

    @Override
    public String toString() {
        return "ElementarySchool{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

