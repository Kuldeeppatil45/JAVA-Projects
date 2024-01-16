import java.util.*;
class calci
{
	Scanner sc = new Scanner(System.in);
	
	//(a+b)^2
	public void algebricSquare()
	{
		int a,b,c;
		System.out.print("Enter value for a : ");
		a = sc.nextInt();
		System.out.print("Enter value for b : ");
		b = sc.nextInt();
		System.out.println("(a+b)^2 = a^2 + 2ab + b^2");
		System.out.println("\t=" +(a*a)+ " + " +(2*a*b)+ " + " +(b*b));
		c = (a*a)+(2*a*b)+(b*b);
		System.out.println("\t="+c);
	}
	
	//(a+b)^3
	public void algebriccube()
	{
		int a,b,c;
		System.out.print("Enter value for a : ");
		a = sc.nextInt();
		System.out.print("Enter value for b : ");
		b = sc.nextInt();
		System.out.println("(a+b)^3 = a^3 + 3a^2b + 3ab^2 + b^3");
		System.out.println("\t=" +(a*a*a)+ " + " +(3*a*a*b)+ " + " +(3*a*b*b)+" + "+(b*b*b));
		c = (a*a*a)+(3*a*a*b)+(3*a*b*b)+(b*b*b);
		System.out.println("\t="+c);
	}
	
	//(a-b)^2
	public void algebricminussquare()
	{
		int a,b,c;
		System.out.print("Enter value for a:");
		a=sc.nextInt();
		System.out.print("Enter value for b");
		b=sc.nextInt();
		System.out.println("(a-b)^2 = (a+b)^2 - 4ab");
		System.out.println("\t=" +(a+b)*(a+b)+ " - " + (4*a*b));
		c= (a+b)*(a+b)-(4*a*b);
		System.out.println("\t="+c);
	}
	
	//a^2+b^2
	public void algebricasquareplusbsquare()
	{
		int a,b,c;
		System.out.print("Enter value of a:");
		a=sc.nextInt();
		System.out.print("Enter value of b:");
		b=sc.nextInt();
		System.out.println("(a)^2+(b)^2 = (a-b)^2 + 2ab");
		System.out.println("\t=" +(a-b)*(a-b)+ " + "+(2*a*b));
		c=(a-b)*(a-b)+(2*a*b);
		System.out.println("\t="+c);
	}
	
	//(a+b)^2+(a-b)^2
	public void algebricaplusbsquareplusaminbsquare()
	{
		int a,b,c;
		System.out.print("Enter value of a:");
		a=sc.nextInt();
		System.out.print("Enter value of b:");
		b=sc.nextInt();
		System.out.println("(a+b)^2+(a-b)^2 = 2((a)^2+(b)^2)");
		System.out.println("\t=" +2*(a*a)+ " + "+(b*b));
		c=2*(a*a)+(b*b);
		System.out.println("\t="+c);
	}
	
	//(a)^3-(b)^3
	public void algebriccubemin()
	{
		int a,b,c;
		System.out.print("Enter value of a:");
		a=sc.nextInt();
		System.out.print("Enter value of b:");
		b=sc.nextInt();
		System.out.println("(a)^3-(b)^3 = (a-b)(a^2+ab+b^2)");
		System.out.println("\t="+(a-b)+ " * "+(a*a)+ " + "+(a*b)+ " + "+(b*b));
		c=(a-b)*(a*a)+(a*b)+(b*b);
		System.out.println("\t="+c);
	}
	
	//(a)^4-(b)^4
	public void algebricfourmin()
	{
		int a,b,c;
		System.out.print("Enter value of a:");
		a=sc.nextInt();
		System.out.print("Enter value of b:");
		b=sc.nextInt();
		System.out.println("(a)^4-(b)^4 = (a-b)(a+b)(a^2+b^2)");
		System.out.println("\t=" +(a-b)+ " * "+(a+b)+ " * "+(a*a)+(b*b));
		c=(a-b)*(a+b)*(a*a)*(b*b);
		System.out.println("\t="+c);
	}
	
	//(a+b+c)^3
	public void algebricabc()
	{
		int a,b,c,d;
		System.out.print("Enter value of a:");
		a=sc.nextInt();
		System.out.print("Enter value of b:");
		b=sc.nextInt();
		System.out.print("Enter value of c:");
		c=sc.nextInt();
		System.out.println("(a+b+c)^3 = (a)^3+(b)^3+(c)^3+3*(a+b)+(b+c)+(c+a)");
		System.out.println("\t="+(a*a*a)+ " + "+(b*b*b)+ " + "+(c*c*c)+ "+"+(3*(a+b))+ " + "+(b+c)+ " + "+(c+a));
		d=(a*a*a)+(b*b*b)+(c*c*c)+3*(a+b)+(b+c)+(c+a);
		System.out.println("\t="+d);
	}
	
	//(a+b+c)^2
	public void algebricabcsquare()
	{
		int a,b,c,d;
		System.out.print("Enter value of a:");
		a=sc.nextInt();
		System.out.print("Enter value of b:");
		b=sc.nextInt();
		System.out.print("Enter value of c:");
		c=sc.nextInt();
		System.out.println("(a+b+c)^2 = (a)^2+(b)^2+(c)^2 + 2ab + 2bc + 2ca");
		System.out.println("\t="+(a*a)+ " + " +(b*b)+ " + " +(c*c)+ "+" +(2*a*b)+ " + " +(2*b*c)+ " + " +(2*c*a));
		d=(a*a)+(b*b)+(c*c)+(2*a*b)+(2*b*c)+(2*c*a);
		System.out.println("\t="+d);
		
	}
	
	//(a-b-c)^2
	public void algebricabcminsquare()
	{
		int a,b,c,d;
		System.out.print("Enter value of a:");
		a=sc.nextInt();
		System.out.print("Enter value of b:");
		b=sc.nextInt();
		System.out.print("Enter value of c:");
		c=sc.nextInt();
		System.out.println("(a-b-c)^2 = (a)^2-(b)^2-(c)^2 - 2ab - 2bc - 2ca");
		System.out.println("\t="+(a*a)+ " - " +(b*b)+ " - " +(c*c)+ " - " +(2*a*b)+ " - " +(2*b*c)+ " - " +(2*c*a));
		d=(a*a)-(b*b)-(c*c)-(2*a*b)-(2*b*c)-(2*c*a);
		System.out.println("\t="+d);
	}
	
	//Volume of cube = (a)^3
	public void Volumeofcube()
	{
		double a;
		double b;
		System.out.print("Enter number :");
		a=sc.nextInt();
		System.out.println("Volume of cube : (a)^3");
		System.out.println("\t= ( " + a + " * " + a + " * " +a + " ) ");
		b=(a*a*a);
		System.out.println("\t="+b);
		System.out.println("Volume of cube is "+b);
	}
	
	//surface area of cuboid: 2(lb+bh+hl)
	public void surfaceareaofcuboid()
	{
		double l;
		double b;
		double h;
		double a;
		System.out.print("Enter a length:");
		l=sc.nextDouble();
		System.out.print("Enter a breadth:");
		b=sc.nextDouble();
		System.out.print("Enter a height:");
		h=sc.nextDouble();
		System.out.println("surface area of cuboid = 2(lb+bh+hl)");
		System.out.println("\t=2 * ("+(l*b)+ " + " +(b*h)+ " + "+(h*l)+ " )");
		a=2*(l*b)+(b*h)+(h*l);
		System.out.println("\t="+a);
		System.out.println("surface area of cuboid is "+a);
	}
	
	//Area of circle = 3.14*r*r
	public void Areaofcircle()
	{
		double r;
		double a;
		System.out.print("Enter radius:");
		r=sc.nextDouble();
		System.out.println("Area of circle = 3.14*r*r");
		System.out.println("\t= 3.14 * " + r + " * " + r );
		a=3.14*r*r;
		System.out.println("\t="+a);
		System.out.println("\tArea of circle is:"+a);
	}
	
	//circumference of circle = 2*3.14*r
	public void circumferenceofcircle()
	{
		int r;
		double c;
		System.out.print("Enter radius:");
		r=sc.nextInt();
		System.out.println("circumference of circle = 2*3.14*r");
		System.out.println("\t= 2 * 3.14 " +r);
		c=2*3.14*r;
		System.out.println("\t="+c);
		System.out.println("\tCircumference of circlr is "+c);
	}
	
	//perimeter of reactangle = 2*(l+b)
	public void perimeterofrectangle()
	{
		double p;
		double l;
		double b;
		System.out.print("Enter Length:");
		l=sc.nextDouble();
		System.out.print("Enter breadth:");
		b=sc.nextDouble();
		System.out.println("perimeter of reactangle = 2*(l+b)");
		System.out.println("\t= 2 * ("+l+ " + " +b + " ) ");
		p=2*(l+b);
		System.out.println("\t="+p);
		System.out.println("\tperimeter of rectangle is "+p);
	}
	
	//curved surface of area of a cylinder =  2*3.14*r*h
	public void curvedsurfaceofareaofacylinder()
	{
		double r;
		double h;
		double a;
		System.out.print("Enter radius:");
		r=sc.nextDouble();
		System.out.print("Enter height:");
		h=sc.nextDouble();
		System.out.println("curved surface of area of a cylinder =  2*3.14*r*h");
		System.out.println("\t= 2 * 3.14 * " + r + " * " +h);
		a=2*3.14*r*h;
		System.out.println("\t="+a);
		System.out.println("curved surface of area of cylinder is "+a);
	}
	
	//Total surface area of cylinder = 2*3.14*r*(r+h) 
	public void totalsurfaceareaofcylinder()
	{
		double r;
		double h;
		double a;
		System.out.print("Enter radius:");
		r=sc.nextDouble();
		System.out.print("Enter height:");
		h=sc.nextDouble();
		System.out.println("Total surface area of cylinder = 2*3.14*r*(r+h)");
		System.out.println("\t= 2 * 3.14 * " + r + " ( " + r + " + " + h + " ) ");
		a=2*3.14*r*(r+h);
		System.out.println("\t="+a);
		System.out.println("\tTotal surface area of cylinder is "+a);
	}
	
	// curved surface area of cone = 3.14*r*l
	public void curvedsurfaceareaofcone()
	{
		double r;
		double l;
		double a;
		System.out.print("Enter radius:");
		r=sc.nextDouble();
		System.out.print("Enter length:");
		l=sc.nextDouble();
		System.out.println("curved surface area of cone = 3.14*r*l");
		System.out.println("\t= 3.14 * "+ r + " * " +l);
		a=3.14*r*l;
		System.out.println("\t="+a);
		System.out.println("\tcurved surface area of cone is "+a);
	}
	
	// volume of cuboid = l*b*h
	public void volumeofcuboid()
	{
		double l;
		double b;
		double h;
		double a;
		System.out.print("Enter length:");
		l=sc.nextDouble();
		System.out.print("Enter breadth:");
		b=sc.nextDouble();
		System.out.print("Enter height:");
		h=sc.nextDouble();
		System.out.println("volume of cuboid = l*b*h");
		System.out.println("\t=" + l + " * " + b + " * " + h);
		a=l*b*h;
		System.out.println("\t="+a);
		System.out.println("\tvolume of cuboid is "+a);
	}
	
	// volume of cylinder = 3.14*r*r*h
	public void volumeofcylinder()
	{
		double r;
		double b;
		double h;
		System.out.print("Enter radius:");
		r=sc.nextDouble();
		System.out.print("Enter height:");
		h=sc.nextDouble();
		System.out.println("volume of cylinder = 3.14*r*r*h");
		System.out.println("\t= 3.14 * " + r + " * " + r + " * " + h);
		b=3.14*r*r*h;
		System.out.println("\t="+b);
		System.out.println("\tVolume of cylinder is "+b);
	}
	}
	
	