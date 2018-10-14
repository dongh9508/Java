import java.util.Scanner;;

class Shape{public Shape(){}}

class Line extends Shape{public Line(){}

public void draw(){System.out.println("Line");}}

class Rect extends Shape{public Rect(){}

public void draw(){System.out.println("Rect");}}

class Circle extends Shape{public Circle(){}

public void draw(){System.out.println("Circle");}}

public class Six{
	
 Scanner scan = new Scanner(System.in);
 
 int [] et = new int [10];
 int i = 0;
 
 void menu(){
	 
  while(true){
	  
   System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
   
   switch(scan.nextInt()){
   
   case 1 :
    System.out.print("도형 종류 Line(1), Rect(2), Circle(3)>>");
    et[i++] = scan.nextInt();
    break;
  
   case 2 : 
    System.out.print("삭제할 도형의 위치>>");
    int a = 0;
    a = scan.nextInt();
    if(et[a-1]==0){System.out.println("삭제할 수 없습니다.");}
    else {
     et[a-1] = 0;
     while(a<10){
      et[a-1] = et[a];
      a++;
     }
     et[9]=0;
              --i;
          }
    break;
    
   case 3 : 
    for(int i=0; i<et.length; i++){
     if(et[i]==1){Line line = new Line();line.draw();}
     else if(et[i]==2){Rect rect = new Rect();rect.draw();}
     else if(et[i]==3){Circle circle = new Circle();circle.draw();}
     else
      System.out.print("");
    }
    break;
    
   case 4 :
    scan.close();
    System.exit(0);
   }
  }
 }
 public static void main(String[] args){
 
	 Six graphic = new Six();
  
	 graphic.menu();
	 
 }
}


