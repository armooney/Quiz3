
public class Triangle {
	//establish variables in program
	private double side1;
	private double side2;
	private double side3;
	private double perimeter;
	private double s;
	private double area;
/**make a no arg constructor that automatically sets the default triangle to 1.0
 * by 1.0 by 1.0 units^3. 
 */

	public Triangle(){
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
/** make a constructor that takes in three parameters to create a custom triangle
 * 
 * @param s1
 * @param s2
 * @param s3
 */
	public Triangle(double s1, double s2, double s3){
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
/** return side lengths of the triangle
 * 
 * @return
 */
	public double getside1(){
		return side1;
	}
	public double getside2(){
		return side2;
	}
	public double getside3(){
		return side3;
	}
/** create a method that returns the perimeter of the triangle
 * 
 * @return
 */
	public double getPerimeter(){
		perimeter = side1 + side2 + side3;
		return perimeter;
	}
/** create a method that finds the area of all triangles given assigned or default
 * side lengths
 * @return
 */
	public double getArea(){
		s = (side1 + side2 + side3)/2.0;
		area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;
				
	}
/**create a method that will return a description of the triangle
 * 	
 * @return
 */
	public String description(){
		return "side 1 is " + side1 + " units in length, side 2 is " + side2
				+ " units in length, side 3 is " + side3 + " units in length, the"
						+ " perimeter is " + perimeter + " units, and the area is "
				+ area + " in units squared. "; 
	}
}
