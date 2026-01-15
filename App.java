import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        ArrayList<String> listaUsuarios = new ArrayList<>();

        TelaPrincipal telaCadastro = new TelaPrincipal(listaUsuarios);
        TelaUsuarios telaBanco = new TelaUsuarios(listaUsuarios);

        telaCadastro.setVisible(true);
        telaBanco.setVisible(true);

    }
}
