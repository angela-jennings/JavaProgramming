package office_hours.Practice_05_11_2021;

import java.util.ArrayList;

public class NanukReplitTask {
  public static boolean nanuk(ArrayList<String> r, int way_stones, int boast){
        int foodFound = 0;
        for(String each : r){
            if(each.equals("nanuk")){
                way_stones --;
            }else{
                foodFound += Integer.parseInt(each);
            }
        }
      return way_stones >=0 && foodFound >= boast;
  }

    public static void main(String[] args) {

    }
}
