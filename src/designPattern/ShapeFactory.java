package designPattern;

public class ShapeFactory {

	public Shape getShape(String shapeType) {
		
		if (shapeType == null) {
			return null;
		}
		else if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();

		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();

		} else if (shapeType.equalsIgnoreCase("Triangle")) {
			return new Triangle();
		}

		return null;
	}
}
