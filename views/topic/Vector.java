/* WE made a vector class to have a representation of vectors. Researching the web, we noticed the 
Cosine Distance formula had three dimensional vectors. So we decided to go for three. We made two methods, o
one that used the cosine Distance formual and another method to calculate the index of the smallest vector.

**/

public class Vector {                         
    public int x;
    public int y;
    public int z;

    public Vector(int x1, int y1, int z1) {
        x = x1;
        y = y1;
        z = z1;
    }

	public int smallest_d_vector (Vector[] array){
		int count = 0;
		int index = 0;
		double distance = cosineDistance(array[0]);
		while (count < array.length) {
			if (cosineDistance(array[count]) < distance) {
				distance = cosineDistance(array[count]);
				index = count;
			}
			count += 1;
		}
		return index;

	}

    public double cosineDistance(Vector v2) {
        double temp = x * v2.x + y * v2.y + z * v2.z;
        double temp_2 = Math.sqrt(Math.abs(x * x) + Math.abs(y * y) + Math.abs(z * z));
        double temp_3 = Math.sqrt(Math.abs(v2.x * v2.x) + Math.abs(v2.y * v2.y) + Math.abs(v2.z * v2.z));
        return 1 - (temp / (temp_2 * temp_3)); 


	} 


	public static void main(String[] args) {
        Vector[] V = new Vector[3];
        V[0] = new Vector(1,2,3);
        V[1] = new Vector(1,2,2);
        V[2] = new Vector(6,9,3);
        V[3] = new Vector(5,3,10);
        Vector v  = new Vector(8,9,10);
        System.out.println(v.smallest_d_vector(V)); 
	}

}