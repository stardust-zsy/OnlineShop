import java.util.HashMap;

public class test {

	public static void main(String[] args) {
		testAA("" + 1); // 1

//		testAA(""); // 2

		testAA("1" + 1); // 3

		testAA(333); // 4

		// BigDecimal b = new BigDecimal();
	}

	public static void testAA(int paraAA) {
		System.out.println(paraAA + 1);
	}

	public static void testAA(String paraBB) {
		System.out.println(new Integer(paraBB).intValue() + "1");
	}

	public void testAA(long paraCC) {
		HashMap<Long, String> testMap = new HashMap<Long, String>();
		testMap.put(paraCC, "+++");
		testMap.put(paraCC++, "---");
		System.out.println(testMap.get(0) + "7");
	}
}