package WeekTwo;
import javax.swing.* ;
public class Usermath {
    public static void main(String[] args) {
        int fnum = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        int snum = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        int sum =(fnum + snum);
         System.out.printf("%d + %d = %d", fnum, snum, sum);
         int rem = (fnum - snum);
        System.out.printf("\n%d - %d = %d", fnum, snum, rem);
        int prod = (fnum * snum);
        System.out.printf("\n%d * %d = %d", fnum, snum, prod);
        double div = (fnum/snum);
        System.out.printf("\n%d / %d = %.2f", fnum, snum, div);
        double fsqrt = (java.lang.Math.sqrt(fnum));
        double ssqrt = (java.lang.Math.sqrt(snum));
        System.out.printf("\n The Square root of %d is %.2f.\nThe Square root of %d is %.2f.", fnum, fsqrt, snum, ssqrt);
        double pow = (java.lang.Math.pow(fnum, snum));
        System.out.printf("\n%d^(%d) = %.2f", fnum, snum, pow);
        double flog = java.lang.Math.log(fnum);
        double slog = java.lang.Math.log(snum);
        System.out.printf("\nThe log base e of %d is %.2f.\nThe log base e of %d is %.2f.", fnum, flog, snum, slog);
    }
}
