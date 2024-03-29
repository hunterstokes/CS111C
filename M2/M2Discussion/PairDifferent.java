package M2.M2Discussion;

public class PairDifferent<T, S> {
	
	private T item1;
	private S item2;
	
	public PairDifferent(T item1, S item2) {
		this.item1 = item1;
		this.item2 = item2;
	}

	public T getItem1() {
		return item1;
	}

	public void setItem1(T item1) {
		this.item1 = item1;
	}

	public S getItem2() {
		return item2;
	}

	public void setItem2(S item2) {
		this.item2 = item2;
	}
	
	@Override
	public String toString() {
		return item1 + "\t" + item2;
	}
	
	public boolean sameItems() {
		return item1.equals(item2);
	}
	
	
	
	

}
