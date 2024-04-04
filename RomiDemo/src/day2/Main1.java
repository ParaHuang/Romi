package day2;

public class Main1 {

	public static void main(String[] args) {
		//
		String[] names = {"Jack","Mike","J1n2","Alex","Jo","Jane","Jenny","John","Jonny","Julio","June","Jxn~"};
		//count how many names start with J_n____     ____ means at least one character
		int count = 0;
//		String regex = "J.n.";   //J_n_
		String regex = "J.n.+";   //J_n_______    ____ means at least one character
		
		for(String n:names) {
//			if(n.startsWith("J")) {
//				count++;
//			}
			if(n.matches(regex)) {//fully matches
				count++;
			}
			
		}
		System.out.println(count);
		
		
		//email
		//1. it should contain @ and .
		//2. @ and . can only exist for one time
		//3. @ and . can't be in the beginning  or in the end
		//4. @ and . can't next to each other, and . can't be in front of @
		
		String email = "paradox@163.com";    //xxxxxxx@xxxxxx.xxxxx
		String regex2 = "\\w+@\\w+[.]\\w+";
		if(email.matches(regex2)) {
			System.out.println(email+" is valid");
		}else {
			System.out.println("invalid");
		}
		
		//Chinese ID card
		//43012119901119732X
		//18character
		//first 17 have to be numbers
		//last one could be number or X
		String id = "43012199011197328";    //xxxxxxx@xxxxxx.xxxxx
		String regex3 = "\\d{17}[0-9X]";
		if(id.matches(regex3)) {
			System.out.println(id+" is valid");
		}else {
			System.out.println("invalid");
		}
		
		//2000-month-day
		//month
		//1-9  10-12
		//days
		//1-9     10-19    20-29   30-31
		String day = "2000-12-31";
		String regex4 = "2000-([1-9]|1[0-2])-([1-9]|[12]\\d|3[01])";
		if(day.matches(regex4)) {
			System.out.println(day+" is valid");
		}else {
			System.out.println("invalid");
		}
		
		 
		//use () before \\number
		String content = "12312";
//		String regex5 = "(\\w)\\w\\1\\w";	//nane   kike   ziza   mami   
		//String regex5 = "([a-zA-Z])\\1([a-zA-Z])\\2";//aabb   bbcc,has to be letters	
		String regex5 = "([1-9])(\\d)\\d\\2\\1";
		if(content.matches(regex5)) {
			System.out.println(content+" is valid");
		}else {
			System.out.println("invalid");
		}
		
		//10000~99999
		//12321   54345			has to be valid math 5-digit number  regex:  	
		//([1-9])(\d)\d\2\1
		
	}

}












