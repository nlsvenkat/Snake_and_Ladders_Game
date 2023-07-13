import java.util.*;
class h {
    public static void main(String[] args){
        int pos1=4;
        int pos2=4;
        int no=1;
        int no2=1;
        String player1="+";//player1 symbol
        String player2="*";//player2 symbol
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(" ________ ");
            }
            System.out.println("");
            for(int j=0;j<3;j++){
                System.out.print("|        |");
            }
            System.out.println("");
            for(int j=0;j<3;j++){
                if(no2==pos2 && no2==pos1) System.out.print("|   "+player2+player1+"   |");//here is the line where player appears
                else{
                    if(no2==pos2 ) System.out.print("|   "+player2+"    |");//here is the line where player appears
                    if(no2==pos1 ) System.out.print("|   "+player1+"    |");//here is the line where player appears
                    else if(no2!=pos1 &&no2!=pos2)  System.out.print("|        |");
                }
                no2++;
            }
            System.out.println("");
            for(int j=0;j<3;j++){
                if (no<=9) System.out.print("|       "+no+"|");
                else System.out.print("|      "+no+"|");
                no++;
            }
            System.out.println("");
            for(int j=0;j<3;j++){
                System.out.print("|________|");
            }
            System.out.println("");
        }

            /*System.out.println(" ______");
            System.out.println("|      |");
            System.out.println("|      |");
            System.out.println("|______|");*/
    }
}
