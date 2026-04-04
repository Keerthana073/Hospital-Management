static class hospital{
    String Name;
    int Age;
    String City;


  hospital(String Name, int Age, String City)
  {
   this.Name = Name;
   this.Age = Age;
   this.City = City;
  }
}
 static class patient extends hospital{
    String  Disease;
    int Patient_Id;

    patient (String Name, int Age, String City, String Disease,int Patient_Id)
    {
      super(Name,Age,City);
      this.Disease = Disease;
      this.Patient_Id = Patient_Id;
    }
 }

 static class Inpatient extends patient{
    int Room_no;
    int Days;
    int Bill;

    Inpatient(String Name, int Age, String City, String Disease,int Patient_Id, int Room_no, int Days )
    {
      super(Name,Age,City,Disease,Patient_Id);
      this.Room_no = Room_no;
      this.Days = Days;
      this.Bill = Days*1000;
    }
 }
 static class Outpatient extends patient{
    String D_name;
    String Date;
    int Fee;

    Outpatient(String Name, int Age, String City, String Disease,int Patient_Id, String D_name,String Date,int Fee)
    {
      super(Name, Age, City, Disease, Patient_Id);
      this.D_name = D_name;
      this.Date = Date;
      this.Fee = Fee;
    }
 }

   public static void main(String [] arg)
    {
      Inpatient hos1 = new Inpatient("Keerthana",21,"thanjavur","Fever",10,101,5);
      //hos1.Name ="Keerthana";
      //hos1.Age = 21;
      //hos1.City = "thanjavur";
      //hos1.Disease = "Fever";
      //hos1.Patient_Id =10;
      //hos1.Room_no = 101;
      //hos1.Days = 5;
      //hos1.Bill = 1000;

      System.out.println("==========Inpatient Report=============");
      System.out.println("Name         :"+hos1.Name);
      System.out.println("Age          :"+hos1.Age);
      System.out.println("City         :"+hos1.City);
      System.out.println("Disease      :"+hos1.Disease);
      System.out.println("Patient_Id   :"+hos1.Patient_Id);
      System.out.println("Room_no      :"+hos1.Room_no);
      System.out.println("Days         :"+hos1.Days);
      System.out.println("Bill         :"+hos1.Bill);
      System.out.println("======================================");

      Outpatient op1 = new Outpatient("Kavya",20,"Chennai","cold",12,"Dr.Keerthi", "12/03/2026",500);
      //op1.Name = "Kavya";
      //op1.Age = 20;
      //op1.City = "Chennai";
      //op1.Disease = "cold";
      //op1.Patient_Id = 12;
      //op1.D_name = "Dr.Keerthi";
      //op1.Date = 12/03/2026;
      //op1.Fee = 500;

      System.out.println("==========Outpatient Report=============");
      System.out.println("Name         :"+op1.Name);
      System.out.println("Age          :"+op1.Age);
      System.out.println("City         :"+op1.City);
      System.out.println("Disease      :"+op1.Disease);
      System.out.println("Patient_Id   :"+op1.Patient_Id);
      System.out.println("D_name       :"+op1.D_name);
      System.out.println("Date         :"+op1.Date);
      System.out.println("Fee          :"+op1.Fee);
      System.out.println("======================================");
      
     
    }

