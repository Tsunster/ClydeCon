package ClydeCon;

public class KeeperTest {

        public static void main(String[] args) {
            Keeper testKeeper = new Keeper();

            try {
                testKeeper.setFirstName("Jamie");
                System.out.println("Pass");
            }
            catch (InputVal e) {
                System.out.println("Fail");
            }

            try {
                testKeeper.setSurname("Bissett");
                System.out.println("Pass");
            }
            catch (InputVal e) {
                System.out.println("Fail");
            }

            try {
                testKeeper.setCagesAllocated(3);
                System.out.println("Pass");
            }
            catch (InputVal e) {
                System.out.println("Fail");
            }
            try {
                testKeeper.setCagesAllocated(77);
                System.out.println("Fail");
            }
            catch (InputVal e) {
                System.out.println("Pass");
            }



            try {
                testKeeper = Keeper.getKeeperBuilder().setFirstName("Jamie").setSurname("Bissett").setContactNum("1245678910").setKeeperPos("Head").setCagesAllocated(4).build();
            }
            catch (InputVal e) {

            }
        }








}
