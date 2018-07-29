package ru.bellintegrator.practice.Org.model;


import javax.persistence.*;

@Entity
@Table (name = "Organization")
public class Org {

    public Org() {}

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private Long id;

    @Column(name = "Name")
    private String Name;

    @Column(name = "FullName")
    private String FullName;

    @Column(name = "inn")
    private long inn;

    @Column(name = "kpp")
    private long kpp;

    @Column(name = "Adress")
    private String Adress;

    @Column(name = "phone")
    private long phone;

    public Org(Long id, String name, String fullName, long inn, long kpp, String adress, long phone) {
        this.id = id;
        Name = name;
        FullName = fullName;
        this.inn = inn;
        this.kpp = kpp;
        Adress = adress;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public long getInn() {
        return inn;
    }

    public void setInn(long inn) {
        this.inn = inn;
    }

    public long getKpp() {
        return kpp;
    }

    public void setKpp(long kpp) {
        this.kpp = kpp;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}
