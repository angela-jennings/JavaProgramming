package day32_arrays_split;

public class CountUsingSplit {
    public static void main(String[] args) {
        String cats = "bengal cat tabby cat persian cat no cat here and another cat type cat";
        String[] moreCats = cats.split(" ");
        int count = 0;
        for(String each : moreCats){
            if(each.contains("cat")){
                count ++;
            }
        }
        System.out.println(count);


        String[] catsArray = cats.split("cat");
        System.out.println("number of cat = " + (catsArray.length -1)); //will not show if there is cat at the end, minus one is to make sure you stop at last index number



    }
}
