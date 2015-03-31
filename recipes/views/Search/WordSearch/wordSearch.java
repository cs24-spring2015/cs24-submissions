public class wordSearch{
	public static void wordSearch(String prefix, boolean isPrefix, String[] w) {
		if isPrefix {
			String[] wMatching;
			for (str : w) {
				if (str.regionMatches(true, 0, prefix, 0, prefix.length())) { // check if it's matching
					wMatching.append(str);
				}
			}
		} 
		else { 
			//reverse it
			for (str : w) {
				str = new StringBuilder(str).reverse().toString();
			}
			// isPrefix code which returns a wMatching list
			String[] wMatching;
			for (str : w) {
				if (str.regionMatches(true, 0, prefix, 0, prefix.length())) { // check if it's matching
					wMatching.append(str);
				}
			}
			// reverse it back
			for (str : wMatching) {
				str = new StringBuilder(str).reverse().toString();
			}
		}
		return wMatching;
	}
}