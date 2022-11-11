package com.gradmatstaffs.Migrationdemo.dto;

import java.time.LocalDate;

public class PatientDTO
{

    private int id;
    private String name;
    private String address;
    private LocalDate dob;
    private String ConditionName;
    private String ConsultantName;

    public PatientDTO()
    {
        this(-1,"??","??",LocalDate.MIN,"??","??");
    }

    public PatientDTO(int id, String name, String address, LocalDate dob, String ConditionName, String ConsultantName)
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.ConditionName = ConditionName;
        this.ConsultantName = ConsultantName;
    }


    // Accessors

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public LocalDate getDateOfBirth()
    {
        return dob;
    }

    public String getAddress()
    {
        return address;
    }

    public String getConditionName()
    {
        return ConditionName;
    }

    public String getConsultantName()
    {
        return ConsultantName;
    }

    // Mutators

    public void setId(int id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setDateOfBirth(LocalDate dob)
    {
        this.dob = dob;
    }

    public void setConditionName(String ConditionName)
    {
        this.ConditionName = ConditionName;
    }

    public void setConsultantName(String ConsultantName)
    {
        this.ConditionName = ConsultantName;
    }

}
