
public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 String s = "www.gaagle.com";
	
		 String vv[]=s.split("aa");
		 
		 String sal = null;
		 for(int i=0;i<vv.length;++i)
		 {
			 sal=vv[i];
			 
			 if(sal.contains("aa"))
			 {
				 sal.replace("aa", "oo");
			 }
		 }
	System.out.println(sal);
		
		int[] arr = {200,150,350,100,50};
		
		
		int largest=0;
		
		for(int i=0;i<arr.length;++i)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		System.out.println(largest);
		
	}

}
