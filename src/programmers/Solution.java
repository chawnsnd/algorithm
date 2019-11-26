package programmers;

public class Solution {

	public int solution(String[] lines) {
	      int answer = 0;
	      for(int i=0; i<lines.length; i++) {
	    	  String[] temp = lines[i].split(" ");
	    	  
	    	  //요청지속시간 str처리 
	    	  String strS = temp[1];
	    	  String[] strSArr = strS.split(":");
	    	  String strSHour = strSArr[0];
	    	  String strSMinute = strSArr[1];
	    	  System.out.println(strSArr[2]);
	    	  String strSSeconds = strSArr[2].split(".")[0];
	    	  String strSMillSeconds = strSArr[2].split(".")[1];
	    	  Long s = Long.parseLong(strSMillSeconds) +
	    			  Long.parseLong(strSSeconds)*1000 +
	    			  Long.parseLong(strSMinute)*1000*60 +
	    			  Long.parseLong(strSHour)*1000*60*60;
	    	  
	    	  //지속시간 str처리 
	    	  String strT = temp[2];
	    	  strT = strT.substring(0, strT.length()-1);
	    	  String[] strTArr = strT.split(".");
	    	  Long t;
	    	  if(strTArr.length==1) {
	    		  t = Long.parseLong(strTArr[0]);
	    	  }else {
		    	  String strTSeconds = strTArr[0];
		    	  String strTMillSeconds = strTArr[1];
		    	  t = Long.parseLong(strTMillSeconds)*1000 +
		    			  Long.parseLong(strTSeconds);
	    	  }
	    	  System.out.print(lines[i]+"  "+s+"  "+"  "+t);
	      }
	      return answer;
	  }
	
	
	public static void main(String[] args) {
		String[] lines = {
			"2016-09-15 20:59:57.421 0.351s",
			"2016-09-15 20:59:58.233 1.181s",
			"2016-09-15 20:59:58.299 0.8s",
			"2016-09-15 20:59:58.688 1.041s",
			"2016-09-15 20:59:59.591 1.412s",
			"2016-09-15 21:00:00.464 1.466s",
			"2016-09-15 21:00:00.741 1.581s",
			"2016-09-15 21:00:00.748 2.31s",
			"2016-09-15 21:00:00.966 0.381s",
			"2016-09-15 21:00:02.066 2.62s"
		};
		Solution solution = new Solution();
		int result = solution.solution(lines);
		System.out.println(result);
	}
}
