
package perceptro.simple;

public class Entrada {
    private int input1;
    private int input2;
    private double peso1;
    private double peso2;
    private double z;
    private double lambda;
    private double teta;
    private int error;
    private double deltaTeta;
    private double deltaPeso1;
    private double deltaPeso2;
    private double activacion;
    public Entrada(int input1,int input2){
        this.input1=input1;
        this.input2=input2;
        peso1=0;
        peso2=0;
        error=0;
    }
    
    public double calcularZ(){
        z=input1*peso1+input2*peso2-getTeta();
        return z;
    }
    
    public int getError(){
        return error;
    }
    
    public void setError(int valorEsperado,int valorObtenido){
        this.error=valorEsperado-valorObtenido;
    }
    
    
    public double getLambda(){
        return lambda;
    }
    
    public double getTeta(){
        return teta;
    }
    
    public void setLambda(double lambda){
        this.lambda=lambda;
    }
    
    public void setTeta(double teta){
        this.teta=teta;
    }
    
    public void setPeso1(double peso1){
        this.peso1=peso1;
    }
    
    public void setPeso2(double peso2){
        this.peso2=peso2;
    }
    
    public int getInput1(){
        return input1;
    }
    
    public int getInput2(){
        return input2;
    }
    
    public void setDeltaTeta(){
        this.deltaTeta=-getLambda()*getError();
    }
    
    public double getPeso1(){
        return peso1;
    }
    
    public double getDeltaTeta(){
        return deltaTeta;
    }
    
    public double getPeso2(){
        return peso2;
    }
    
    public void setDeltaPeso1(){
        this.deltaPeso1=getLambda()*getError()*getInput1();
    }
    
    public void setDeltaPeso2(){
        this.deltaPeso2=getLambda()*getError()*getInput2();
    }
    
    public double getDeltaPeso1(){
        return deltaPeso1;
    }
    
    public double getDeltaPeso2(){
        return deltaPeso2;
    }
    
    public void ajustarPeso1(){
       this.peso1=getPeso1()+getDeltaPeso1(); 
    }
    
    public void ajustarPeso2(){
       this.peso2=getPeso2()+getDeltaPeso2(); 
    }
    
    public void ajustarTeta(){
        this.teta=getTeta()+getDeltaTeta();
    }
    
    public int funcionActivacionSigmoid(){
        double valor=1/(1+Math.pow(Math.E,-calcularZ()));
        if(valor>=0.5){
            return 1;
        }else{
            return 0;
        }
    }
    
    public double getActivacion(){
        return 1/(1+Math.pow(Math.E,-calcularZ()));
    }
}
