
public class Lasagna {

  int MinutesInOven = 40;
  

    public static int expectedMinutesInOven(){
        return 40;
      
    }


    public static int remainingMinutesInOven(int minuteInCuptor) {
      
      return Lasagna.expectedMinutesInOven() - minuteInCuptor;
    }



    public static int preparationTimeInMinutes(int layers){
       return layers * 2;
    }



    public static int totalTimeInMinutes(int minuteInCuptor, int layers){
      return preparationTimeInMinutes(minuteInCuptor) + layers;
    }

  //public static void main(String[] args) {
   // Lasagna lasagna = new Lasagna();
  //  System.out.println(lasagna.totalTimeInMinutes(3,20));
 // }
}

