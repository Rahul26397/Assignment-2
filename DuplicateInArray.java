
public class DuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,1,2,3,4,5,3,6,7,8,7};
		int[] b=new int [100];
		int index=0;
		for(int i=0;i<a.length;i++) {
			int curr=a[i];
			for(int j=i+1;j<a.length;j++) {
				if(a[j]==curr) {
					b[index]=curr;
					index++;
				}
			}
		}
		System.out.println("the duplicate elements are:");
		for(int i=0;i<index;i++) {
			System.out.println(b[i]);
		}

	}

}
