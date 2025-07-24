import java.sql.Connection;
import java.util.List;

public class TesteCMD2{
	public static void main(String[] args){
		try (Connection conexao = ConexaoDB.conectar()){
			ProdutoDAO produtoDAO = new ProdutoDAO(conexao);

			// Lista todos os produtos (deve estar vazio nesse momento).
			mostrarProdutos(produtoDAO);

			// Exemplo de consulta por ID (consultando produto com ID 1)
			Produto produtoConsultado = produtoDAO.consultaPorId(1);
			if (produtoConsultado != null){
				produtoConsultado.setNome("LapTop");
				System.out.println("Novo nome do Produto: " + produtoConsultado.getNome());
				produtoDAO.atualizar(produtoConsultado);
				System.out.println("A base de dados ficou assim:");
				mostrarProdutos(produtoDAO);
			} else {
				System.out.println("Produto não encontrado.");
			}
		} catch (Exception e) {
			System.err.println("Erro geral: " + e.getMessage());
		}
	}

	// Método para listar os produtos
	private static void mostrarProdutos(ProdutoDAO produtoDAO) {
		List<Produto> todosOsProdutos = produtoDAO.listarTodos();
		if (todosOsProdutos.isEmpty()){
			System.out.println("Nenhum produto encontrado!");
		} else {
			System.out.println("Lista de produtos: ");
			for (Produto p : todosOsProdutos) {
				System.out.println(p.getId() + ";" + p.getNome() + "-" + p.getPreco());
			}
		}
	}
}