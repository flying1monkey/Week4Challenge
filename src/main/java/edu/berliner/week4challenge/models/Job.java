package edu.berliner.week4challenge.models;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    private String company;
    @NotEmpty
    private String title;
    @NotNull
    private LocalDate startDate;
    private LocalDate endDate;
    private String firstDuty;
    private String secondDuty;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getCompany()
    {
        return company;
    }

    public void setCompany(String company)
    {
        this.company = company;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public LocalDate getStartDate()
    {
        return startDate;
    }

    public void setStartDate(LocalDate startDate)
    {
        this.startDate = startDate;
    }

    public LocalDate getEndDate()
    {
        return endDate;
    }

    public void setEndDate(LocalDate endDate)
    {
        this.endDate = endDate;
    }

    public String getFirstDuty()
    {
        return firstDuty;
    }

    public void setFirstDuty(String firstDuty)
    {
        this.firstDuty = firstDuty;
    }

    public String getSecondDuty()
    {
        return secondDuty;
    }

    public void setSecondDuty(String secondDuty)
    {
        this.secondDuty = secondDuty;
    }
}
