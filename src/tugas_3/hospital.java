package tugas_3;

import tugas_2.building;

public class hospital extends building {
    int numberofroom;

    public hospital(String building_name, String addres, int number_floors, int numberofroom){
        super(building_name, addres, number_floors);
        this.numberofroom = numberofroom;
    }
}
