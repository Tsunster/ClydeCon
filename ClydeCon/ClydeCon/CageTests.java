package ClydeCon;

public class CageTests {

    public static void main(String[] args) {

        Cage testCage = new Cage();

        try{
            testCage.setCageType("large");
            System.out.println("pass");
        }
        catch (InputVal e){
            System.out.println("fail");
        }

        try{
            testCage.setCageType("smol");
            System.out.println("fail");
        }
        catch (InputVal e){

            System.out.println("pass");
        }

        try{
            testCage.setAnimalType("Tiger");
            System.out.println("pass");
        }
        catch (InputVal e){
            System.out.println("fail");
        }
        try{
            testCage.setAnimalType("Alien");
            System.out.println("fail");
        }
        catch (InputVal e){
            System.out.println("pass");
        }

    }



}
