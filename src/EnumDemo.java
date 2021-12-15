
public class EnumDemo {

	public static void main(String[] args) {
		System.out.println(Drink.SMALL);//if enum is outside the class we can access enum using directly it's name. 
	   System.out.println(Drink.SMALL.value);
		System.out.println(MyClass.Car.SUV); //when enum is inside the class we need to enum using class name.
	}
}

//outside the class 
enum Drink{
	SMALL(1),BIG(2),LARGE(4),XLARGE(6);// objects of enum 
    int value;// this is used to store values for your constants 
    Drink(int k)
    { 
    	value =k;
    }
}

class MyClass{
	
	//inside the class 
	enum Car{
		SUV,SEDAN,COMPACTSEDAN;
	}
	
}
