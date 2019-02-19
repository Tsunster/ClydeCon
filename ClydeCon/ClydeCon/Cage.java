package ClydeCon;



public class Cage {




    private int cageID;
        private int animalID;
        private String animalType;
        private String cageType;

        public Cage() {
        }

        public Cage(int cageID, int animalID, String animalType, String cageType) throws InputVal {
            setCageID(cageID);
            setAnimalID(animalID);
            setAnimalType(animalType);
            setCageType(cageType);
        }


    public int getCageID() {
        return cageID;
    }

    public void setCageID(int cageID) {
        this.cageID = cageID;
    }

    public int getAnimalID() {
        return animalID;
    }

    public void setAnimalID(int animalID) {
        this.animalID = animalID;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) throws InputVal {

        switch (animalType) {
            case "Monkey":
                this.animalType = animalType;
            break;
            case "Ape":
                this.animalType = animalType;
                break;
            case "Tiger":
                this.animalType = animalType;
                break;
            case "Rabbit":
                this.animalType = animalType;
                break;
            case "Guinea Pig":
                this.animalType = animalType;
                break;
            case "Horse":
                this.animalType = animalType;
                break;
            case "Donkey":
                this.animalType = animalType;
                break;
            case "Chemeleon":
                this.animalType = animalType;
                break;
            case "Bearded Dragon":
                this.animalType = animalType;
                break;
            case "Lizard":
                this.animalType = animalType;
                break;
            case "Owl":
                this.animalType = animalType;
                break;
            case "Vulture":
                this.animalType = animalType;
                break;
            case "Emu":
                this.animalType = animalType;
                break;
            case "Penguin":
                this.animalType = animalType;
                break;
            default:
                throw new InputVal("ERROR ANIMAL TYPE NOT FOUND");


        }

    }


    public String getCageType() {
        return cageType;
    }

    public void setCageType(String cageType) throws InputVal {


            switch(cageType){
                case "small":
                    this.cageType = cageType;
                    break;
                case "medium":
                    this.cageType = cageType;
                    break;
                case "large":
                    this.cageType = cageType;
                    break;
                default:
                    throw new InputVal("ERROR CAGE TYPE NOT RECOGNISED");


            }

    }
    }





