
import javax.swing.JOptionPane;
public class Professor {
    private String nome;
    private String idade;
    public Professor (String nome, String idade){
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome(){
        return nome;
    }
    public String getIIdade(){
        return idade;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(String idade){
        this.idade = idade;
    }
    public void exibirMensagem(){
        JOptionPane.showMessageDialog(null, "Nome " + this.nome + "\n Idade " + this.idade);
    }
    }