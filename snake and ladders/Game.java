import java.util.*;
class Game {
   public static void main(String[] args){
      Scanner in=new Scanner(System.in);
      int fin_value=100;
      int pla1mov,pla2mov;
      Board b=new Board();
      System.out.println("enter player names line by line");
      String name1=in.nextLine();
      String name2=in.nextLine();
      String n1=name1.substring(0,1)+name1.substring(name1.length()-1);//taking first and last letters of name
      String n2=name2.substring(0,1)+name2.substring(name2.length()-1);//taking first and last letters of name
      b.setPlayer1(n1);
      b.setPlayer2(n2);
      Dice_dia dd=new Dice_dia();//dice fix
      Snakes sna=new Snakes();//snake fix
      Ladders lad=new Ladders();//ladder fix
      lad.Ladder_fix();
      sna.Snakes_fix();
      b.setPos1(1);
      b.setPos2(1);
      Dice dice=new Dice();
      //*System.out.println("Hello world");
      b.getBoard(1,1);
      System.out.println(b.player1+"'s turn");
      while(b.getPos1()<=fin_value && b.getPos2()<=fin_value){
         
         System.out.println("press enter to roll dice : ");
         String enter1= in.nextLine(); //Integer.parseInt(in.nextLine());
         if(enter1.equals("")) {
            pla1mov=dice.out();//dice for player1
            dd.ddia(pla1mov);
            //*System.out.println(pla1mov+"dice1");
         }
         else pla1mov=0;

         if(b.getPos1()+pla1mov>fin_value){
            System.out.println((b.getPos1()+pla1mov)+"number1>fin_value");
            System.out.println(b.getPos1()+"num1posi");
            b.setPos1(b.getPos1());
         }
         else{
            b.setPos1(b.getPos1()+pla1mov);
            
         }
         if(sna.snakes.containsKey(b.getPos1())) b.setPos1(sna.snakes.get(b.getPos1()));//snakes setting
         else if(lad.Ladder.containsKey(b.getPos1())) b.setPos1(lad.Ladder.get(b.getPos1()));//ladder setting
         b.getBoard(b.getPos1(),b.getPos2());//getting board
         System.out.println();
         System.out.println(b.player1+" in "+b.getPos1());//printing position of player 1

         if(b.getPos1()==fin_value){
            System.out.println(b.player1+"wins");
            break;
         }
         System.out.println(b.player2+"'s turn");






         System.out.println("press enter to roll dice : ");
         String enter2= in.nextLine();//Integer.parseInt(in.nextLine());
         if(enter2.equals("")){
            pla2mov=dice.out();//dice for player2
            dd.ddia(pla2mov);
            //*System.out.println(pla2mov+"dice2");
         }
         else pla2mov=0;
         
         if(b.getPos2()+pla2mov>fin_value){
            System.out.println(b.getPos2()+pla2mov+"number2>fin_value");
            //*System.out.println(b.getPos2()+"num2posi");
            b.setPos1(b.getPos1());
            System.out.println();
         }

         /*if(b.getPos2()+pla2mov>fin_value) b.setPos2(b.getPos2());//position for player2
         else b.setPos2(b.getPos2()+pla2mov);*/
         else b.setPos2(b.getPos2()+pla2mov);
         if(sna.snakes.containsKey(b.getPos2())) b.setPos2(sna.snakes.get(b.getPos2()));//snakes setting
         else if(lad.Ladder.containsKey(b.getPos2())) b.setPos1(lad.Ladder.get(b.getPos2()));//ladder setting

         b.getBoard(b.getPos1(),b.getPos2());//board getting
         System.out.println();
         System.out.println(b.player2+" in "+b.getPos2());//printing position of player 1
         if(b.getPos2()==fin_value){
            System.out.println(b.player2+"wins");
            break;
         }
         System.out.println(b.player1+"'s turn");
      }
      //*System.out.println("hello world");
   }

}
