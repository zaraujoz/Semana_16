public class Funcionario{
    private String cargo;
    private double salario;



    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public String getCargo(){
        return this.cargo;
    }
    public void setSalario(double salario){
        this.salario= salario;
    }
    public double getSalario(){
        return this.salario;
    }

    public Funcionario(){
        
    }

    public Funcionario(String cargo){
        this.cargo=cargo;
    }
    public Funcionario(double salario){

        this.salario=salario;
    }
}