public class Main {
  public static void main(String[] args) {
    String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    
    String bestCase = "A";

    // * Initialize startTime here
    long startTime = System.nanoTime();
    int bestIndex = match(text, bestCase);
    // * Initialize endTime here
    long endTime = System.nanoTime();
    // * Calculate elapsedTime here
    long elapsedTime = endTime - startTime;
    
    if (bestIndex >= 0) {
      System.out.println("best-case input matched at index " + bestIndex);
    } else {
      System.out.println("best-case input unmatched");   
    }
    System.out.println("The best elapsed time is "+ elapsedTime + " nanoseconds");

    String worstCase = "10";
    
    // * Initialize startTime here
    long startTime2 = System.nanoTime();
    int worstIndex = match(text, worstCase);
    // * Initialize endTime here
    long endTime2 = System.nanoTime();
    // * Calculate elapsedTime here
    long elapsedTime2 = endTime2 - startTime2;
    
    if (worstIndex >= 0) {
      System.out.println("worst-case input matched at index " + worstIndex);
    } else {
      System.out.println("worst-case input unmatched");  
    }
    System.out.println("The worst elapsed time is "+ elapsedTime2 + " nanoseconds");
  }

  // Return the index of the first match. -1 otherwise.
  public static int match(String text, String pattern) {
    for (int i = 0; i < text.length() - pattern.length() + 1; i++) {
      if (isMatched(i, text, pattern))
        return i;
    }

    return -1;
  }
	
  // Test if pattern matches text starting at index i
  private static boolean isMatched(int i, String text, 
      String pattern) {
    for (int k = 0; k < pattern.length(); k++) {
      if (pattern.charAt(k) != text.charAt(i + k)) {
        return false;
      }
    }
    
    return true;
  }
}