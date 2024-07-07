package com.jobapp.JobApplicationPortal.Company;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jobapp.JobApplicationPortal.Job.Job;
import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import java.util.List;

@Entity
@Table(name = "Company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;
    private int revenue;
    private String department;
    private int numberOfEmployees;

    private String address;

    private String description;


    @JsonIgnore
    @OneToMany(mappedBy = "company")
    private List<Job> jobList;

    //review
    //@OneToMany
    //private List<Review> reviewList

    public Company() {
    }

    public Company(Long id, String name, int revenue, String department, int numberOfEmployees, String address, String description, List<Job> jobList) {
        this.id = id;
        this.name = name;
        this.revenue = revenue;
        this.department = department;
        this.numberOfEmployees = numberOfEmployees;
        this.address = address;
        this.description = description;
        this.jobList = jobList;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobList() {
        return jobList;
    }

    public void setJobList(List<Job> jobList) {
        this.jobList = jobList;
    }
}
