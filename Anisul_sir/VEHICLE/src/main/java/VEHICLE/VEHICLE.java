
package VEHICLE;
public class VEHICLE {
       int a;
       double b;
       String c;
       VEHICLE()
       {
           a=75;
           b=11.73 ;
           c="Tangil";
       }
       VEHICLE(String x)
       {
           c=x;
       }
       VEHICLE(double y,String z)
       {
           b=y;
           c=z;
       }
public static void main(String[] args) {
		VEHICLE s=new VEHICLE();
		VEHICLE s1=new VEHICLE("Appache");
		VEHICLE s2=new VEHICLE(103.78,"Rakibul");
		System.out.println(s.a+" "+" "+s.b+" "+"\nLocation:"+s.c);
		System.out.println("Vehicle type:"+s1.c);
		System.out.println("Vehicle number:"+s2.b+" "+"\nbiker name:"+s2.c);
	}
}