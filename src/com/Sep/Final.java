package com.Sep;

 abstract class Eagle{
      final	int x=100;
      {
    	  System.out.println(x);
    	 // x=180; cannot be modify the final variable
      }
      
      
    abstract public void eat() ;
    abstract  public void fly();
    	 
     
      
      
}
final class SurpentEagle extends Eagle{
	final   public  void eat() {
  	  System.out.println("surpentEagle is eating");
    }
	
	
	 public void  fly() {
   	  System.out.println("surpentEagle is flying");
	 }
	
}
 /* class goldenEagle extends SurpentEagle{
	  public void eat() {
		  System.out.println("golenden eagle is eating");
	  }
	public void   fly() {
		
		System.out.println("golenden eagle is flying");
	}
}*/  //cannot inherit the final class



















public class Final {

	public static void main(String[] args) {
	Eagle	e =new SurpentEagle();
		System.out.println(e.x);
		e.eat();
		e.fly();

	}

}
