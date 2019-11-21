class Monster{
	
	public final String SOUND = "BWAHAH";
	
	private int height = 12;
	private String prop = "Wand";
	private int position = 2;
	
	public String name = "Cookie Monster";
	
	// getter-methods
	public int getHeight() {
		return height;
	}
	
	public String getProp() {
		return prop;
	}
	
	public int getPosition() {
		return position;
	}
	
	//setter-methods
	public void setHeight(int h) {
		height = h;
		
	}
	
	public void setProp(String p) {
		prop = p;
	}
	
	public void setPosition(int pos) {
		position = pos;
	}
	
	private  attack() {
		System.out.println("Monster attack, run!");
	}
	//Constructor
	// does not have a return value - no VOID
	// used when new object is created, attributes can be initialised 
	public Monster(int h, String p, int pos) {
		this.height = h;
		this.prop = p;
		this.position = pos;
		
	}
	
	//public static void main(String[] args) {
	//	Monster Cookie = new Monster(90, "cookiejar", 20); //calls constructor
	// Accessing private variables from within the same class will work, but not from outside of class
	//	System.out.println(Cookie.height);
		
	}


public class MonsterTestClass
{
	public static void main(String[] args) {
		Monster Cookie = new Monster(90, "cookiejar", 20); //calls constructor
		System.out.println(Cookie.name);
		// System.out.println(Cookie.height); // ERROR as private variable cannot be accessed from outside of class
		System.out.println(Cookie.getHeight()); // this will work as using a public getter method
	
}
}