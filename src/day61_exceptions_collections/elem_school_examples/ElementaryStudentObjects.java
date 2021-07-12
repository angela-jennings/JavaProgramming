package day61_exceptions_collections.elem_school_examples;

public class ElementaryStudentObjects {
    public static void main(String[] args) {
        try {
            ElementarySchool student1 = new ElementarySchool();
            student1.setName("Koga");
            student1.setAge(15); //shows error
            System.out.println(student1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("--- CODE COMPLETED ---");


        ElementarySchool student2 = new ElementarySchool(11, "Athena");
        System.out.println(student2);

    }
}
