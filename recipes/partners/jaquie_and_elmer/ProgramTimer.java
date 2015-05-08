/**
 *  In doing this class, we got help from Princeton's Algortirhm textbook.
 *  It was interesting to see how a program can be timed using a built-in java
 *  function.
 */


public class ProgramTimer { 

    private final long start;

   /**
     * Create a ProgramTimer object.
     */
    public Stopwatch() {
        start = System.currentTimeMillis();
    } 

    /**
     * Return elapsed time (in seconds) since this object was created.
     */
    public double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }

} 