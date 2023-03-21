package day17;

/* 제네릭 : 결정되지 않은 파라미터를 처리할때 사용한다,
 * 실제 객체를 사용할 때 파라미터 타입을 결정 대체
 * <T>, <K> 예)Map에서는<K><V>라고 사용하기도한다.
 * menu, price에 대한 자료형을 
 */
public class Sale<K,V> {
	//멤버변수 선언 menu, price
	private K menu;
	private V price;
	
	public Sale() {}
	public Sale(K menu, V price) {
		this.menu = menu;
		this.price = price;
		
	}
	public K getMenu() {
		return menu;
	}
	public void setMenu(K menu) {
		this.menu = menu;
	}
	public V getPrice() {
		return price;
	}
	public void setPrice(V price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "["+menu+":"+price+"]";
	}

}
