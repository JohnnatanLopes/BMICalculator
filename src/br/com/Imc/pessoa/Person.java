package br.com.Imc.pessoa;

import br.com.imc.calc.Calc_IMC;

public class Person {

   private Integer age;
   private String gender;
   private Double height;
   private Double weight;

   private Calc_IMC calcImc;

    public Person(Integer age, String gender, Double height, Double weight) {
        if(age < 14 || age > 120) {
            throw new IllegalArgumentException("Invalid Age");
        }
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Calc_IMC getCalcImc() {
        return calcImc;
    }

    public void setCalcImc(Calc_IMC calcImc) {
        this.calcImc = calcImc;
    }
}
