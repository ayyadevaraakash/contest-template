import java.io.*;
import java.util.*;

public class Solve {
    public static void solve() throws Exception {
    }

    public static void main(String[] args) throws Exception {
        int t = 1;
        // t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
        System.out.print(out);
    }
    
    // Fast Input (don't touch below code, it is optimized for CP)
    static final FastScanner sc = new FastScanner();
	static final StringBuilder out = new StringBuilder();

	static class FastScanner {
		private final BufferedInputStream in = new BufferedInputStream(System.in);
		private final byte[] buffer = new byte[1 << 16];
		private int ptr = 0, len = 0;

		private int read() throws IOException {
			if (ptr >= len) {
				len = in.read(buffer);
				ptr = 0;
				if (len <= 0) return -1;
			}
			return buffer[ptr++];
		}

		String next() throws IOException {
			int c;
			do c = read(); while (c <= ' ');
			StringBuilder sb = new StringBuilder();
			while (c > ' ') {
				sb.append((char) c);
				c = read();
			}
			return sb.toString();
		}

		char nextChar() throws IOException {
			return next().charAt(0);
		}

		int nextInt() throws IOException {
			int c;
			do c = read(); while (c <= ' ');
			int sign = 1;
			if (c == '-') {
				sign = -1;
				c = read();
			}
			int res = 0;
			while (c > ' ') {
				res = res * 10 + (c - '0');
				c = read();
			}
			return res * sign;
		}

		long nextLong() throws IOException {
			int c;
			do c = read(); while (c <= ' ');
			int sign = 1;
			if (c == '-') {
				sign = -1;
				c = read();
			}
			long res = 0;
			while (c > ' ') {
				res = res * 10 + (c - '0');
				c = read();
			}
			return res * sign;
		}
		
		double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
	}
}
