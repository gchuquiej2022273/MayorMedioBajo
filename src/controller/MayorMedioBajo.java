package controller;
import java.util.Arrays;

public class MayorMedioBajo {

    public MayorMedioBajo(int[] values) {
        Arrays.sort(values);
        System.out.println("El valor bajo es: " + values[0]);
        System.out.println("El valor medio es: " + values[1]);
        System.out.println("El valor mayor es: " + values[2]);
    }
}
