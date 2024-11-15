package Model.classes;

public class Vendor {
    private String vendorName;
    private String serviceType;
    private double vendorFee;

    public Vendor(String vendorName, String serviceType, double vendorFee) {
        this.vendorName = vendorName;
        this.serviceType = serviceType;
        this.vendorFee = vendorFee;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public double getVendorFee() {
        return vendorFee;
    }

    public void setVendorFee(double vendorFee) {
        this.vendorFee = vendorFee;
    }

    @Override
    public String toString() {
        return "Vendor name : " + vendorName + ", Service Type : " + serviceType + ", Vendor Fee : " + vendorFee + "\n";
    }
}
