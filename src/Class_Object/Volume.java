package Class_Object;

/** Box is the supportive class of Volume 
 * There are total 5 members in this class. 3 variable(length,breadth,height) and 2 functions(setDimension,showDimension).*/


class Box{

private int length,breadth,height; /** Here length,breadth,height are properties of the object.
									These variable are known as INSTANCE(means object) MEMBER VARIABLE.
 									Those member variable which are created after creating a new object are known as INSTANCE MEMBER VARIABLE.
 									Class k under bana hua variable INSTANCE MEMBER VARIABLE kehlata hai*/

	/** Here setDimension and showDimension are INSTANCE MEMBER FUNCTION hai.
	 * Inko call karne k liye bhi hame object banane ki jarurat padegi.
	 * ISse Object.(dot) laga k hi call kar sakte hai.*/




	public void setDimension(int l, int b, int h){
	
		length = l;
		breadth = b;
		height = h;
	}
	
	public void showDimension(int l, int b, int h){

		System.out.println("Length = "+l);
		System.out.println("Breadth = "+b);
		System.out.println("Height = "+h);
	}
	
}

/**In the same class we can't made 2 class as public */

 public class Volume{

	public static void main(String[] args)
	{

		/** In java Objects are created dynamically while in C++ objects are created both static and dynamically.
		 * Only by using, new we can create a new object.
		 * Here 'box' is the reference variable of the Object Box
		 * Reference variable is referred as the name of objects in java.
		 * If we have to access the objects of Box, then we have to use the reference variable of Box i.e. 'box'. 
		 * */
		
		Box box = new Box();
		box.showDimension(4,5,6);
		box.setDimension(7,8,9);		
	

		/**In this case, it will create a new reference variable of the object Box. 
		 * As we create a new object of Box, so in this case the reference variable point out the newly created Object.
		 * As we create a new object using same name in this case,new object is created and the old one is known as GARBAGE BLOCK.
		 *When garbage collectors runs,it will destroy GARBAGE BLOCK.
		 * */
		box = new Box();
		
	}

}