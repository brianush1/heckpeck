/** Returns 2**x % m */
public static long modpow2(long x, long m) {
	if (x == 1) return 2; else if (x < 1) return 1;
	if ((x & 1) == 1) {
		return (2 * modpow2(x - 1, m)) % m;
	} else {
		long l = modpow2(x / 2, m);
		return (l * l) % m;
	}
}
