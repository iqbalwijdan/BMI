/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bmi.bmiproject;
import java.util.Scanner;
/**
 *
 * @author IQBAL
 */
public class BMIPROJECT {
 
    public static void main(String[] args) throws Exception {
        KalkulatorBMI();
    }
 
    private static void KalkulatorBMI() throws Exception {
        System.out.print("Masukkan Berat Badan kg: ");
        Scanner s = new Scanner(System.in);
        float berat = s.nextFloat();
        System.out.print("Masukkan Tinggi Badan cm: ");
        float tinggi = s.nextFloat();
         
        float bmi = (100*100*berat)/(tinggi*tinggi);
         
        System.out.println("Hasil: "+bmi);
        rumusBMI(bmi);
         
    }

    private static void rumusBMI(float bmi) {
        if(bmi < 18.5) {
            System.out.println("Anda kekurangan berat badan");
        }else if (bmi < 25) {
            System.out.println("Anda Normal");
        }else if (bmi < 30) {
            System.out.println("Anda kelebihan berat badan");
        }else {
            System.out.println("Anda mengalami obesitas");
        }
    }
}