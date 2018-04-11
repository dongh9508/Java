
public class CarInsurance {
   public static void main(String argv[]) {
      String name = argv[0];
      int produced = Integer.parseInt(argv[1]);
      int mileage = Integer.parseInt(argv[2]);
      String nationality = argv[3];
      String carType = argv[4];
      Car c = null;
      switch(carType) {
         case "Matiz" : c = new Matiz(name, 2017-produced, nationality);
         break;
         case "Sonata" : c = new Sonata(name, 2017-produced, nationality);
         break;
         default: System.out.println("Invalid Input Data"); System.exit(0);
      }
      c.setMil(mileage);
      c.insuranceRate();
      c.display();
   }
}
abstract class Car {
   static int base = 100000;
   double factor;
   int mil, insRate;
   int year;
   String name, nationality;
   Car(String name, int year, String nationality, double factor ) {
      this.name = name;
      this.year = year;
      this.nationality = nationality;
      this.factor = factor;
   }
   abstract String carType();
   int getMil() { //k m-> mile
      if (nationality.equals("US")) return (int) (mil / 1.6);
      else return mil;
   }
   void setMil(int ml) { // mile -> k m
      if (nationality.equals("US")) mil = (int) (ml * 1.6);
      else mil = ml;
   }
   int getInsRate() {
      if (nationality.equals("US")) return (int) (insRate /1200);
      else return insRate;
   }
   void insuranceRate() { insRate = base + (int) (mil / 10 * year * factor); }
   void display() {
      switch(nationality) {
         case "US" : System.out.println("Mr. "+name+"’s "+carType()+" has been running "+getMil()+"miles for last "+Integer.toString(year)+" years, and insurance rate is US$"+getInsRate()+" for a year.");
         break;
         case "KR" : System.out.println(name +"씨 "+carType()+"의 지난 "+year+"년 동안 운행거리는 "+mil+"km이며, 보험료는 년 "+getInsRate()+"원 입니다.");
         break;
         default : System.out.println("Invalid Input Data"); System.exit(0);
      }
   }
}
class Matiz extends Car {
   Matiz (String name, int year, String nt) { super (name, year, nt, 1.2); }
   String carType() {  return "Matiz"; }
}
class Sonata extends Car {
   Sonata (String n, int y, String nt) { super (n, y, nt, 1.5); }
   String carType() {  return "Sonata"; }
} 
