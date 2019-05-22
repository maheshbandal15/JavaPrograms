package concepts;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;

public class SystemExitInCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			System.exit(0); // exit successfully
//			System.exit(1); // exit abnormaly
			System.out.println("try");
		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
			System.out.println(disp());
		}
	}
	@SuppressWarnings("finally")
	private static int disp() {
		try {
			return 1;
//			throw new Exception();
		} catch (Exception e) {
			return 2;
		} finally {
			return 3;
		}
//		return 4;
	}

}
