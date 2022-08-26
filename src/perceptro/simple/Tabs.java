
package perceptro.simple;

import javax.swing.*;

public class Tabs {
    //private JPanel and;
    private JPanel panel=new JPanel();
    private JTextField w1;
    private JTextField w2;
    private JTextField teta;
    private JTextField lambda;
    private JTextField campo1;
    private JTextField campo2;
    private JTextField campo3;
    private JTextField campo4;
    private JTextField campo5;
    private JTextField campo6;
    private JTextField campo7;
    private JTextField campo8;
    private JTextField campo9;
    private JTextField campo10;
    private JTextField campo11;
    private JTextField campo12;
    private JTextField activacion1;
    private JTextField activacion2;
    private JTextField activacion3;
    private JTextField activacion4;
    private JTextField valorFinal1;
    private JTextField valorFinal2;
    private JTextField valorFinal3;
    private JTextField valorFinal4;
    private JTextField pesoAprendizaje1;
    private JTextField pesoAprendizaje2;
    private JButton entrenar;
    private String titulo,valores[],eti;
    /*public Principal(){
        this.setTitle("Perceptron Simple - Funcion Sigmoide");
        this.setSize(500,550);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        iniciarComponentes();
        this.setVisible(true);
    }
    */
    public Tabs(JPanel panel,String titulo,String valores[],String eti){
        this.eti=eti;
        this.titulo=titulo;
        this.panel=panel;
        this.valores=valores;
        iniciarComponentes();
    }
    public void iniciarComponentes(){
        //this.panel=panel;
        paneles();
        etiquetas();
        camposVariables();
        camposTabla();
        botones();
        accionEntrenar();
    }
    
    public void etiquetas(){
        JLabel tituloAnd=new JLabel(this.titulo);
        tituloAnd.setBounds(40, 20, 480, 40);
        //JLabel tituloNand=new JLabel("Perceptron Simple - Funcion de Activacion Sigmoide Compuerta OR");
        //tituloNand.setBounds(40, 20,480, 40);
        panel.add(tituloAnd);
        //nand.add(tituloNand);
        
        JLabel peso1=new JLabel("Peso 1:");
        peso1.setBounds(20, 70, 70, 25);
        JLabel peso2=new JLabel("Peso 2:");
        peso2.setBounds(130, 70, 70, 25);
        
        JLabel txtLambda=new JLabel("Lambda:");
        txtLambda.setBounds(240, 70, 70, 25);
        JLabel txtTeta=new JLabel("teta:");
        txtTeta.setBounds(360, 70, 70, 25);
        
        JLabel txtX1=new JLabel("X1");
        txtX1.setBounds(38, 130, 70, 25);
        JLabel txtX2=new JLabel("X2");
        txtX2.setBounds(118, 130, 70, 25);
        JLabel txtAnd=new JLabel("X1 "+this.eti+" X2");
        txtAnd.setBounds(176, 130, 70, 25);
        JLabel txtFuncion=new JLabel("Funcion Sigmoide");
        txtFuncion.setBounds(260, 130, 100, 25);
        JLabel txtActivacion=new JLabel("Activación");
        txtActivacion.setBounds(390, 130, 100, 25);
        
        JLabel aprendizaje1=new JLabel("Peso Ideal 1");
        aprendizaje1.setBounds(20, 315, 100, 25);
        JLabel aprendizaje2=new JLabel("Peso Ideal 2");
        aprendizaje2.setBounds(20, 365, 100, 25);
        
        panel.add(peso1);
        panel.add(peso2);
        panel.add(txtLambda);
        panel.add(txtTeta);
        panel.add(txtX1);
        panel.add(txtX2);
        panel.add(txtAnd);
        panel.add(txtFuncion);
        panel.add(txtActivacion);
        panel.add(aprendizaje1);
        panel.add(aprendizaje2);
    }
    
    public void paneles(){
        panel=new JPanel();
        panel.setLayout(null);
    }
    
    public void camposVariables(){
        w1=new JTextField();
        w1.setBounds(70, 70, 50, 25);
        panel.add(w1);
        //nand.add(w1);
        w2=new JTextField();
        w2.setBounds(180, 70, 50, 25);
        panel.add(w2);
        teta=new JTextField();
        teta.setBounds(400, 70, 50, 25);
        panel.add(teta);
        lambda=new JTextField();
        lambda.setBounds(300, 70, 50, 25);
        panel.add(lambda);
    }
    
    public void camposTabla(){
        campo1=new JTextField(valores[0]);
        campo1.setBounds(20, 160, 50, 25);
        panel.add(campo1);
        
        campo2=new JTextField(valores[1]);
        campo2.setBounds(100, 160, 50, 25);
        panel.add(campo2);
        
        campo3=new JTextField(valores[2]);
        campo3.setBounds(20, 200, 50, 25);
        panel.add(campo3);
        
        campo4=new JTextField(valores[3]);
        campo4.setBounds(100, 200, 50, 25);
        panel.add(campo4);
        
        campo5=new JTextField(valores[4]);
        campo5.setBounds(20, 240, 50, 25);
        panel.add(campo5);
        
        campo6=new JTextField(valores[5]);
        campo6.setBounds(100, 240, 50, 25);
        panel.add(campo6);
        
        campo7=new JTextField(valores[6]);
        campo7.setBounds(20, 280, 50, 25);
        panel.add(campo7);
        
        campo8=new JTextField(valores[7]);
        campo8.setBounds(100, 280, 50, 25);
        panel.add(campo8);
        
        campo9=new JTextField(valores[8]);
        campo9.setBounds(180, 160, 50, 25);
        panel.add(campo9);
        
        campo10=new JTextField(valores[9]);
        campo10.setBounds(180, 200, 50, 25);
        panel.add(campo10);
        
        campo11=new JTextField(valores[10]);
        campo11.setBounds(180, 240, 50, 25);
        panel.add(campo11);
        
        campo12=new JTextField(valores[11]);
        campo12.setBounds(180, 280, 50, 25);
        panel.add(campo12);
        
        activacion1=new JTextField();
        activacion1.setBounds(250,160,120,25);
        panel.add(activacion1);
        
        activacion2=new JTextField();
        activacion2.setBounds(250,200,120,25);
        panel.add(activacion2);
        
        activacion3=new JTextField();
        activacion3.setBounds(250,240,120,25);
        panel.add(activacion3);
        
        activacion4=new JTextField();
        activacion4.setBounds(250,280,120,25);
        panel.add(activacion4);
        
        valorFinal1=new JTextField();
        valorFinal1.setBounds(390, 160, 60, 25);
        panel.add(valorFinal1);
        
        valorFinal2=new JTextField();
        valorFinal2.setBounds(390, 200, 60, 25);
        panel.add(valorFinal2);
        
        valorFinal3=new JTextField();
        valorFinal3.setBounds(390, 240, 60, 25);
        panel.add(valorFinal3);
        
        valorFinal4=new JTextField();
        valorFinal4.setBounds(390, 280, 60, 25);
        panel.add(valorFinal4);
        
        pesoAprendizaje1=new JTextField();
        pesoAprendizaje1.setBounds(20,340,150,25);
        pesoAprendizaje2=new JTextField();
        pesoAprendizaje2.setBounds(20,390,150,25);
        panel.add(pesoAprendizaje1);
        panel.add(pesoAprendizaje2);
    }
    
    public void botones(){
        entrenar=new JButton("Entrenar");
        entrenar.setBounds(190,420,100,25);
        panel.add(entrenar);
    }
    
    public void accionEntrenar(){
        Neurona start=new Neurona();

        entrenar.addActionListener(e->{
            int entrada[][]=new int[4][2];
            int resultados[]=new int[4];
            resultados[0]=Integer.parseInt(campo9.getText());
            resultados[1]=Integer.parseInt(campo10.getText());
            resultados[2]=Integer.parseInt(campo11.getText());
            resultados[3]=Integer.parseInt(campo12.getText());
            
            double Lambda,Peso1,Peso2,Teta;
            entrada[0][0]=Integer.parseInt(campo1.getText());
            entrada[0][1]=Integer.parseInt(campo2.getText());
            entrada[1][0]=Integer.parseInt(campo3.getText());
            entrada[1][1]=Integer.parseInt(campo4.getText());
            entrada[2][0]=Integer.parseInt(campo5.getText());
            entrada[2][1]=Integer.parseInt(campo6.getText());
            entrada[3][0]=Integer.parseInt(campo7.getText());
            entrada[3][1]=Integer.parseInt(campo8.getText());
            Lambda=Double.parseDouble(lambda.getText());           
            Peso1=Double.parseDouble(w1.getText());
            Peso2=Double.parseDouble(w2.getText());
            Teta=Double.parseDouble(teta.getText());
            start.entrenar(Teta, Lambda, Peso1, Peso2, entrada, resultados);
            start.llenarCampos(activacion1, activacion2, activacion3, activacion4);
            start.llenarFinal(valorFinal1, valorFinal2, valorFinal3, valorFinal4);
            start.pesoIdeales(pesoAprendizaje1,pesoAprendizaje2);
        });
        
    }
    
    public JPanel getPanel(){
        return panel;
    }
}
