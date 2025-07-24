import java.sql.Connection;
import java.util.List;

public class TesteCMD{
	public static void main(String[] args){
		try (Connection conexao = ConexaoDB.conectar()){
			ProdutoDAO produtoDAO = new ProdutoDAO(conexao);

			// Lista todos os produtos (deve estar vazio nesse momento).
			mostrarProdutos(produtoDAO);

			// Exemplo de inserç~~ao de produtos
			Produto novoProduto1 = new Produto("Notebook", 10, 2300, "Em estoque");
			Produto novoProduto2 = new Produto("SmarthPhone", 25, 7999, "Estoque baixo");
			Produto novoProduto3 = new Produto("PS5", 20, 4500, "Estoque Baixo");

			produtoDAO.inserir(novoProduto1);
			produtoDAO.inserir(novoProduto2);
			produtoDAO.inserir(novoProduto3);

			// Lista todos os produtos após inseri-los
			mostrarProdutos(produtoDAO);

			// Exemplo de consulta por ID (consultando produto com ID 1)
			Produto produtoConsultado = produtoDAO.consultaPorId(1);
			if (produtoConsultado != null){
				System.out.println("Produto encontrado: " + produtoConsultado.getNome());
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