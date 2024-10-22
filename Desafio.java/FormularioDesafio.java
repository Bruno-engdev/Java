import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class FormularioDesafio extends Frame implements ActionListener {
    protected Dimension dQuadro, dRotulo, dCaixaTexto, dBotao;
    protected Button bCadastrar, bSair;
    protected TextField tfNome, tfIdade;
    protected Label iNome, iIdade;

            public FormularioDesafio(){
            Dimension dQuadro = new Dimension(330,200);
            Dimension dRotulo = new Dimension(45,25);
            Dimension dCaixaTexto = new Dimension(180, 25);
            Dimension dBotao = new Dimension(100,25);

            setTitle("Formulario Professor");
            setResizable(false);
            setSize(dQuadro);
            setLayout(null);

            iNome = new Label("Nome");
            iNome.setSize(dRotulo);
            iNome.setLocation(25,50);

            iIdade = new Label("Idade");
            iIdade.setSize(dRotulo);
            iIdade.setLocation(25,100);

            tfNome = new TextField();
            tfNome.setSize(dCaixaTexto);
            tfNome.setLocation(80,50);

            tfIdade = new TextField();
            tfIdade.setSize(dCaixaTexto);
            tfIdade.setLocation(80,100);

            bCadastrar = new Button("Validar Usuário");
            bCadastrar.setSize(dBotao);
            bCadastrar.setLocation(25,150);
            bCadastrar.addActionListener(this);

            bSair = new Button("Sair");
            bSair.setSize(dBotao);
            bSair.setLocation(130, 150);
            bSair.addActionListener(this);

            add(iNome);
            add(iIdade);
            add(tfNome);
            add(tfIdade);
            add(bCadastrar);
            add(bSair);

            }
            public void actionPerformed(ActionEvent evento){
                if (evento.getSource() == bCadastrar){
                Professor ProfessorUm = new Professor(tfNome.getText(), tfIdade.getText());
                ProfessorUm.exibirMensagem();
                }
                if (evento.getSource()== bSair){
                System.out.println("Fim do Aplicativo. Obrigado!");
                System.exit(0);
                }
            }
        }


