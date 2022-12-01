//package p368_7_21;
//
//class Product {
//	int price;
//	int bonusPoint;
//
//	Product(int price) {
//		this.price = price;
//		bonusPoint = (int) (price / 10.0);
//
//	}
//
//	Product() {
//	}
//}
//
//class Tv extends Product {
//	Tv() {
//		super(100);
//	}
//
//	public String toString() {
//		return "Tv";
//
//	}
//
//	class Computer extends Product {
//		Computer() {
//			super(200);
//		}
//
//		public String toString() {
//			return "Computer";
//		}
//	}
//
//	class Audio extends Probuct {	// 오류
//		Audio() {
//			super(50);
//		}
//
//		public String toString() {
//			return "Audio";
//		}
//	}
//
//	class Buyer {
//		int money = 1000;
//		int bonusPoint = 0;
//		Product[]item = new Product[10];
//		int i =0;
//		
//		
//  		void buy(Product p) {
//			if (money < p.price) {
//				System.out.println(p + "을/를 구입하셨습니다.");
//				return;
//			}
//			money -= p.price;
//			bonusPoint += p.bonusPoint;
//			item[i++] = p;
//			System.out.println(p + "을/를 구입하셨습니다.");
//		}
//  		void summary() {
//  			int sum =0;
//  			String itemList = "";
//  			
//  			for(int i=0; i < item.length; i++) {
//  				if(item[i]==null)
//  					break;
//  				sum+=item[i].price;
//  				itemList += item[i] + ", ";
//  			}
//		System.out.println("현재 남은 돈은" + sum + "만원입니다.");
//		System.out.println("현재 보너스점수는" + itemList + "점입니다.");
//	}
//	}
