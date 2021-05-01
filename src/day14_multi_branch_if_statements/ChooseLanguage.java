package day14_multi_branch_if_statements;

public class ChooseLanguage {
    public static void main(String[] args) {

        int selection = 5;

        if(selection==1){
            System.out.println("hello, thank you for your call");
        }else if(selection==2){
            System.out.println("hola, gracias para llamar");
        }else if(selection==3){
            System.out.println("merhaba aradiginiz icin tesekkurler");
        }else if(selection==4){
            System.out.println("privet spasibo za vash zvonok");
        }else if(selection==5){
            System.out.println("merci pour votre appel");
        }else{
            System.out.println("lets talk java and english, hello");
        }
    }


}
