import javax.swing.JOptionPane;
public class RectangleDemo1 {
	public static void main(String[] args) {
		
		/*
		double widthInput = Double.parseDouble(JOptionPane.showInputDialog("Input width"));
		double lengthInput = Double.parseDouble(JOptionPane.showInputDialog("Input length"));
		
		String colorInput = JOptionPane.showInputDialog("Input color");
		
		Rectangle obj1 = new Rectangle(widthInput,lengthInput,colorInput);
		
		JOptionPane.showMessageDialog(null, obj1.toString()+
				"\nArea of Rectangle = " + obj1.getArea());
		*/
		
		double widthInput = Double.parseDouble(JOptionPane.showInputDialog("Input width"));
		double lengthInput = Double.parseDouble(JOptionPane.showInputDialog("Input length"));
		
		String colorInput = JOptionPane.showInputDialog("Input color");
		
		Rectangle2 obj2 = new Rectangle2(widthInput,lengthInput);
		
		JOptionPane.showMessageDialog(null, obj2.toString()+
				"\nArea of Rectangle = " + obj2.getArea());
		
		
	}
	
}
