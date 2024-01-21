package interfaceex;

public class Customer implements Buy, Sell{

	@Override
	public void buy() {
		System.out.println("구매하기");
	}

	@Override
	public void sell() {
		System.out.println("판매하기");
	}

	 
 // 두 개의 부모로 부터 중복된  default 매서드는 충돌문제 발생 
	// 오버라이드 해야 함 
    @Override
	public void order() {
		System.out.println("고객 판매 주문");
	}
	
	  
}


