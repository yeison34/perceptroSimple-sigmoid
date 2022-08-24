package perceptro.simple;

import java.util.Scanner;

public class PerceptroSimple {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int entradas;
        System.out.println("Digite cantidad de netradas");
        entradas=entrada.nextInt();
        Entrada nodos[]=new Entrada[entradas];
        double datos=0,valor=0;
        //funcion de activacion sigmoid
        //Y(z)=1/(1+e^-z)
        double z=0.0,activacion;
        for(int i=0;i<entradas;i++){
            System.out.println("Ingrese Valor X"+(i+1));
            valor=entrada.nextDouble();
            System.out.println("Ingrese Peso de la entrada X"+(i+1));
            datos=entrada.nextDouble();
            nodos[i]=new Entrada(valor,datos);
        }
        
        for(int i=0;i<entradas;i++){
            z=z+(nodos[i].getPeso()*nodos[i].getValor());
        }
        //System.out.println("z: "+z3);
        activacion=1/(1+Math.pow(Math.E,-z));
        System.out.println("Activacion: "+activacion);
    }
    
}
