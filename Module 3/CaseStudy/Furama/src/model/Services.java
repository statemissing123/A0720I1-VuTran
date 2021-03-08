package model;

public class Services {
    private int id;
    private String nameServices;
    private int area;
    private int floor;
    private String maxPeople;
    private String price;
    private String status;

    public Services() {
    }

    public Services(int id, String nameServices, int area, int floor, String maxPeople, String price, String status) {
        this.id = id;
        this.nameServices = nameServices;
        this.area = area;
        this.floor = floor;
        this.maxPeople = maxPeople;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(String maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
