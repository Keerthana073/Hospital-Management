//Abstraction

   abstract class hospital1{
    private String Name;
    private int Age;
    private String City;

    // constractor

    hospital1 (String Name ,int Age, String City) {
      this.Name = Name;
      this.Age = Age;
      this.City = City;
    }

    public String getName() { return Name ;}
    public int getAge() { return Age ;}
    public String  getCity() { return City ;}

    abstract void treat();
      void display() {
        System.out.println("Name :" +getName());
        System.out.println("Age :" +getAge());
        System.out.println("City :" +getCity());
      }
   }
    class  patient extends hospital1 {
    private String Disease;
    private int Patient_Id;

    patient(String Name, int Age, String City, String Disease,int Patient_Id) {
      super(Name, Age, City);
      this.Disease = Disease;
      this.Patient_Id = Patient_Id;
    }
    public String getDisease() { return Disease; }
    public int getPatient_Id() { return Patient_Id;}

    public void treat() {
      System.out.println("Patient treating...");
    }
    void displayPatient() {
      display();
      System.out.println("Disease    :"+ getDisease());
      System.out.println("Patient ID :"+getPatient_Id());
    }
   }

    class OutPatient extends patient {
    private String D_name;
    private String Date;
    private int Fee;

    OutPatient(String Name, int Age, String City, String Disease,int Patient_Id, String D_name, String Date, int Fee ) {
      super(Name,Age, City,Disease,Patient_Id);
      this.D_name = D_name;
      this.Date = Date;
      this.Fee = Fee;
    }
    public String getD_name() { return D_name; }
    public String getDate() { return Date; }
    public int getFee() { return Fee; }

    public void treat() {
      System.out.println("OutPatient treated by Room"+ getD_name());
    }

    void displayReport() {
      System.out.println("===== OutPatient Report =====");
      displayPatient();
      System.out.println("D_name    :"+getD_name());
      System.out.println("Date      :"+getDate());
      System.out.println("fee       : Rs."+getFee());
      treat();
      System.out.println("=============================");
    }
   }
    class InPatient extends patient {
    private int Room_no;
    private int Days;
    private int Bill;

    InPatient(String Name, int Age, String City, String Disease,int Patient_Id, int Room_no, int Days ) {
      super(Name,Age, City,Disease,Patient_Id);
      this.Room_no = Room_no;
      this.Days = Days;
      this.Bill = Days*1000;
    }
    public int getRoom_no() { return Room_no; }
    public int getDays() { return Days; }
    public int getBill() { return Bill; }

    public void treat() {
      System.out.println("InPatient treated in Room"+ getRoom_no());
    }

    void displayReport() {
      System.out.println("===== InPatient Report =====");
      displayPatient();
      System.out.println("Room_no    :"+getRoom_no());
      System.out.println("Days       :"+getDays());
      System.out.println("Bill       : Rs."+getBill());
      treat();
      System.out.println("=============================");
    }
   }
   public  void main(String [] arg)
    {
        
    try {
         InPatient Ip1 = new InPatient("Keerthana",21, "Thanjavur", "Fever",10, 101,5);
          OutPatient Op1 = new OutPatient("Kavya", 18,"Chennai","Cold",11,"Dr.Kumar","19-04-2026",500);
          Ip1.displayReport();
          Op1.displayReport();
       }
      catch (Exception e) {
        System.out.println("Error:  "+ e.getMessage());
      }
      finally {
         System.out.println("Hospital System Closed!");
      }
    }