import Shape.ShapeFactory;

public class FactoryProducer {
	 public static AbstractFactory getFactory(String choice){
		   
	      if(choice.equalsIgnoreCase("SHAPE")){
	    	  ShapeFactory sfac = new ShapeFactory();
	         return sfac;
	         
	      }else if(choice.equalsIgnoreCase("COLOR")){
	         return new ColorFactory();
	      }
	      
	      return null;
	   }

}
