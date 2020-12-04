package CaseStudy.Models;

public class Room extends Services {
    private String includedServices;

    public Room(String id, String nameServices, String areaUse, String priceRent, String guestUse, String typeRent, String includedServices) {
        super(id, nameServices, areaUse, priceRent, guestUse, typeRent);
        this.includedServices = includedServices;
    }
    public Room(){

    }

    public String getIncludedServices() {
        return includedServices;
    }

    public void setIncludedServices(String includedServices) {
        this.includedServices = includedServices;
    }

    @Override
    public String showInfo() {
       return "Các dịch vụ đi kèm :\n"+ this.getIncludedServices() ;

    }

}
