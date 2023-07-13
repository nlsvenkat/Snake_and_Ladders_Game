class Dice_dia extends Dice{
    void ddia(int num){
        if(num==1){
        System.out.println("|       |");
        System.out.println("|   o   |");
        System.out.println("|       |");
        System.out.println("");
        }
        if(num==2){
            System.out.println("|o      |");
            System.out.println("|       |");
            System.out.println("|      o|");
            System.out.println("");
        }
        if(num==3){
            System.out.println("|o      |");
            System.out.println("|   o   |");
            System.out.println("|      o|");
            System.out.println("");
        }
        if(num==4){
            System.out.println("|o     o|");
            System.out.println("|       |");
            System.out.println("|o     o|");
            System.out.println("");
        }
        if(num==5){
            System.out.println("|o     o|");
            System.out.println("|   o   |");
            System.out.println("|o     o|");
            System.out.println("");
        }
        if(num==6){
            System.out.println("|o  o  o|");
            System.out.println("|       |");
            System.out.println("|o  o  o|");
            System.out.println("");
        }
    }
}
