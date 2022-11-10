
public class Subset {

	public static void main(String[] args) {
	    int[] a= {1,2,3,4,5,6,7,8};
	       int[] b= {2,5,1,8};
	       int count=0;
	       
	       
	       for(int i=0;i<b.length;i++) {
	    	   for(int j=0;j<a.length;j++) {
	    		   if(b[i]==a[j]) {
	    			  count++;
	    			  break;
	    		   }
	    	   }
	       }
	      if(count==b.length) {
	    	  System.out.println("b is subset of a");
	      }
	      else {
	    	  System.out.println("b is not subset of a");
	      }

	}

}
