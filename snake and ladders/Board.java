
class Board {
    private int pos1,pos2;
    Snakes sna=new Snakes();//snake fix
    Ladders lad=new Ladders();//ladder fix
    int getPos1(){
        return pos1;
    }
    int getPos2(){
        return pos2;
    }
    void setPos1(int set1){
        pos1=set1;
    }
    void setPos2(int set2){
        pos2=set2;
    }
    String player1;//player1 symbol
    String player2;//player2 symbol
    void setPlayer1(String n1){
        player1=n1;
    }
    void setPlayer2(String n2){
        player2=n2;
    }
    void getBoard(int pos1,int pos2){
        lad.Ladder_fix();
        sna.Snakes_fix();
        int no=1;
        int no2=1;
        for(int i=0;i<10
        ;i++){
            /*for(int j=0;j<10
            ;j++){
                System.out.print(" ________ ");
            }
            System.out.println("");*/
            for(int j=0;j<10
            ;j++){
                System.out.print(" ________ ");
            }
            System.out.println("");
            for(int j=0;j<10
            ;j++){
                if(no2==pos2 && no2==pos1) System.out.print("|   "+player2+player1+" |");//here is the line where player appears
                else{
                    if(no2==pos2 ) System.out.print("|  "+player2+"    |");//here is the line where player appears
                    if(no2==pos1 ) System.out.print("|   "+player1+"   |");//here is the line where player appears
                    else if(no2!=pos1 &&no2!=pos2)  System.out.print("|        |");
                }
                no2++;
            }
            System.out.println("");
            for(int j=0;j<10
            ;j++){
                if (no<=9) System.out.print("|_______"+no+"|");
                else{
                    if(sna.snakes.containsKey(no)) {
                        if(sna.snakes.get(no)<=9) System.out.print("|"+sna.snakes.get(no)+"_____"+no+"|");
                        else System.out.print("|"+sna.snakes.get(no)+"____"+no+"|");
                    }
                    else if(lad.Ladder.containsKey(no)) System.out.print("|"+lad.Ladder.get(no)+"____"+no+"|");
                    else System.out.print("|______"+no+"|");
                }
                no++;
            }
            //2|      3
            System.out.println("");
            /*for(int j=0;j<10
            ;j++){
                System.out.print("|________|");
            }
            System.out.println("");*/
        }

            /*System.out.println(" ______");
            System.out.println("|      |");
            System.out.println("|      |");
            System.out.println("|______|");*/
    }
}
