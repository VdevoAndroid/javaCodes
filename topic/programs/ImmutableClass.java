package topic.programs;

public final class ImmutableClass {
	
	private final int id;
	private final String name;
	public int getId() {
		return id;	
	}
	public String  getName() {
		return name;	
	}
	
	public ImmutableClass(int a,String b) {
		this.id=a;
		this.name=b;
	}
	
	public static void main(String[] args) {
		ImmutableClass im=new ImmutableClass(1, "Vijay");
		System.out.println("Id: "+im.getId()+" Name: "+im.getName());
		
	}
	

}
