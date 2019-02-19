package ClydeCon;

import java.time.LocalDate;

public class Keeper {

        private int id;
        private String firstName;
        private String surname;
        private Address address;
        private String contactNum;
        private String keeperPos;
        private int cagesAllocated;

        public Keeper() {

        }

        public Keeper(String firstName, String surname, Address address, String contactNum, String keeperPos, int cagesAllocated) throws InputVal {
            setFirstName(firstName);
            setSurname(surname);
            setAddress(address);
            setContactNum(contactNum);
            setKeeperPos(keeperPos);
            setCagesAllocated(cagesAllocated);
        }

        public int getId() {
            return id;
        }

        public void setId(int id) throws InputVal {
            if (id > 0) {
                this.id = id;
            }
            else {
                throw new InputVal("Id must be greater than zero");
            }
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) throws InputVal {
            if (firstName.matches("\\p{Upper}(\\p{Lower}){3,10}")) {
                this.firstName = firstName;
            }
            else {
                throw new InputVal("Invalid firstname");
            }
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) throws InputVal {
            if (surname.matches("\\p{Upper}(\\p{Lower}){3,10}")) {
                this.surname = surname;
            }
            else {
                throw new InputVal("Invalid surname");
            }
        }



        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getKeeperPos() {
        return keeperPos;
    }

    public void setKeeperPos(String keeperPos) {
        this.keeperPos = keeperPos;
    }

    public int getCagesAllocated() {
        return cagesAllocated;
    }

    public void setCagesAllocated(int cagesAllocated) throws InputVal {
        if (cagesAllocated <= 4 && cagesAllocated >= 0) {
            this.cagesAllocated = cagesAllocated;
        } else {
            throw new InputVal("ERROR CAGE ALLOCATED VALUE INVALID");
        }

    }

    private static KeeperBuilder keeperBuilder = new KeeperBuilder();

    public static KeeperBuilder getKeeperBuilder() {
        return keeperBuilder;
    }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Keeper keeper = (Keeper) o;

            return id == keeper.id;
        }

        @Override
        public int hashCode() {
            return id;
        }
    }

