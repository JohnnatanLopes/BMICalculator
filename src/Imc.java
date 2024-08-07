
import br.com.Imc.pessoa.Person;
import br.com.imc.calc.Calc_IMC;
import br.com.imc.calc.MetricUnits;
import br.com.imc.calc.UsUnits;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Imc extends JFrame implements ActionListener{
    private JTabbedPane tabbedPane1;
    private JTextField ageMetric;
    private JRadioButton maleButtonMetric;
    private JRadioButton femaleButtorMetric;
    private JTextField heightMetric;
    private JTextField WeightMetric;
    private JButton b2;
    private JTextField inches;
    private JPanel panel;
    private JLabel result2;
    private JLabel result1;
    private JButton b1;
    private JTextField age;
    private JTextField feet;
    private JRadioButton maleUs;
    private JRadioButton femaleUs;
    private JTextField weightUs;

    public Imc() {

        b1.addActionListener(this);
        b2.addActionListener(this);

        ButtonGroup bg = new ButtonGroup();
        bg.add(maleButtonMetric);
        bg.add(femaleButtorMetric);

        setContentPane(panel);
        setTitle("Main");
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Imc();
    }

    private void createUIComponents() {}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b2) {
            Integer agee = Integer.valueOf(ageMetric.getText());
            String gender = null;
            if (maleButtonMetric.isSelected()) {
                gender = "male";
            }
            if (femaleButtorMetric.isSelected()) {
                gender = "female";
            }
            double height = Integer.parseInt(heightMetric.getText());
            double weitht = Integer.parseInt(WeightMetric.getText());
            Person person = new Person(agee, gender, height, weitht);
            MetricUnits metricUnits = new MetricUnits(person);

            resultImc(metricUnits, result2);

        }

            if(e.getSource() == b1) {

                Integer ageeB1 = Integer.valueOf(age.getText());
                String genderB1 = null;
                if(maleUs.isSelected()) {
                    genderB1 = "male";
                }
                if(femaleUs.isSelected()){
                    genderB1 = "female";
                }

                int calcFeet = (Integer.parseInt(feet.getText()) * 12);
                int sumInches = calcFeet + Integer.parseInt(inches.getText());
                double heightUs = sumInches;
                double weight_Us = Integer.parseInt(weightUs.getText());
                
                Person person1 = new Person(ageeB1,genderB1,heightUs,weight_Us);
                
                UsUnits usUnits = new UsUnits(person1);

                resultImc(usUnits,result1);
            }

    }

    public static void resultImc(Calc_IMC calcImc, JLabel j) {
        String msg = null;
        if(calcImc.calcImc() < 18.5) {
            msg = "Underweight";
        }
        if(calcImc.calcImc() > 18.5 && calcImc.calcImc() < 24.9) {
            msg = "Healthy";
        }
        if(calcImc.calcImc() > 25.0 && calcImc.calcImc() < 29.9) {
            msg = "Overweight";
        }
        if(calcImc.calcImc() > 30.0 && calcImc.calcImc() < 34.9) {
            msg = "Obese";
        }
        if(calcImc.calcImc() > 35.0) {
            msg = "Extremely Obese";
        }

        j.setText(String.format("%.2f ",calcImc.calcImc()) + msg);

    }


}
