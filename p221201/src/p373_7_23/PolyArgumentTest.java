package p373_7_23;

import java.util.*;

class Product{
	int price;
	int bonusPoint;
	
	Product (int price){
		this.price = price;
//		bounsPoint = (int)(price/10.0);		// 오류
	}
	Product(){
		price=0;
		bonusPoint=0;
			
	}
}

class Tv extends Product{
	Tv(){super(100);}
	public String toString() {return "Tv";}
}
class Computer extends Product{
	Computer(){super(200);}
	public String toString() {return "Computer";}
}
class Audio extends Product{
	Audio(){super(50);}
	public String toString() {return"Audio";}
}

public class PolyArgumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
