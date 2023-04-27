package org.example.dto;

public class DonerDTO {
    private Long id;
    private String name;
    private Float phone;
    private String email;
    private String password;
    private String cep;
    private String adress;
    private Integer cpf;
    private String cnpj;

    public DonerDTO() {
    }

    public DonerDTO(Long id, String name, Float phone, String email, String password, String cep, String adress, Integer cpf, String cnpj) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.cep = cep;
        this.adress = adress;
        this.cpf = cpf;
        this.cnpj = cnpj;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Float getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getCep() {
        return cep;
    }

    public String getAdress() {
        return adress;
    }

    public Integer getCpf() {
        return cpf;
    }

    public String getCnpj() {
        return cnpj;
    }
}
