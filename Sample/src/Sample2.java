
public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcdefg";
		// bcd to xyz
		String ss = "";
		char a[] = s.toCharArray();

		for (int i = 0; i < a.length; ++i) {
			if (a[i] == 'b') {
				a[i] = 'x';

				ss = ss + a[i];
			} else if (a[i] == 'c') {
				a[i] = 'y';

				ss = ss + a[i];
			}
			else if (a[i]=='d')
			{
				a[i] = 'z';

				ss = ss + a[i];
			}
			else
			{
				ss=ss+a[i];
			}
			
		}
		System.out.println(ss);

	}

}
