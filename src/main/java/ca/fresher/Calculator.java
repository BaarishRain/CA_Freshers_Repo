package ca.fresher;

import java.util.Stack;

public class Calculator {
	
	public String result(String expr){
		
		Stack<Double> stack = new Stack<Double>();
		String str[] = expr.split(" ");		
		int length =  str.length,i = 0;
	
		while(length > 0){
					
		 if (str[i].equals("+") || str[i].equals("-")  || str[i].equals("*")  || str[i].equals("/") || str[i].equals("^") ) {
				
			 double a,b;
			 if(!stack.isEmpty()){
				a = stack.pop();
			 } else {
				 return "Invalid expression";
			 }
			 if(!stack.isEmpty()){
				b = stack.pop();
			 } else {
				 return "Invalid expression";
			 }
				double result = 0;
				System.out.println(a+" "+b);
				
				switch(str[i]){
					case "+": result = b+a;break;
					case "-": result = b-a;break;
					case "*": result = b*a;break;
					case "/": result = b/a;break;
					case "^": result = (int)b^(int)a;
				}
				System.out.println("res "+result);
				stack.push(result);
				
		} else if(str[i].equals("%")){		
			
			double a = stack.pop();
			stack.push(a/100.0);	
			
		} else if(str[i].equals("^")){
			
			
		} else if(str[i].equals("!")){
			
			double a = stack.pop();
			stack.push(factorial(a));
			
		} else if(str[i].matches("-?[0-9]++.?[0-9]*+")){	
			 	
			stack.push(Double.valueOf(str[i]));
			System.out.println("push: "+Double.valueOf(str[i]));
			
		} else {		 
			return "Invalid expression";
		}						
			i++;
			length--;
		}
		
		String res = stack.pop().toString();		
		if(!stack.isEmpty()){
			return "Invalid expression";
		}
	
		return res;
	}
	
	public double factorial(double a){	
		return a*factorial(a-1);
	}
}
