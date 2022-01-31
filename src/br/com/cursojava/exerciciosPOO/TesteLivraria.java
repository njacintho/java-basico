package br.com.cursojava.exerciciosPOO;

public class TesteLivraria {
	public static void main(String[] args) {
		
		LivroDeLivraria livro = new LivroDeLivraria();
		livro.nome = "A pedra filosofal";
		livro.preco = 39.9;
		
		
		System.out.println("O livro " + livro.nome  + " custa " + livro.preco);
	}

}
