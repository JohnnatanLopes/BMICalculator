package br.com.imc.calc;

import br.com.Imc.pessoa.Person;

public class MetricUnits implements Calc_IMC {

    private Person person;

    public MetricUnits(Person person) {
        this.person = person;
    }

    @Override
    public Double calcImc() {
        double imc = person.getWeight() /  (person.getHeight() * person.getHeight()) * 10000;
        return imc;
    }


}
