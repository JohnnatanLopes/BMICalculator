package br.com.imc.calc;

import br.com.Imc.pessoa.Person;

public class UsUnits implements Calc_IMC {

   private Person person;

    public UsUnits(Person person) {
        this.person = person;
    }

    @Override
    public Double calcImc() {
       return (person.getWeight() * 703) / (int) Math.pow(person.getHeight(), 2);
    }


}
