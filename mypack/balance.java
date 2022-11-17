package mypack;


class balance{
   public double b;
    public String al;

 balance(String al,double b)
{
    this.al=al;
    this.b=b;

}

void show(){
if (b<=0)
 System.out.print("<--");
  System.out.println(al+": $"+b);
}
}
// class packagetrail{


// public static void main(String[] args) {
//      balance arrayli[]= new balance[3];
//      arrayli[0]=new balance("kartik",1000);
//      arrayli[1]=new balance("roraa", 450);
//      arrayli[2]= new balance("milna", 500);

//      for(int i=0;i<=2;i++)
//      {
//          arrayli[i].show();

//      }
//     }
// }