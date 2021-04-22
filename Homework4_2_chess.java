public class Homework4_2_chess {

  public static void main (String[] args){
   String[][] array=new String[8][8];
   int rez=0;
   for(int i=0; i<array.length; i++) {
    for (int f = 0; f < array[i].length; f++) {
     rez = i+f;
     if( rez%2==1){
      System.out.print("B"+"\t");
     }
     else if(rez%2==0){
      System.out.print("W"+"\t");
     }
     else{
      System.out.println("W");
     }
    }
    System.out.println();
   }

 }
}
