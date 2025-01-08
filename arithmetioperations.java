package day2;

public class arithmetioperations {
public static void main(String[] args) {
	int num =10;
    int num2=20;
    int num3=25;
    int num4=50;
    System.out.println("add:"+(num+num2));
	System.out.println("sub : "+(num-num2));
	System.out.println(num*num2);
	System.out.println(num/num2);
    System.out.println(num%num2);
    // relational operation 
    System.out.println( " relational operation "
);
    System.out.println(num<num2);
    System.out.println(num>num2);
    System.out.println(num>=num2);
    System.out.println(num<=num2);
    System.out.println(num==num2);
    System.out.println(num!=num2);
    // logical operation 
    System.out.println((num<num2)&&(num3<num4));
    System.out.println((num<num2)||(num3<num4));
    System.out.println("assignment operation");
    
    
    
    num += 12;
    System.out.println(num);
    num -= 12;
    System.out.println(num);
    num *= 12;
    System.out.println(num);
    num /= 10;
    System.out.println(num);
    num %= 12;
    System.out.println(num);
    
    
//    System.out.println(num);
//    //unaray operation
//    System.out.println(num++);
    
    
}

}


