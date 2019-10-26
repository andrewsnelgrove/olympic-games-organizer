public class Athlete
{
 import java.util.ArrayList;
  
//Fields
  private String firstName;
  private String lastName;
  private int registrationNum;
  private String dateOfBirth;

  private String country;
  private String sport;
  private ArrayList<String> awards;

  private MedicalHistory medicalHistory;
  private EmergencyContact emergencyContact;

  //Constructor
  public Athlete(String firstName = "", String lastName = "", String dateOfBirth = "", \
                 int registrationNum = -1, String country = "", String sport = "", \
                  ArrayList<String> awards = ArrayList<>() )
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.registrationNum = registrationNum;
    this.country = country;
    this.sport = sport;

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
