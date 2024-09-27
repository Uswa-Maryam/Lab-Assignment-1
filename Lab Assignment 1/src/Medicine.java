public class Medicine {
    private   String medicineId;
    private  String batchNumber;
    private  String manufacture;
    private  Date expiryDate;
    private  int quantity;
    private  String name;

    public Medicine(String medicineId, String batchNumber, String manufacture, Date expiryDate, int quantity, String name, double price) {
        this.medicineId = medicineId;
        this.batchNumber = batchNumber;
        this.manufacture = manufacture;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
        this.name = name;
        this.price = price;
    }

    private  double price;



    public String getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(String medicineId) {
        this.medicineId = medicineId;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

   public void DisplayInfo(){
       System.out.println("medicineId:"+medicineId+"batchNumber:"+batchNumber+"manufacture:"+manufacture+"expiryDate:"+expiryDate+"quantity:"+quantity+"name:"+name+"price:"+price);

    }
}



