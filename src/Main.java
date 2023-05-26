import javax.swing.*;

public class Main{
    public static void main(String[] args) {
        CalcularMedia form = new CalcularMedia();
        form.setContentPane(form.formCalcular);
        form.setVisible(true);
        form.setSize(500, 500);
        form.setTitle("Calculadora de media");
    }
}