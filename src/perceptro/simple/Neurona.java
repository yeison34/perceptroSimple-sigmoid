
package perceptro.simple;

import java.util.Scanner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Neurona {
    private double activacionValores[]=new double[4];
    private int aprendizaje[]=new int[4];
    private double peso[]=new double[2];
    
    public void entrenar(double teta,double alfa,double peso1,double peso2,int entradas[][],int resultados[],JTextArea area){
        Scanner entrada=new Scanner(System.in);
        
        peso[0]=peso1;
        peso[1]=peso2;
        
        Entrada nodos[]=new Entrada[resultados.length];
        int resultado[]=new int[4];
        for(int i=0;i<resultados.length;i++){
            resultado[i]=resultados[i];
        }
        
        //funcion de activacion sigmoid
        //Y(z)=1/(1+e^-z)
        
        for(int i=0;i<resultados.length;i++){
            for(int j=0;j<1;j++){
                nodos[i]=new Entrada(entradas[i][j],entradas[i][j+1]);
            }
        }
        int cont=0,activacion,error,num=1;
        while(cont!=resultados.length){
            area.append("----------------------\n");
            area.append("******************\n");
            area.append("Iteracion "+num+"\n");
            area.append("******************\n");
            nodos[cont].setPeso1(peso[0]);
            nodos[cont].setPeso2(peso[1]);
            nodos[cont].setTeta(teta);
            nodos[cont].setLambda(alfa);
            
            area.append("Valor Esperado "+resultado[cont]+"\n");
            area.append("input 1 "+nodos[cont].getInput1()+"\n");
            area.append("input 2 "+nodos[cont].getInput2()+"\n");
            area.append("Peso 1 "+nodos[cont].getPeso1()+"\n");
            area.append("Peso 2 "+nodos[cont].getPeso2()+"\n");
            area.append("Lambda "+nodos[cont].getLambda()+"\n");
            area.append("Teta "+nodos[cont].getTeta()+"\n");
            area.append("z: "+nodos[cont].calcularZ()+"\n");
            activacion=nodos[cont].funcionActivacionSigmoid();
            area.append("Funcion de Activacion Sigmoid: "+activacion+"\n");
            area.append("----------------------------------"+"\n");
            activacionValores[cont]=nodos[cont].getActivacion();
            aprendizaje[cont]=nodos[cont].funcionActivacionSigmoid();
            if(nodos[cont].funcionActivacionSigmoid()!=resultado[cont]){
                area.append("Reiniciar Proceso"+"\n");
                area.append(""+"\n");
                nodos[cont].setError(resultado[cont],nodos[cont].funcionActivacionSigmoid());
                nodos[cont].ajustarTeta();
                teta=nodos[cont].getTeta();
                nodos[cont].setDeltaPeso1();
                nodos[cont].setDeltaPeso2();
                nodos[cont].ajustarPeso1();
                nodos[cont].ajustarPeso2();
                peso[0]=nodos[cont].getPeso1();
                peso[1]=nodos[cont].getPeso2();
                cont=0;
                num=0;
            }else{
                //System.out.println(activacion);
                cont++;
            }
            num++;
        }
    }
    
    public void llenarCampos(JTextField campo1,JTextField campo2,JTextField campo3,JTextField campo4){
        campo1.setText(""+activacionValores[0]);
        campo2.setText(""+activacionValores[1]);
        campo3.setText(""+activacionValores[2]);
        campo4.setText(""+activacionValores[3]);
    }
    
    public void llenarFinal(JTextField campo1,JTextField campo2,JTextField campo3,JTextField campo4){
        campo1.setText(""+aprendizaje[0]);
        campo2.setText(""+aprendizaje[1]);
        campo3.setText(""+aprendizaje[2]);
        campo4.setText(""+aprendizaje[3]);
    }
    
    public void pesoIdeales(JTextField campo1,JTextField campo2){
        campo1.setText(""+peso[0]);
        campo2.setText(""+peso[1]);
    }
}
