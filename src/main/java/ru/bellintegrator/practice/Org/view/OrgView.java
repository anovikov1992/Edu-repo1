package ru.bellintegrator.practice.Org.view;


import io.swagger.annotations.ApiModelProperty;

public class OrgView {

    @ApiModelProperty(hidden = true)

    public Long id;

    public String Name;

    public String FullName;

    public long inn;

    public long kpp;

    public String Adress;

    public long phone;





    @Override
    public String toString() {
        return "OrganizationView{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", FullName='" + FullName + '\'' +
                ", inn=" + inn +
                ", kpp=" + kpp +
                ", Adress='" + Adress + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

