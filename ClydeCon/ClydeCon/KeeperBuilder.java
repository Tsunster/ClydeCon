package ClydeCon;

public class KeeperBuilder {

        Keeper keeper = new Keeper();

        public Keeper build() {
            return keeper;
        }

        public KeeperBuilder setFirstName(String firstName) throws InputVal {
            keeper.setFirstName(firstName);
            return this;
        }

        public KeeperBuilder setSurname(String surname) throws InputVal {
            keeper.setSurname(surname);
            return this;
        }


        public KeeperBuilder setAddress(Address address) throws InputVal {
            keeper.setAddress(address);
            return this;
        }

        public KeeperBuilder setContactNum(String contactNum) throws InputVal {
            keeper.setContactNum(contactNum);
            return this;

        }
        public KeeperBuilder setKeeperPos(String keeperPos) throws InputVal {
            keeper.setKeeperPos(keeperPos);
            return this;
        }
         public KeeperBuilder setCagesAllocated(int cagesAllocated) throws InputVal {
           keeper.setCagesAllocated(cagesAllocated);
        return this;
        }
    }




