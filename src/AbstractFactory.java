import Shape.Shape;

public abstract class AbstractFactory {

	abstract Color getColor(AbstractFactoryPatternDemo.tipoColor tColor);
	abstract Shape getShape(AbstractFactoryPatternDemo.tipoShape tFigura);
}
