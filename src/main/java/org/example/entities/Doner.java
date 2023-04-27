package org.example.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Doner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Float phone;
    private String email;
    private String password;
    private String cep;
    private String adress;
    private Integer cpf;
    private String cnpj;

    public Doner() {
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

    public Float getPhone() {
        return phone;
    }

    public void setPhone(Float phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doner doner = (Doner) o;
        return Objects.equals(id, doner.id) && Objects.equals(name, doner.name) && Objects.equals(phone, doner.phone) && Objects.equals(email, doner.email) && Objects.equals(password, doner.password) && Objects.equals(cep, doner.cep) && Objects.equals(adress, doner.adress) && Objects.equals(cpf, doner.cpf) && Objects.equals(cnpj, doner.cnpj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phone, email, password, cep, adress, cpf, cnpj);
    }
}
