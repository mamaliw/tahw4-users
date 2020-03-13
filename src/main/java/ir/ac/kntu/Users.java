package ir.ac.kntu;

public class Users {

    private Long username;
    private String firstName;
    private String lastName;
    private Integer rentedBooks;
    private Date signUpDate;
    private Long nationalcode;

    public Users(Long username, String firstName, String lastName, Integer rentedBooks, Date signUpDate, Long nationalcode) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.rentedBooks = rentedBooks;
        this.signUpDate = signUpDate;
        this.nationalcode = nationalcode;
    }

    public Long getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getRentedBooks() {
        return rentedBooks;
    }

    public Date getSignUpDate() {
        return signUpDate;
    }

    public Long getNationalcode() {
        return nationalcode;
    }

    public void setUsername(Long username) {
        this.username = username;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRentedBooks(Integer rentedBooks) {
        this.rentedBooks = rentedBooks;
    }

    public void setSignUpDate(Date signUpDate) {
        this.signUpDate = signUpDate;
    }

    public void setNationalcode(Long nationalcode) {
        this.nationalcode = nationalcode;
    }


    @Override
    public java.lang.String toString() {
        return "Users{" +
                "username=" + username +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rentedBooks=" + rentedBooks +
                ", signUpDate=" + signUpDate +
                ", nationalcode=" + nationalcode +
                '}';
    }
}
