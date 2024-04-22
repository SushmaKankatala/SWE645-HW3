package sushmak.SWE645hw3;
import java.util.Collection;
import java.util.Date;
import jakarta.persistence.*;


/*
 * @Entity annotation specifies that this Java class is mapped to the database table.
 * @Table with the help of the property name specifies which particular table this class is mapped to.
 * @Column on each Java instance variable allows defining a set of properties like name, length etc. The name property will be the name of the field in the database table that this instance variable will map to.
 * @Id on a field tells Spring Boot that this particular field is the primary key in the table
 * @GeneratedValue specifies the strategy that will be used for generating primary keys.
 * 
 */

@Entity
@Table(name = "surveys")
public class SurveyModel {
	
    public enum LikesAboutCampus{
        STUDENTS,
        LOCATION,
        CAMPUS,
        ATMOSPHERE,
        DORMROOMS,
        SPORTS
     }

     public enum HearAboutCampus{
        FRIENDS,
        TELEVISION,
        INTERNET,
        OTHERS
     }

     public enum Recommend{
        VERYLIKELY,
        LIKELY,
        UNLIKELY
     }
     
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long id;

     @Column(name = "first_name", nullable = false)
     private String firstName;

     @Column(name = "last_name", nullable = false)
     private String lastName;

     @Column(name = "street_address", nullable = false)
     private String streetAddress;

     @Column(name="city", nullable = false)
     private String city;

     @Column(name="state", nullable = false)
     private String state;

     @Column(name="zip", length=5, nullable = false)
     private Integer zip;

     @Column(name="telephone_num", length=10, nullable = false)
     private long telNum; 

     @Column(name="email", nullable = false)
     private String email;

     @Temporal(TemporalType.DATE)
     @Column(name="date_of_survey",nullable = false)
     private Date dateOfSurvey;
     
     @ElementCollection(targetClass = LikesAboutCampus.class)
     @JoinTable(name="likes_about_campus",joinColumns=@JoinColumn(name="id"))
     @Column(name="likes_abt",nullable = true)
     @Enumerated(EnumType.STRING)
     private Collection<LikesAboutCampus> likesAbtCampus;

     @Column(name="hear_about_us",nullable = true)
     @Enumerated(EnumType.STRING)
     private HearAboutCampus hearAbtUs;

     @Column(name="recommend",nullable = true)
     @Enumerated(EnumType.STRING)
     private Recommend recommend;

     @Column(name="comments",nullable = true)
     private String comments;
     
     public long getId() {
    	 return id;
     }
     
     public void setId(long id) {
    	 this.id = id;
     }
     
     public String getFirstName() {
         return firstName;
     }

     public void setFirstName(String firstName) {
         this.firstName = firstName;
     }
     
     public String getLastName() {
         return lastName;
     }

     public void setLastName(String lastName) {
         this.lastName = lastName;
     }
     
     public String getStreetAddress() {
         return streetAddress;
     }

     public void setStreetAddress(String streetAddress) {
         this.streetAddress = streetAddress;
     }
     
     public String getCity() {
         return city;
     }

     public void setCity(String city) {
         this.city = city;
     }
     
     public String getState() {
         return state;
     }

     public void setState(String state) {
         this.state = state;
     }
     
     public Integer getZip() {
         return zip;
     }

     public void setZip(Integer zip) {
         this.zip = zip;
     }
     
     public long getTelNum() {
         return telNum;
     }

     public void setTelNum(long telNum) {
         this.telNum = telNum;
     }


     public String getComments() {
         return comments;
     }

     public void setComments(String comments) {
         this.comments = comments;
     }

     public Recommend getRecommend() {
         return recommend;
     }

     public void setRecommend(Recommend recommend) {
         this.recommend = recommend;
     }
     
     public HearAboutCampus getHearAbtUs() {
         return hearAbtUs;
     }

     public void setHearAbtUs(HearAboutCampus hearAbtUs) {
         this.hearAbtUs = hearAbtUs;
     }

     public Collection<LikesAboutCampus> getLikesAbtCampus() {
         return likesAbtCampus;
     }

     public void setLikesAbtCampus(Collection<LikesAboutCampus> likesAbtCampus) {
         this.likesAbtCampus = likesAbtCampus;
     }

     public Date getDateOfSurvey() {
         return dateOfSurvey;
     }

     public void setDateOfSurvey(Date dateOfSurvey) {
         this.dateOfSurvey = dateOfSurvey;
     }

     public String getEmail() {
         return email;
     }

     public void setEmail(String email) {
         this.email = email;
     }
     
     @Override
     public String toString() {

         return "Survey{" +
         "id=" + id +
         ", firstName='" + firstName + '\'' +
         ", lastName='" + lastName + '\'' +
         ", streetAddress='" + streetAddress + '\'' +
         ", city='" + city + '\'' +
         ", state='" + state + '\'' +
         ", zip='" + zip + '\'' +
         ", telNum='" + telNum + '\'' +
         ", dateOfSurvey='" + dateOfSurvey + '\'' +
         ", email='" + email + '\'' +
         ", hearAbtCampus='" + hearAbtUs + '\'' +
         ", Recommend='" + recommend + '\'' +
         ", comments='" + comments + '\'' +
         '}';
     }
}