package tugas_2; //Mengubah Data

public class building {
    String building_name;
    String addres;
    int number_floors;

    public void building_name(String building_name, String addres, int number_floors) {
        this.building_name = building_name;
        this.addres = addres;
        this.number_floors = number_floors;

        displayBuildinfo();
        System.out.println("Building Added Successfully");
    }

    private void displayBuildinfo() {
        System.out.println("Building Information");
        System.out.println("Name Of The Building" + building_name);
        System.out.println("Address of the building" + addres);
        System.out.println("Number of floors" + number_floors);
    }
    String getBuilding_name() {return this.building_name;}
    String getAddres() {return this.addres;}
    int getNumber_floors() {return this.number_floors;}
}
