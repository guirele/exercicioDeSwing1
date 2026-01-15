// CODE IN PORTUGUESE

import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends JFrame {
    private JPanel painelPrincipal;
    private JPanel painelCadastro;
    private JButton botaoCadastro;
    private JButton botaoSair;
    private JTextField nome;
    private JPasswordField senha;
    private ArrayList<String> usuarios;

    public TelaPrincipal(ArrayList<String> usuarios){
        this.usuarios = usuarios
        configurarFrame();
        configurarTelaPrincipal();
        configurarTelaCadastro();

        add(painelPrincipal);
        add(painelCadastro);
    }

    private void configurarFrame() {
        setTitle("Sistema");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
    }

    private void configurarTelaPrincipal(){
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setBounds(0, 0, 400, 300);

        botaoCadastro = new JButton("Cadastro");
        botaoCadastro.setBounds(130, 70, 140, 43);
        botaoCadastro.setBackground(Color.white);
        botaoCadastro.setForeground(Color.black);
        botaoCadastro.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        botaoCadastro.addActionListener(e -> telaCadastro());

        botaoSair = new JButton("Sair");
        botaoSair.setBounds(130, 130, 140, 43);
        botaoSair.setBackground(Color.white);
        botaoSair.setForeground(Color.black);
        botaoSair.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        botaoSair.addActionListener(e -> System.exit(0));

        painelPrincipal.add(botaoCadastro);
        painelPrincipal.add(botaoSair);
    }

    private void configurarTelaCadastro(){
        painelCadastro = new JPanel();
        painelCadastro.setLayout(null);
        painelCadastro.setBounds(0, 0, 400, 300);
        painelCadastro.setVisible(false);

        JLabel lblNome = new JLabel("Nome");
        lblNome.setBounds(80, 60, 80, 25);
        painelCadastro.add(lblNome);

        nome = new JTextField();
        nome.setBounds(150, 60, 150, 25);
        nome.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        painelCadastro.add(nome);

        JLabel lblSenha = new JLabel("Senha");
        lblSenha.setBounds(80, 100, 80, 25);
        painelCadastro.add(lblSenha);

        senha = new JPasswordField("");
        senha.setBounds(150, 100, 150, 25);
        senha.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        senha.setEchoChar('*');
        char[] senhaChars = senha.getPassword();
        String senhaTexto = new String(senhaChars);
        painelCadastro.add(senha);

        JButton botaoCadastrar = new JButton("Cadastre-se");
        botaoCadastrar.setBounds(130, 150, 140, 30);
        botaoCadastrar.setBackground(Color.white);
        botaoCadastrar.setForeground(Color.black);
        botaoCadastrar.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        botaoCadastrar.addActionListener(e -> cadastroFeito());
        painelCadastro.add(botaoCadastrar);

        JButton botaoVoltar = new JButton("Voltar");
        botaoVoltar.setBounds(130, 190, 140, 30);
        botaoVoltar.setBackground(Color.white);
        botaoVoltar.setForeground(Color.black);
        botaoVoltar.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        botaoVoltar.addActionListener(e -> voltarMenu());
        painelCadastro.add(botaoVoltar);
    }

    private void telaCadastro(){
        painelPrincipal.setVisible(false);
        painelCadastro.setVisible(true);
    }

    private void voltarMenu(){
        limparCampos();

        painelPrincipal.setVisible(true);
        painelCadastro.setVisible(false);

        repaint();
        revalidate();
    }

    private void cadastroFeito(){
        String nomeTexto = nome.getText().trim();
        String senhaTexto = new String(senha.getPassword()).trim();

        if(nomeTexto.isEmpty() || senhaTexto.isEmpty()){
            JOptionPane.showMessageDialog(this,
                    "Preencha todos os campos corretamente!",
                    "Erro!",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        usuarios.add(nomeTexto);

        JOptionPane feito = new JOptionPane(
                "Cadastro Feito!",
                JOptionPane.INFORMATION_MESSAGE,
                JOptionPane.DEFAULT_OPTION);

        JDialog dialog = feito.createDialog(this,"Concluido");
        dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        dialog.setVisible(true);

        voltarMenu();

    }

    private void limparCampos(){
        nome.setText("");
        senha.setText("");

    }
}
