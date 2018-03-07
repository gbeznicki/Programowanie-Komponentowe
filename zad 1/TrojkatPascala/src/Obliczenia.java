
public class Obliczenia {
	
	public static long silnia (long n) {
		long result=1;
		for (long factor = 2; factor <= n; factor++) {
            result *= factor;
        }

        return result;
	}
	
	public static long dwumian (long n, long k) {
		return (silnia(n)/(silnia(n-k)*silnia(k)));
	}
	
}
