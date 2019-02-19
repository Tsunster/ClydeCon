package ClydeCon;

public class AddressTests {
    public static void main(String[] args) {
        Address testAddress = new Address();

        try {
            testAddress.setPostcode("PA17 5RN");
            System.out.println("Pass");
        }
        catch (InputVal e) {
            System.out.println("Fail");
        }

        try {
            testAddress.setPostcode("big 420");
            System.out.println("Fail");
        }
        catch (InputVal e) {
            System.out.println("Pass");
        }
    }
}
