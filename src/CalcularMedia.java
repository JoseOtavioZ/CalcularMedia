import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcularMedia extends JFrame{
    private JTextField textPrimeiro;
    private JTextField textSegundo;
    private JButton buttonMais;
    private JButton buttonMenos;
    private JButton buttonDividir;
    private JButton ButtonVezes;
    private JTextField textResultado;
    private JButton ButtonCe;
    public JPanel formCalcular;

    public CalcularMedia() {
    buttonMais.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Double valorMais = Double.valueOf(textPrimeiro.getText()) + Double.valueOf(textSegundo.getText());
            textResultado.setText(valorMais.toString());
        }
    });
        buttonMenos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Double valorMenos = Double.valueOf(textPrimeiro.getText()) - Double.valueOf(textSegundo.getText());
                textResultado.setText(valorMenos.toString());
            }
        });
        buttonDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Double valorDividir = Double.valueOf(textPrimeiro.getText()) / Double.valueOf(textSegundo.getText());
                textResultado.setText(valorDividir.toString());
            }
        });
        ButtonVezes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Double valorVezes = Double.valueOf(textPrimeiro.getText()) * Double.valueOf(textSegundo.getText());
                textResultado.setText(valorVezes.toString());
            }
        });
        ButtonCe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textPrimeiro.setText("");
                textSegundo.setText("");
                textResultado.setText("");
            }
        });
    }
}
