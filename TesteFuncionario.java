public class TesteFuncionario {
     public static void main(String[] args) {
         

        Funcionario f = new Funcionario();
        
        f.setCargo("Programador");
        f.setSalario(4.000);

        System.out.println(f.getCargo());
        System.out.println(f.getSalario());
     }


    }
