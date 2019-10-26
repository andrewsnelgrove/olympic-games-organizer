public class Athlete
{
//Fields
  private String firstName;
  private String lastName;
  private int registrationNum;
  //private String DOB 

  private String countryRep;
  private String sportType;
  private String awards;

  private MedicalHistory medicalHistory;
  private EmergencyContact emergencyContact;

  //Constructor
  public Athlete()
  {
    firstName = "";
    lastName = "";
    registrationNum = "";
    countryRep = "";
    sportType = "";

    medicalHistory = new MedicalHistory();
    emergencyContact = new EmergencyContact();
  }
  //Methods
  public void inputFirstName(String theFirstName)
  {
    firstName = theFirstName;
  }

  public void inputLastName(String theLastName)
  {
    lastName = theLastName;
  }

}
