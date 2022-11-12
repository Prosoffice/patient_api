package com.gradmatstaffs.Migrationdemo.dto;

import java.time.LocalDate;

public class NewPatientDTO
{
    private int id;
    private String name;
    private String address;
    private LocalDate dob;
    private int conditionId;
    private int consultantId;

    public NewPatientDTO()
    {
        this(9, "??", "??", LocalDate.now(), 1, 1);
    }

    public NewPatientDTO(int id, String name, String address, LocalDate dob, int conditionId, int consultantId)
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.conditionId = conditionId;
        this.consultantId = consultantId;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public LocalDate getDateOfBirth()
    {
        return dob;
    }

    public int getConditionId()
    {
        return conditionId;
    }

    public int getConsultantId()
    {
        return consultantId;
    }

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

    public void setConditionId(int conditionId)
    {
        this.conditionId = conditionId;
    }

    public void setConsultantId(int consultantId)
    {
        this.consultantId = consultantId;
    }
}
