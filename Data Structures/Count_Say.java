//https://leetcode.com/problems/count-and-say/


public class Count_Say {
    public String countAndSay(int n) {
	    	StringBuilder sc=new StringBuilder("1");
	    	StringBuilder prev;
	    	int count;
	    	char say;
	        for (int i=1;i<n;i++){
	        	prev=sc;
	 	        sc=new StringBuilder();       
	 	        count=1;
	 	        say=prev.charAt(0);
	 	        
	 	        for (int j=1,len=prev.length();j<len;j++){
	 	        	if (prev.charAt(j)!=say){
	 	        		sc.append(count).append(say);
	 	        		count=1;
	 	        		say=prev.charAt(j);
	 	        	}
	 	        	else count++;
	 	        }
	 	        sc.append(count).append(say);
	        }	       	        
	        return sc.toString();
        
    }
}