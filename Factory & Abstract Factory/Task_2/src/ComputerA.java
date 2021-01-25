import java.util.Scanner;

public class ComputerA implements ComputerCommon {
    private double cpuA = 1.8;
    private double mmuA = 4;
    @Override
    public void Display() {
        System.out.println("System Initialized with CPU : " + cpuA + "GHz," + "& MMU : " + mmuA + "KB.");
        ShapeFactory shapeFactory = new ShapeFactory();
        System.out.println("Shape to be Displayed?");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        if(choice.equalsIgnoreCase("Circle")) {
            System.out.println("What's the radius of your circle?");
            Scanner scC = new Scanner(System.in);
            double r = scC.nextDouble();
            if (r <= 100 && r >= 0) {
                Shape shp = shapeFactory.getShape("Circle");
                System.out.println("The Shape is Circle");
                System.out.println("The Surface Area of circle is : " + shp.Area(r, 0, 0));
                System.out.println("the Perimeter of circle is : " + shp.Perimeter(r, 0, 0));
                System.out.println("Resolution of image in this computer is 200*200");
            } else {
                System.out.println("The Circle Can't be shown in this computer!");
            }
        }
        if(choice.equalsIgnoreCase("Square")){
            System.out.println("What's the length of your Square?");
            Scanner scSqr = new Scanner(System.in);
            double l = scSqr.nextDouble();
            if(l<=200 && l>=0){
                Shape shp = shapeFactory.getShape("Square");
                System.out.println("The Shape is Square");
                System.out.println("The Surface Area of Square is : " + shp.Area(l,0,0));
                System.out.println("The Perimeter of Square is : " + shp.Perimeter(l,0,0));
                System.out.println("Resolution of image in this computer is 200*200");
            }
            else{
                System.out.println("The Square Can't be shown in this computer!");
            }
        }
        if(choice.equalsIgnoreCase("Rectangle")){
            System.out.println("What are the length and width of Rectangle?");
            Scanner scRec = new Scanner(System.in);
            double l = scRec.nextDouble();
            double w = scRec.nextDouble();
            if(l<=200 && w<=200 && l>=0 && w>=0){
                Shape shp = shapeFactory.getShape("Rectangle");
                System.out.println("The Shape is Rectangle");
                System.out.println("The Surface Area of Rectangle is : " + shp.Area(l,w,0));
                System.out.println("The Perimeter of Rectangle is : " + shp.Perimeter(l,w,0));
                System.out.println("Resolution of image in this computer is 200*200");
            }
            else {
                System.out.println("The Rectangle Can't be shown in this computer!");
            }
        }
        if(choice.equalsIgnoreCase("Triangle")){
            System.out.println("What are the lengths of the sides of Triangle?");
            Scanner scTr = new Scanner(System.in);
            double length1 = scTr.nextDouble();
            double length2 = scTr.nextDouble();
            double length3 = scTr.nextDouble();
            if(length1<=200 && length2<=200 && length3<=200){
                Shape shp = shapeFactory.getShape("Triangle");
                System.out.println("The Shape is Triangle");
                System.out.println("The Surface Area of the Triangle is : " + shp.Area(length1,length2,length3));
                System.out.println("The Perimeter of the Triangle is : " + shp.Perimeter(length1,length2,length3));
                System.out.println("Resolution of image in this computer is 200*200");
            }
            else{
                System.out.println("The Triangle Can't be shown in this computer!");
            }
        }
    }
}

