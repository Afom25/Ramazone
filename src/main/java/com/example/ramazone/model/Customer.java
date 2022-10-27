package com.example.ramazone.model;




import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Table(name="customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    @NotBlank(message="the firstname shouldnot be empty")
    @Column(nullable = false)
    private String firstName;


    private String middleName;

    @NotBlank(message="the lastname shouldnot be empty")
    @Column(nullable = false)
    private String lastName;

    private Double totalAmountSpent ;

    private Integer numberOfRewardPointsEarned;

    private LocalDate lastTransactionDate;

    public Customer(Long customerId, String firstName, String middleName, String lastName, Double totalAmountSpent, Integer numberOfRewardPointsEarned, LocalDate lastTransactionDate) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.totalAmountSpent = totalAmountSpent;
        this.numberOfRewardPointsEarned = numberOfRewardPointsEarned;
        this.lastTransactionDate = lastTransactionDate;
    }

    public Customer() {

    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getTotalAmountSpent() {
        return totalAmountSpent;
    }

    public void setTotalAmountSpent(Double totalAmountSpent) {
        this.totalAmountSpent = totalAmountSpent;
    }

    public Integer getNumberOfRewardPointsEarned() {
        return numberOfRewardPointsEarned;
    }

    public void setNumberOfRewardPointsEarned(Integer numberOfRewardPointsEarned) {
        this.numberOfRewardPointsEarned = numberOfRewardPointsEarned;
    }

    public LocalDate getLastTransactionDate() {
        return lastTransactionDate;
    }

    public void setLastTransactionDate(LocalDate lastTransactionDate) {
        this.lastTransactionDate = lastTransactionDate;
    }
}
