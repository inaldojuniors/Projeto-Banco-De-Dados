import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class RemovedorTabela {
    public static void main(String[] args) {
        try (Connection conexao = ConexaoDB.conectar(); // Reutiliza o método de conexão
             Statement stmt = conexao.createStatement()) {

            // Comando SQL para excluir a tabela 'produtos'
            // 'IF EXISTS' garante que não haverá erro se a tabela já não existir
            String comandoSql = "DROP TABLE IF EXISTS produtos;";
            System.out.println("Executando: " + comandoSql);

            // Executando o comando SQL
            stmt.execute(comandoSql);

            System.out.println("Tabela 'produtos' removida com sucesso (se existia).");

        } catch (SQLException e) {
            System.err.println("Erro ao remover a tabela: " + e.getMessage());
            e.printStackTrace();
        }
    }
}