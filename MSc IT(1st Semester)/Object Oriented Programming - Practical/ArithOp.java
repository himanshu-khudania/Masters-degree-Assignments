class ArithOp{
	int add(int a, int b){
		return a+b;
	}
	
	int sub(int a, int b){
		return a-b;
		if(a-b < 0){
			return negative;
		}
		else return positive;
	}
	public static void main(String[] args){
		int sum;
		sum ob= new sum();
		ob.add(5,6);
		int diff;
		diff ob1= new diff();
		ob1.sub(5,6);
		System.out.println("Sum = "+ sum);
		System.out.println("Difference = "+ diff);
		
	}
}
