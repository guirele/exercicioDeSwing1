import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TelaUsuarios extends JFrame {

    private ArrayList<String> usuarios;
    private JTextArea areaUsuarios;

    public TelaUsuarios(ArrayList<String> usuarios) {
        this.usuarios = usuarios;
        configurarFrame();
        configurarComponentes();
        atualizarLista();
    }

    private void configurarFrame() {
        setTitle("Usuários Cadastrados");
        setSize(300, 400);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void configurarComponentes() {
        areaUsuarios = new JTextArea();
        areaUsuarios.setEditable(false);
        areaUsuarios.setFont(new Font("Arial", Font.PLAIN, 14));

        JScrollPane scroll = new JScrollPane(areaUsuarios);
        add(scroll, BorderLayout.CENTER);


        JButton botaoAtualizar = new JButton("Atualizar Lista");
        botaoAtualizar.addActionListener(e -> atualizarLista());
        add(botaoAtualizar, BorderLayout.SOUTH);
    }

    private void atualizarLista() {
        if (usuarios.isEmpty()) {
            areaUsuarios.setText("Nenhum usuário cadastrado.");
        } else {
            StringBuilder sb = new StringBuilder();
            for (String u : usuarios) {
                sb.append(u).append("\n");
            }
            areaUsuarios.setText(sb.toString());
        }
    }
}
