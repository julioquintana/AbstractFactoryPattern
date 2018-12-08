import Shape.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(AbstractFactoryPatternDemo.tipoColor tColor) {
		if (tColor == null)		
			return null;
			
			if(AbstractFactoryPatternDemo.tipoColor.BLUE.equals(tColor)) {
				return new BlueImpl();
			}else if(AbstractFactoryPatternDemo.tipoColor.RED.equals(tColor)) {
				return new RedImpl();
			}else if(AbstractFactoryPatternDemo.tipoColor.GREEN.equals(tColor)) {
				return new GreenImpl();
			}		
			return null;
	}

	@Override
	Shape getShape(AbstractFactoryPatternDemo.tipoShape tFigura) {
		// TODO Auto-generated method stub
		return null;
	}



}
