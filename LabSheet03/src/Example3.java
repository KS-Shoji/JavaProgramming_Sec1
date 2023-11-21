import javax.swing.JOptionPane;
import java.text.*;
import javax.swing.*;
public class Example3 {

	public static void main(String[] args) {
		DecimalFormat w = new DecimalFormat("##.0");
		
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight:"));
		double height = Double.parseDouble(JOptionPane.showInputDialog("Input Height:"));
		
		double heightM = height/100;
		double BMI = weight/(heightM*heightM);
		String BMIcategory;

		if (BMI<18.5) BMIcategory ="Underweight";
		else if (BMI<25) BMIcategory ="Normal-weight";
		else if (BMI<30) BMIcategory ="Over-weight";
		else BMIcategory ="Obesity";	
		
		JOptionPane.showMessageDialog(null, "BMI = "+String.format("%.1f",BMI) + "\nYou're " + BMIcategory, "BMI", JOptionPane.WARNING_MESSAGE);
		
		/*
		if (BMI < 18.5) {
			
			JOptionPane.showMessageDialog(null, "BMI = " + w.format(BMI) + "\nYou're Underweight" );
			
		}
		else if (BMI >= 18.5 && BMI <= 24.9 ) {
			JOptionPane.showMessageDialog(null, "BMI = " + w.format(BMI) + "\nYou're Normal-weight" );
		}
		else if (BMI >= 25.0 && BMI <= 29.9 ) {
			JOptionPane.showMessageDialog(null, "BMI = " + w.format(BMI) + "\nYou're Over-weight" );
		}
		else if (BMI >= 30 ) {
			JOptionPane.showMessageDialog(null, "BMI = " + w.format(BMI) + "\nYou're Obese" );
		}
		*/
		
		
		

	}

}
