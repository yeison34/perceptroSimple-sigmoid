
package perceptro.simple;

import javax.swing.*;

public class Principal extends JFrame{
    public Principal(){
        this.setTitle("Perceptron Simple - Funcion Sigmoide");
        this.setSize(500,550);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        iniciarComponentes();
        this.setVisible(true);
    }
    
    public void iniciarComponentes(){
        String valoresAnd[]={"1","1","1","0","0","1","0","0","1","0","0","0"};
        String valoresOr[]={"1","1","1","0","0","1","0","0","1","1","1","0"};
        JTabbedPane pestañas=new JTabbedPane();
        this.getContentPane().add(pestañas);
        Tabs and=new Tabs(new JPanel(),"Perceptron Simple - Funcion de Activacion Sigmoide Compuerta AND",valoresAnd,"AND");
        pestañas.addTab("AND",and.getPanel());
        Tabs or=new Tabs(new JPanel(),"Perceptron Simple - Funcion de Activacion Sigmoide Compuerta OR",valoresOr,"OR");
        pestañas.addTab("OR",or.getPanel());
        
    }
}
