package Class_Object;

/** Supportive class of Volume */


class Box{

private int length,breadth,height;

	public void showDimension(int l, int b, int h){

		System.out.print("Length = "+l);
		System.out.print("Breadth = "+b);
		System.out.print("Height = "+h);
	}

	public void setDimension(int l, int b, int h){

		length = l;
		breadth = b;
		height = h;
	}
}

 public class Volume{

	public static void main(String[] args)
	{

		/** */
		Box box = new Box();
		box.showDimension(4,5,6);
		box.setDimension(7,8,9);		
	
	}

}