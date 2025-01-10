# ArrayIndexOutOfBoundsException in Java

This repository demonstrates a common Java error: the `ArrayIndexOutOfBoundsException`. The `bug.java` file contains code that attempts to access an array element beyond its bounds, leading to this exception.  The solution is shown in `bugSolution.java`.

The exception occurs because arrays in Java are zero-indexed.  An array declared as `int[] arr = new int[5]` has valid indices from 0 to 4.  Attempting to access `arr[5]` causes the exception.

This example highlights the importance of careful array index handling in Java programming to prevent runtime errors.