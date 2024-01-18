import java.util.Scanner;

class Ranges{
	byte b=127;
	short s=32767;
	int i=327766;
	long l=9810635434l;
	float f=10/3f;
	double d=10/3d;
	void display(){
		
		System.out.println("Byte:"+b);
		System.out.println("Short:"+s);
		System.out.println("Int:"+i);
		System.out.println("Long:"+l);
		System.out.println("Float:"+f);
		System.out.println("Double:"+d);
	}
}

class demo3{
	public static void main(String args[]){
		Ranges r = new Ranges();
		r.display();
	}
}