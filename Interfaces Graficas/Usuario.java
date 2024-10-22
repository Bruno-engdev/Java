import javax.swing.JOptionPane;
public class Usuario {
    private String identificacao;
    public Usuario (String identificacao){
        this.identificacao = identificacao;
    }
    public String getIdentificacao(){
        return identificacao;
    }
    public void validarUsuario(String id){
        if (this.identificacao.equals(id)){
            JOptionPane.showMessageDialog(null, "Usuario" + this.identificacao + " autorizado! ");
        }
        else {
            JOptionPane.showMessageDialog(null, " Usuario" + id + " desconhecido! ");
        }
    }
}
