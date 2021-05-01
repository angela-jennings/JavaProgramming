package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testng, maven, cucumber";
        System.out.println(technologies.indexOf(",")); //4
        System.out.println(technologies.lastIndexOf(",")); //40 both return index postion for first and last comma

        int indexOfJava = technologies.indexOf("java");
        System.out.println("indexOfJava = " + indexOfJava); //java starts at index 0

        int idxOfCss = technologies.indexOf("css");
        System.out.println("idxOfCss = " + idxOfCss); //css starts at index 12

        int idxOfCucumber = technologies.indexOf("cucumber");
        System.out.println("idxOfCucumber = " + idxOfCucumber); //cucumber starts at index 42

        int idxOfCSharp = technologies.indexOf("C#");
        System.out.println("idxOfCSharp = " + idxOfCSharp); //returns -1 because c# is not found within technologies

        if(technologies.contains(("maven"))){
            System.out.println("contains maven");
        }else{
            System.out.println("does not contain maven");
        }
        if(technologies.indexOf("maven") >-1){
            System.out.println("sentence contains maven");
        }else{
            System.out.println("sentence does not contain maven");
}
    }
}
