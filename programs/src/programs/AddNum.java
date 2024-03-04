package programs;

public class AddNum {
	
	public int addNum(int a, int b) {
		
		return a+b;
	}

	public static void main(String[] args) {
		
		AddNum a = new AddNum();
		
		System.out.println("add numbers:"+a.addNum(10, 10));
	}

}
