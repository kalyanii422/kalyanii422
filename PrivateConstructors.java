package tasksCoreJava;

public class PrivateConstructors {
	
	 private static PrivateConstructors prConstObj=null;

	   private PrivateConstructors(){
		   	//Empty Constructor
	   }
	   
	   public static PrivateConstructors testObject(){

           // This method ensures that only one object is created at a time

           if(prConstObj==null){

        	   prConstObj= new PrivateConstructors();

           }

     return prConstObj;

   }

   public void display(){

	   System.out.println("This is an example of a Private constructor !!!! ");

   }
   
	public static void main(String[] args) {
		
		PrivateConstructors newObject= PrivateConstructors.testObject();

        newObject.display();
	}
}
