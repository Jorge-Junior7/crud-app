package BANCODEDADOS;

import DTO.AutenticarLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class UsuarioDAO {

    Connection conn;

    public ResultSet autenticacaoUsuario(AutenticarLogin objetousuariodto) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT * FROM autenticadoruser WHERE email_user = ? and senha_user = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objetousuariodto.getLogin());
            pstm.setString(2, objetousuariodto.getSenha());

            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
            return null;
        }
    }
}
