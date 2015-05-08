/* 
 * @author Ian F. Darwin
*/
public class CaseFormatting {
    public static void main(String[] args) {
        String name = "Java Cookbook";
        System.out.println("Normal:\t" + name);
        System.out.println("Upper:\t" + name.toUpperCase( ));
        System.out.println("Lower:\t" + name.toLowerCase( ));
        String javaName = "java cookBook"; // As if it were Java identifiers :-)
        if (!name.equals(javaName))
            System.err.println("equals( ) correctly reports false");
        else
            System.err.println("equals( ) incorrectly reports true");
        if (name.equalsIgnoreCase(javaName))
            System.err.println("equalsIgnoreCase( ) correctly reports true");
        else
            System.err.println("equalsIgnoreCase( ) incorrectly reports false");
            }
}

