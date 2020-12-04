package CaseStudy.Models;

public abstract class Services {
    private String id;
    private String nameServices;
    private String areaUse;
    private String priceRent;
    private String maxCapacity;
    private String typeRent;
    public  Services(){}

    public Services(String id, String nameServices, String areaUse, String priceRent, String maxCapacity, String typeRent) {
        this.id = id;
        this.nameServices = nameServices;
        this.areaUse = areaUse;
        this.priceRent = priceRent;
        this.maxCapacity = maxCapacity;
        this.typeRent = typeRent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public String getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(String areaUse) {
        this.areaUse = areaUse;
    }

    public String getPriceRent() {
        return priceRent;
    }

    public void setPriceRent(String priceRent) {
        this.priceRent = priceRent;
    }

    public String getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(String maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    public abstract String showInfo();


}
