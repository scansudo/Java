package Notes;

/* public = The class is accessible by any other class (Typically only make public if you need too to ensure data security).
 * private = Accessible only within the declared class and accessed only by specific methods (Getters & Setters).
 * private = Encapsulation,  the process of hiding the internal details and data of an object and providing access 
 * to it only through well-defined public methods. It helps achieve data abstraction, data integrity, and modularity.
 * default = The  class is accessible only by classes in the same package.
 * protected = Same as default + subclasses can access protected methods/variables.
 * static = The method/variable belongs to every instance in the class rather than one specific instance/object.
 * void = returns no value.
 * final = The method or class could not be changed/overridden.
 * 
 * System.out.print("whatever you want\n") \n  = next line
 * Annotation = @Deprecated , @SuppressWarnings, @Override, @Target, @Documented
 */

public class aBasics{
	public static void main(String[] args){
		
		// Objects:
		
		String n = "Notes", k = "Java";
		int age = 13;
		double score = 3.14;
		char group = 'Z';
		boolean online = true;
		
		System.out.println(n);
		System.out.println(k);
		System.out.println(age);
		System.out.println(score);
		System.out.println(group);
		System.out.println(online);
		
		// Library:
		
		String firstName, lastName;
		firstName = "Tanner";
		lastName = "Williams";
		
		System.out.println("My name is " + firstName + " " + lastName);
		
		// Integers
		
		int y = 2 + 2;              
		System.out.println(y); // 4
		
		int sum = 3 + 3;         // 6
		int sub = sum - 4;      // 6 - 4 = 2
		int div = sum / sub;   // 6 / 2 = 3
		int mul = sum * sub;  // 6 * 2 = 12
		int pemdas = 2 * 3 + 6 / 2;   // 9 ... Follows PEMDAS
		int rem = 23;                // % = remainder
		int modulo = rem % 6;       // modulo = 5	
		int increment = 5;
		++increment;     // incr = 6	
		int decrement = 8;
		--decrement;     // decr = 7
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(div);
		System.out.println(mul);
		System.out.println(pemdas);
		System.out.println(modulo);
		System.out.println(increment);
		System.out.println(decrement);
		
		// Changing Values of an Object
		
		int prefix = 34;
		int pre = ++prefix; // values prefix & pre are now both = 35
		int postfix = 34;
		int post = postfix++; // postfix = 35 && post = 34
		System.out.println(pre);
		System.out.println(post);
		
		String change = "change";
		change = "string change";
		System.out.println(change);	// change is no longer "change" and now is "string change"
		
// Add,Sub,Multiply,Divide,Remainder. & (=) == Assign. (+=, -=, *=, /=, %=)
// The variable in front is now going to be assigned a new value which is determined by the condition before the assigned sign (=).
		
		int x1 = 4;
		int x2 = 8;
		x2 += x1;    // x2 is now = 12 (bc x2 + x1 = 12) but x1 stays the same (x1=4)
//      x2 -= x1;    // x2 = x2 - x1 ...x2 is now 4
//		x2 *= x1;    // x2 = x2 * x1 ...x2 = 32
//		x2 /= x1;
//		x2 %= x1;
		
		System.out.println(x2);
		
//////////////////////////////////////////////////////////////////////////////
//                          if(condition){} 					           //
//					  // Conditions (>, <, and =).					   	  //
//					  // Also || and && = and							 //
//////////////////////////////////////////////////////////////////////////
		
		int x = 4;
				if(x > 3) {
					System.out.print("Correct");
		}
				
		int j = 3;
				if(j < 1) {
					System.out.println("error");
				}else {
					System.out.println(" Correct");
		}
							
		int legalAge = 18;
				if(legalAge < 18) {
					System.out.println("error");
				}else if(legalAge <= 17) {
					System.out.println("error");
				}else if(legalAge >= 18) {
					System.out.println("Correct");
		}
						
		int barAge = 21;
		int entranceFee = 100;
				if(barAge < 21 || entranceFee < 100) {
					System.out.println("error");
				}else if(barAge >= 21 && entranceFee == 100){
					System.out.println("Correct");
		}
		
////////////////////////////////////////////////////////////////
//                     Switch-Case                           //
//////////////////////////////////////////////////////////////
				
		int day = 6;
			switch(day){
				case 1:
					System.out.println("Monday");
					break;
				case 2:
					System.out.println("Tuesday");
					break;
				case 3:
					System.out.println("Wednesday");
					break;
				default:
					System.out.println("Thursday");
		}
		
//////////////////////////////////////////////////////////////////////
//                            Loops (4)                            //
////////////////////////////////////////////////////////////////////
			
		// 1. while(condition){}	
			
			int r = 5;
		while (r > 1) {
			System.out.println(r);
			r--;					// 5,4,3,2,1
		}						  	

		// 2. for(Declare; Condition; Increment/Decrement){}
		
		for(int z = 0; z <= 10; z++) {
			System.out.println(z);}      // 0,1,2,3,4,5,6,7,8,9,10
		
		for(int d = 0; d <= 10; d=d+2) {
			System.out.println(d);}		// 0,2,4,6,8,10 (Only increment by even numbers)

		// 3. do{ ; }while(condition);
		
		int p = 13;
		do {
			System.out.println(p);
			p--;
		}while (p > 3);  // 13,12,11,10,9,8,7,6,5,4,3

		// 4. while(condition){;if(condition){};} 
		int g = 1;
		while(g > 0) {
			System.out.println(g);
			if(g == 4) {
				break;
			}
			g++;} // Wherever g = is where it is going to start from and increment till 4

////////////////////////////////////////////////////////////////////////
//                             Arrays                                //
//////////////////////////////////////////////////////////////////////
		
		String[] myNames = {"Drakeo", "Jason", "Caleb", "Ashley"};
		System.out.println(myNames[0]); // Drakeo

/////////////////////////////////////////////////////////////////////
		
		// Display the length of the array
		
		int[] intArr = new int[100];
		System.out.println(intArr.length); // 100

////////////////////////////////////////////////////////////////////
		
		// Add up all the numbers in the array
		
		int [] myArr = {6, 42, 3, 7};
		int arrSum = 0;
		
			for(int w = 0; w < myArr.length; w++) {
				arrSum += myArr[w];
			}
				System.out.println(arrSum); // 58

//////////////////////////////////////////////////////////////////////
//                        Multiple Arrays                          //
////////////////////////////////////////////////////////////////////
		
		int[][] examples = {{1,2,3,}, {4,5,6}};
		int f = examples[1][0];      // 1st [] = Array # 2nd [] = Digit within that array
		System.out.println(f);		// f = [Array 1][Digit 0]

		int[][] myMultiArr = {{1,2,3}, {4,5,6}, {7,8,9}};
		myMultiArr[0][2] = 42;		// Array[0]Digit[2] is no longer 3 and now is 42
		int e = myMultiArr[2][0];
		System.out.println(e);

/////////////////////////////////////////////////////////////////////
		
		int[] primes = {2,3,5,7};
			for(int t: primes) {
				System.out.println(t);
			}

/////////////////////////////////////////////////////////////////////
		
		int[][] multiArr = {{32,97,72},{25,30,47},{13,45,88}};
		multiArr[1][1] = 75;
		int ww = multiArr[1][1];
		int qq = multiArr[0][0];
		System.out.println(qq);        // 32 [Array 0][Digit 0]
		System.out.println(ww);        // 75 because of line 211
		
	}
}