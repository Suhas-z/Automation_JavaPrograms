package repeats.array.array_programs.practice;

public class Character_countofUpper_lower_special {

	public static void main(String[] args) {
		String s="Gimmy Loves Chocolate cakes but hates Chocolates 47823 &*&&^$%&*";
		
		int upper=0, lower=0, special=0, numeric=0;
		String upp="", low="", spl="", num="";
		
		for(int i=0; i<s.length() ;i++) {
			char ch=s.charAt(i);
			if(ch>=65 && ch<=90) {
				upper++;
				upp=upp+ch;
				
			}else if(ch>=97 && ch<=122) {
				lower++;
				low=low+ch;
				
			}else if(ch>='0'&& ch<='9') {
				numeric++;
				num=num+ch;
				
			}else if(ch!=' ') {
				special++;
				spl=spl+ch;
				}
			}
		System.out.println("uppercase characters are: "+ upp +" >>> no.of uppercase characters: "+ upper);
		System.out.println("lower characters are: "+ low +" >>> no.of lowercase characters: " + lower);
		System.out.println("number characters are: "+ num +" >>> no.of number characters: " + numeric);
		System.out.println("special characters are: "+ spl +" >>> no.of special characters: " + special);
			}
	
	}
		
		
			
		



