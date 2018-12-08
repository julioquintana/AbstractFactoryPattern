import Shape.Shape;

public class AbstractFactoryPatternDemo {
	enum tipoShape{CIRCLE, SQUARE,RECTANGLE};
	enum tipoColor{RED, GREEN,BLUE};

	public static void main(String[] args) {
		//get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

	      //get an object of Shape Circle
		Shape shape1 = shapeFactory.getShape(tipoShape.RECTANGLE);

	}

}
