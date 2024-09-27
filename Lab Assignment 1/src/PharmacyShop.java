import java.util.Scanner;
class PharmacyShop {
    public static Object display;
    private Address address;
    private Medicine[] medicines;
    private int medicineCount;
    private Person owner;

    public PharmacyShop(Address address, Medicine[] medicines, int medicineCount, Person owner) {
        this.address = address;
        this.medicines = medicines;
        this.medicineCount = medicineCount;
        this.owner = owner;
    }

    public PharmacyShop(Person person, Address address) {
        this.person = person;
        this.address = address;
        this.medicine = new Medicine[]{
                new Medicine("M001", "Paracetamol", 50.0, 100, "PharmaCorp", "B123", new Date(15, 8, 2025)),
                new Medicine("M002", "Ibuprofen", 75.0, 80, "HealthMed", "B124", new Date(10, 12, 2024)),
                new Medicine("M003", "Amoxicillin", 120.0, 50, "BioPharma", "B125", new Date(20, 5, 2026)),
                new Medicine("M004", "Ciprofloxacin", 150.0, 60, "MedLife", "B126", new Date(30, 11, 2025)),
                new Medicine("M005", "Metformin", 90.0, 70, "GlucoCare", "B127", new Date(25, 7, 2024)),
        };
    }

    public void updateMedicine(String id, int newQuantity, double newPrice) {
        for (Medicine medicine : medicine) {
            if (medicine.getMedicineId().equals(id)) {
                medicine.setPrice(newPrice);
                System.out.println("Medicine updated successfully.");
                return;
            }
        }
        System.out.println("Medicine not found.");
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Medicine[] getMedicines() {
        return medicines;
    }

    public void setMedicines(Medicine[] medicines) {
        this.medicines = medicines;
    }

    public int getMedicineCount() {
        return medicineCount;
    }

    public void setMedicineCount(int medicineCount) {
        this.medicineCount = medicineCount;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }


    public void searchMedicineById(String MedicineId) {
        

    }


    public void updateMedicine(String updateMedicine) {


    }

    public void searchMedicineByName(String searchMedicineByName) {

    }

    public void printTotalRevenue() {
    }

    public void findExpiredMedicines(Date ExpiredMedicines) {
    }

    public void removeMedicine(String removeMedicine) {
    }

    public void addMedicine(Medicine addMedicine) {
    }
    Scanner sc= new Scanner(System.in);
    String Id=sc.nextLine();
    //System.out.println("Enter medicineId");

    public void displayMedicines() {
        String choice = scanner.nextLine();
        System.out.println("Search Medicine by Id");
        System.out.println("Update Medicine");
        System.out.println("Serach Medicine by name");
        System.out.println("Total Revenue");
        System.out.println("Expired Medicines");
        System.out.println("remove Medicines");
        System.out.println("add Medicine");



    }
}


