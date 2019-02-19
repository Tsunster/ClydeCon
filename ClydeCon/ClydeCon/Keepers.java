package ClydeCon;

import java.util.ArrayList;

public class Keepers {

        private ArrayList<Keeper> allKeepers;

        public Keepers() {

            allKeepers = new ArrayList<Keeper>();
        }


        public void add(Keeper c) {

            if (search(c.getId()) != null) {
                allKeepers.add(c);
            }
        }

        public Keeper search(int id) {

            for(Keeper c : allKeepers) {
                if (id == c.getId()) {
                    return c;
                }
            }
            return null;
        }

        public void update(Keeper c) {

            Keeper keeperToUpdate = search(c.getId());

            if (keeperToUpdate != null) {

                try {
                    keeperToUpdate.setFirstName(c.getFirstName());
                    keeperToUpdate.setSurname(c.getSurname());
                    keeperToUpdate.setFirstName(c.getFirstName());
                    keeperToUpdate.setAddress(c.getAddress());
                    keeperToUpdate.setContactNum(c.getContactNum());
                    keeperToUpdate.setKeeperPos(c.getKeeperPos());
                    keeperToUpdate.setCagesAllocated(c.getCagesAllocated());
                }
                catch (InputVal e) {

                }
            }
        }

        public void remove(Keeper c) {
            allKeepers.remove(c);
        }
    }



