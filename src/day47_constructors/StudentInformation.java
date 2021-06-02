package day47_constructors;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class StudentInformation {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student("Angela Jennings", 31, "female");

        System.out.println(st2);
    }

}
