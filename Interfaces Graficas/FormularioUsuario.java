import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class FormularioUsuario extends Frame implements ActionListener {
    protected Dimension dQuadro, dRotulo, dCaixaTexto, dBotao;
    protected Button bValidar, bSair;
    protected TextField tfUsuario;
    protected Label iUsuario;

            Usuario alunoUm = new Usuario ("Eliane");

            public FormularioUsuario(){
            Dimension dQuadro = new Dimension(290,200);
            Dimension dRotulo = new Dimension(45,25);
            Dimension dCaixaTexto = new Dimension(180, 25);
            Dimension dBotao = new Dimension(100,25);

            setTitle("Validar Usuario");
            setResizable(false);
            setSize(dQuadro);
            setLayout(null);

            iUsuario = new Label("usuario");
            iUsuario.setSize(dRotulo);
            iUsuario.setLocation(25,50);

            tfUsuario = new TextField();
            tfUsuario.setSize(dCaixaTexto);
            tfUsuario.setLocation(80,50);

            bValidar = new Button("Validar Usuário");
            bValidar.setSize(dBotao);
            bValidar.setLocation(25,150);
            bValidar.addActionListener(this);

            bSair = new Button("Sair");
            bSair.setSize(dBotao);
            bSair.setLocation(130, 150);
            bSair.addActionListener(this);

            add(iUsuario);
            add(tfUsuario);
            add(bValidar);
            add(bSair);
            }

public void actionPerformed(ActionEvent evento){
    if(evento.getSource()== bValidar){
            alunoUm.validarUsuario(tfUsuario.getText());
    }
    if (evento.getSource() == bSair){
        System.out.println("Fim do Aplicativo. Obrigado!");
        System.exit(0);
    }
}}
