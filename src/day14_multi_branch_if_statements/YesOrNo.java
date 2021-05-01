package day14_multi_branch_if_statements;

public class YesOrNo {
    public static void main(String[] args) {
        System.out.println("are you sure you want to delete this app");
        char selection = 'y';
        boolean answer;
        String result;

        if(selection == 'y'){
            System.out.println("your app will be deleted");
            answer = true;
            result = "deleted";
        }else{
            System.out.println("your app will not be deleted");
            answer = false;
            result = "not deleted";
        }
        System.out.println("did your file get deleted? " + answer);
    }
}
