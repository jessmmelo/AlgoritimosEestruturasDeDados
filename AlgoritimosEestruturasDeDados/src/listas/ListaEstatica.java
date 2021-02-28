package listas;

public class ListaEstatica {

	private int info[];

	private int tamanho;

	public ListaEstatica() {
		info = new int[10];
		tamanho = 0;
	}

	public void inserir(int valor) {
		if (tamanho == info.length) {
			redimencionar();
		}
		info[tamanho] = valor;
		tamanho = tamanho + 1;
	}

	public void redimencionar() {
		int novo[];
		int novotamanho = info.length + 10;
		novo = new int[novotamanho];
		for (int i = 0; i < tamanho -1;i++) {
			novo[i] = info[i];
		}
		info = novo;
	}
	
	public void buscar() {
		
	}

}
