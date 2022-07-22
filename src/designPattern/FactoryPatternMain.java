package designPattern;

public class FactoryPatternMain {

	public static void main(String[] args) {

		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape1 = shapeFactory.getShape("Circle");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("Triangle");
		shape2.draw();
	}
}
