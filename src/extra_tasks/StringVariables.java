package extra_tasks;

public class StringVariables {
    public static void main(String[] args) {
        String fullName = "Angela Jennings";
        String lastName = "Jennings";

        if(fullName.contains(lastName)){
            System.out.println("same last name");
        }else{
            System.out.println("not the same last name");
        }

    }
}
/* Given two String variables. One is a full name and the second a last name. Check if the full name has the same last name as the other String.
    Ex:
        s: "james bond"
        s: "bond"
        output: Same last name

        s: "alex benji"
        s: "bond"
        output: Not the same last name
*/