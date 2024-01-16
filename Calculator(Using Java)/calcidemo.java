import java.util.*;
class calcidemo
{
	public static void main(String args[])
	{
		int choice;
		calci c = new calci();
		Scanner sc = new Scanner(System.in);
		System.out.println("*Welcome to calculator System***");
		System.out.println("Please Select Category");
		System.out.println("1.Algebric");
		System.out.println("2.Geometric");
		System.out.print("Enter you choice : ");
		choice = sc.nextInt();
		if(choice == 1)
		{// Algebric Equations
			System.out.println("**Algebric Equations**");
			System.out.println("1. (a+b)^2");
			System.out.println("2. (a+b)^3");
			System.out.println("3. (a-b)^2");
			System.out.println("4. (a)^2+(b)^2");
			System.out.println("5. (a+b)^2+(a-b)^2");
			System.out.println("6. (a)^3-(b)^3");
			System.out.println("7. (a)^4-(b)^4");
			System.out.println("8. (a+b+c)^3");
			System.out.println("9. (a+b+c)^2");
			System.out.println("10.(a-b-c)^2");
				
			System.out.print("Enter you choice : ");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
				// square Equations
				c.algebricSquare();
				break;
				
				case 2:
				// Cube Equations 
				c.algebriccube();
				break;
				
				case 3:
				//algebricminussquare
				c.algebricminussquare();
				break;
				
				case 4:
				//algebricasquareplusbsquare
				c.algebricasquareplusbsquare();
				break;
				
				case 5:
				//algebricaplusbsquareplusaminbsquare
				c.algebricaplusbsquareplusaminbsquare();
				break;
				
				case 6:
				//algebriccubemin
				c.algebriccubemin();
				break;
				
				case 7:
				//algebricfourmin
				c.algebricfourmin();
				break;
				
				case 8:
				//algebricabc
				c.algebricabc();
				break;
				
				case 9:
				//algebricabcsquare
				c.algebricabcsquare();
				break;
				
				case 10:
				//algebricabcminsquare
				c.algebricabcminsquare();
				break;
			}
		}
		else
		{// Geometric Equations
			System.out.println("***Geometric Equations***");
			System.out.println("1. Volume of cube");
			System.out.println("2. surface area of cuboid");
			System.out.println("3. Area of circle");
			System.out.println("4. circumference of circle");
			System.out.println("5. perimeter of rectangle");
			System.out.println("6. curved surface of area of cylinder");
			System.out.println("7. Total surface area of cylinder");
			System.out.println("8. curved surface area of cone");
			System.out.println("9. volume of cuboid");
			System.out.println("10. volume of cylinder");
				
			System.out.print("Enter you choice : ");
			choice = sc.nextInt();
			switch(choice)
			{
				
				case 1:
				// Volume of cube
				c.Volumeofcube();
				break;
				
				case 2:
				//surfaceareaofcuboid
				c.surfaceareaofcuboid();
				break;
				
				case 3:
				//Areaofcircle
				c.Areaofcircle();
				break;
				
				case 4:
				//circumferenceofcircle
				c.circumferenceofcircle();
				break;
				
				case 5:
				//perimeterofrectangle
				c.perimeterofrectangle();
				break;
				
				case 6:
				//curvedsurfaceofareaofacylinder
				c.curvedsurfaceofareaofacylinder();
				break;
				
				case 7:
				//totalsurfaceareaofcylinder
				c.totalsurfaceareaofcylinder();
				break;
				
				case 8:
				//curvedsurfaceareaofcone
				c.curvedsurfaceareaofcone();
				break;
				
				case 9:
				//volumeofcuboid
				c.volumeofcuboid();
				break;
				
				case 10:
				//volumeofcylinder
				c.volumeofcylinder();
				break;
			}	
		}		
	}
}