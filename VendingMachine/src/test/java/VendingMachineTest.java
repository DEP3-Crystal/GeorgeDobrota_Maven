import static org.junit.jupiter.api.Assertions.*;

class VendingMachineTest {
    public static void main(String[] args) {
        double sum=5;
        double price=2;
        int[] result;
        result = VendingMachine.computeChange(sum,price);
        int[] expectresult= {0, 0, 0, 0, 0, 3};
        if(result==expectresult){
            System.out.println("Test ok");}
        else System.out.println("Test fail");
    }
}