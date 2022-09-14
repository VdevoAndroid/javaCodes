package topic.programs;

public class OuterInnerClass {
	int a=10;
	private int b=20;
	static int c=30;
	class Inner {
		 public void sumVariable() {
			System.out.println("sum of all variable: "+(a+b+c));
		}
		
//		public static void main(String[] args) {
//			OuterInnerClass obj=new OuterInnerClass();
//			
//			OuterInnerClass.Inner obj1=obj.new Inner();
//			obj1.sumVariable();
//			
//			
//		}
	}
	
	

}
