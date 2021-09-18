package CaseStudy.model;

public class House extends Facility{
    private String standardHouse;
    private double areaPool;
    private int floor;

    public House() {
    }

    public House(String idFacility, String nameService, double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, String standardVilla, double areaPool, int floor) {
        super(idFacility, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.standardHouse = standardVilla;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    public String getStandardVilla() {
        return standardHouse;
    }

    public void setStandardVilla(String standardVilla) {
        this.standardHouse = standardVilla;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House : " +super.toString()+
                ", standardHouse='" + standardHouse + '\'' +
                ", areaPool=" + areaPool +
                ", floor=" + floor ;
    }
}
