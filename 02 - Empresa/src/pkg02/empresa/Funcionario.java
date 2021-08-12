package pkg02.empresa;
public class Funcionario {
    private String nome;
    private String cargo;
    private float salario;
    private String tipo;
    
    public void exibirDados(){
        tipoTrab();
        System.out.println("Nome: " + this.getNome());
        System.out.println("Cargo: " + this.getCargo());
        System.out.println("Salário: " + this.getSalario());
        System.out.println("Trabalha: " + this.getTipo());
    }
    
    public void tipoTrab(){
        if(this.getCargo() == "Estagiário"){
            this.setSalario(800);
            this.setTipo("100% home office");
        }else if(this.getCargo() == "Junior"){
            this.setSalario(1200);
            this.setTipo("Presencial");
        }else{
            this.setSalario(2500);
            this.setTipo("Híbrido");
        }
    }

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
