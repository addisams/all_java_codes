import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float prncple_amnt=in.nextFloat();
        float rte=in.nextFloat();
        float tme=in.nextFloat();
        double smpl_intrst=(prncple_amnt*rte*tme)/100;
        System.out.println(smpl_intrst);

    }
    
}
