package case_study.services.impl;

import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.services.FacilityService;
import case_study.validate_readwritefile.validate.ValidateFaci;
import case_study.validate_readwritefile.readwritefile.WriteReadFileFacility;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private Map<String, Integer> mapFacility;

    public FacilityServiceImpl() {
        mapFacility = new LinkedHashMap<>();
    }

    public FacilityServiceImpl(Map<String, Integer> mapFacility) {
        this.mapFacility = mapFacility;
    }

    public Map<String, Integer> getMapFacility() {
        return mapFacility;
    }

    public void setMapFacility(Map<String, Integer> mapFacility) {
        this.mapFacility = mapFacility;
    }

    Scanner input = new Scanner(System.in);
    Villa villa1 = new Villa("Villa", 20, 10, 4, "Ngày", "5*", 40, 5);
    House house = new House("Villa", 20, 10, 4, "Ngày", "5*", 5);
    Room room = new Room("Villa", 20, 10, 4, "Ngày", "chổ để xe");

    @Override
    public void disPlay() {
        // các service là Villa,House,Room
        mapFacility.put(String.valueOf(villa1), 1);
        mapFacility.put(String.valueOf(house), 2);
        mapFacility.put(String.valueOf(room), 3);
        for (String key : mapFacility.keySet()) {
            Integer value = mapFacility.get(key);
            System.out.println(key + " : " + value);
        }

WriteReadFileFacility writeReadFileFacility = new WriteReadFileFacility();
    }
    @Override
    public void add() {
        System.out.println("Nhập loại service muốn thêm ");
        System.out.println("1. Add New Villa\n" +
                "2. Add New House\n" +
                "3. Add New Room\n" +
                "4. Back to menu");
        int option = Integer.parseInt(input.nextLine());
        switch (option) {
            case 1: {
                String nameService = ValidateFaci.name();
                double area = ValidateFaci.area();
                double costToRent = ValidateFaci.costToRent();
                int maxpeople = ValidateFaci.maxPerson();
                String rentalType = ValidateFaci.rentStyle();
                String roomStandrd = ValidateFaci.roomStandard();
                double poolArea = ValidateFaci.poolArea();
                int flools = ValidateFaci.numberOfFloors();
                Villa villa = new Villa(nameService,area,costToRent,maxpeople,rentalType,roomStandrd,poolArea,flools);
                mapFacility.put(String.valueOf(villa),1);
                for (String key : mapFacility.keySet()) {
                    Integer value = mapFacility.get(key);
                    System.out.println(key + " : " + value);
                }
                try {
                    WriteReadFileFacility.writeReadFacility(villa, WriteReadFileFacility.WRITEVILLA);
                    System.out.println("Ghi thành công");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 2: {
                String nameService = ValidateFaci.name();
                double area = ValidateFaci.area();
                double costToRent = ValidateFaci.costToRent();
                int maxpeople = ValidateFaci.maxPerson();
                String rentalType = ValidateFaci.rentStyle();
                String roomStandrd = ValidateFaci.roomStandard();
                int flools = ValidateFaci.numberOfFloors();
                House house =new House(nameService,area,costToRent,maxpeople,rentalType,roomStandrd,flools);
                mapFacility.put(String.valueOf(house),2);
                for (String key : mapFacility.keySet()){
                   Integer value = mapFacility.get(key);
                    System.out.println(key + ":" + value);
                }
                try {
                    WriteReadFileFacility.writeReadFacility(house, WriteReadFileFacility.WRITEHOUSE);
                    System.out.println("Ghi thành Công");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 3: {
                String nameService = ValidateFaci.name();
                double area = ValidateFaci.area();
                double costToRent = ValidateFaci.costToRent();
                int maxpeople = ValidateFaci.maxPerson();
                String rentalType = ValidateFaci.rentStyle();
                String serviceFree = ValidateFaci.serviceFree();
                Room room = new Room(nameService,area,costToRent,maxpeople,rentalType,serviceFree);
                mapFacility.put(String.valueOf(room),3);
                for (String key : mapFacility.keySet()){
                    Integer value = mapFacility.get(key);
                    System.out.println(key + ":" + value);
                }
                try {
                    WriteReadFileFacility.writeReadFacility(room, WriteReadFileFacility.WRITEROOM);
                    System.out.println("ghi thành công");
                } catch (IOException e) {
                    e.printStackTrace();
                }

                break;
            }
            case 4: {
                returnMainMenu();
                break;

            }
        }

    }

    @Override
    public void edit() {


    }

    @Override
    public void returnMainMenu() {
        System.out.println("1. Employee Management\n" +
                "2. Customer Management\n" +
                "3. Facility Management\n" +
                "4. Booking Management\n" +
                "5. Promotion Management\n" +
                "6. Exit");
    }

    @Override
    public void displayListFacilityMaintenance() {
        System.out.println("Chưa bao trì");



    }

}
