package CaseStudy.Models;

public class Villa extends Services {
    private String roomStandard;
    private String descriptionRoom;
    private String areaOfPool;
    private String floor;

    public Villa(String id, String nameServices, String areaUse, String priceRent, String guestUse, String typeRent, String roomStandard, String descriptionRoom, String areaOfPool, String floor) {
        super(id, nameServices, areaUse, priceRent, guestUse, typeRent);
        this.roomStandard = roomStandard;
        this.descriptionRoom = descriptionRoom;
        this.areaOfPool = areaOfPool;
        this.floor = floor;
    }

    public Villa() {

    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getDescriptionRoom() {
        return descriptionRoom;
    }

    public void setDescriptionRoom(String descriptionRoom) {
        this.descriptionRoom = descriptionRoom;
    }

    public String getAreaOfPool() {
        return areaOfPool;
    }

    public void setAreaOfPool(String areaOfPool) {
        this.areaOfPool = areaOfPool;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Override
    public String showInfo() {
        return  "Thông tin thuê phòng:\n"+ "ID: " + this.getId()+"\nTên dịch vụ: " + this.getNameServices()
                + "\nDiện tích: " + this.getAreaUse() + "\nGiá thuê: "+ this.getPriceRent() + "\nSố lượng khách tối đa: "
                + this.getMaxCapacity() + "\nKiểu thuê: " + this.getTypeRent() + "\nTiêu chuẩn phòng: " + this.getRoomStandard()+
                "\nMô tả phòng: " + this.getDescriptionRoom() + "\nDiện tích hồ bơi: " + this.getAreaOfPool() + "\nSố tầng: "+
                this.getFloor();
    }
}
