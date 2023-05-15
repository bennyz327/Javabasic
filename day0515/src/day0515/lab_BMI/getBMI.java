package day0515.lab_BMI;

public class getBMI {

    public static double BMI(double weight, double height) {
        double bmi = weight/(height*height);
        return bmi*100*100;
    }

}
