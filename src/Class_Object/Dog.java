package Class_Object;

public class Dog{
	
	public static void main(String[] args){
		
		CommonCharacteristics cc = new CommonCharacteristics();
		cc.charac();
		cc.age(5);
		cc.breed("German");
		cc.color("Black");
		cc.size(25);
		cc.charac();
		
		
	}
}

class CommonCharacteristics{
	
	//common characteristics
	private int age,size;
	private String breed, color;
	
	
	//common actions
	public void age(int dogAge){
		age = dogAge;
	}
	
	public void size(int dogSize){
		size = dogSize;
	}
	
	public void breed(String dogBreed){
		breed = dogBreed;
	}
	
	public void color(String dogColor){
		color = dogColor;
	}
	
	public void  charac(){
		System.out.println("Age :: "+age);
		System.out.println("Size :: "+size);
		System.out.println("Breed :: "+breed);
		System.out.println("Color :: "+color);
	}
}
