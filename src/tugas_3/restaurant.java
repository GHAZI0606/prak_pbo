package tugas_3;

import tugas_2.building;

public class restaurant extends building {
    int numberoftable;

    public restaurant(String building_name, String addres, int number_floors, int numberoftable){
        super(building_name, addres, number_floors);
        this.numberoftable = numberoftable;
    }
}
