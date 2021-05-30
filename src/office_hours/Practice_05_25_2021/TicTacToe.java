package office_hours.Practice_05_25_2021;

public class TicTacToe {
    public static void main(String[] args) {
        char[] game = {
                'X', 'X', 'X',
                '-', 'O', '-',
                '-', 'O', '-'
        };
        System.out.println(won(game));

    }
    public static String won (char[] x){
        String winner = "";
        for(int i= 0, y=0; y <x.length; i++, y+=3){

            /*
             HORIZONTAL:
         a[0] + a[1] + a[2]
         a[3] + a[4] + a[5]
         a[6] + a[7] + a[8]
             */

            String rows = "" + x[y] + x[y + 1] + x[y + 2];
            String columns = "" + x[i] + x[i+3] + x[i+6];
            String diagnol = "";

            if(i == 0 ){
                diagnol = "" + x[i] + x[i+4] + x[i+8];
            }else if(i == 2){
                diagnol = "" + x[i] + x[i+2] + x[i+4];
            }

            if(rows.equals("XXX") || columns.equals("XXX") || diagnol.equals("XXX")){
                winner = "Player X won";
            }else if(columns.equals("OOO") || rows.equals("OOO") || diagnol.equals("OOO")){
                winner = "Player O won";
            }

        }
   return winner;
    }
}
