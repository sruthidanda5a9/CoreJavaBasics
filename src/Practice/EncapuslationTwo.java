package Practice;

public class EncapuslationTwo  {
	//static int d;
	public static void main(String args[])
	{
		EncapsulationUsing objectEncapsulationUsing = new EncapsulationUsing();
		objectEncapsulationUsing.height= 990;
		objectEncapsulationUsing.width = 100;
		/* here we are accessing the EncapsulationUsing class
		variable and changing its value it may cause the problem
		encapuslations main aim is to avoid this problems.
		*/
		/*
		 * the above two lines we are setting the height and width but we not follwing
		 * the standards
		 * this is problem , we should avoid this problem by making them private and 
		 * provide access with public methods
		 * 
		 */
		objectEncapsulationUsing.setWidthHeight1(900);
		System.out.println
		(objectEncapsulationUsing.height1 +"   "+ 
		objectEncapsulationUsing.width1);
		/*
		 * because of this setWidthHeight1
		 *  method we are following the standards to
		 * height and width
		 */
		
	}
	

}
