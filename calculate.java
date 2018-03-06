public class calculate {
	public static void main(String[] a) {
		System.out.println("Calculate...");
		int a0 = Integer.valueOf(a[0]);
		if (a0 == 1 || a0 == 2 || a0 == 3 ||a0 == 4) {
			int summ = 0;
			String oper = "";
			int a1 = Integer.valueOf(a[1]);
			int a2 = Integer.valueOf(a[2]);
			if (a0 == 1) {
				summ = a1+a2;
				oper = "+";
			}
			else if (a0 == 2) {
				summ = a1-a2;
				oper = "-";
			}
			else if (a0 == 3) {
				summ = a1*a2;
				oper = "*";
			}
			else if (a0 == 4) {
				summ = a1/a2;
				oper = "/";
			}
			System.out.println(a1+" "+oper+" "+a2+" = "+summ);
		}
		/*else if (a0 == '|') {
			a1 = a[1];
			a2 = a[2];
			summ = a1||a2;
		}*/
		else {
			System.out.println("!!!FATAL__ERROR");
		}
	}
}