package lista01;

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
		tamanho++;
	}

	public void redimencionar() {
		int novo[];
		int novotamanho = info.length + 10;
		novo = new int[novotamanho];
		for (int i = 0; i < tamanho - 1; i++) {
			novo[i] = info[i];
		}
		info = novo;
	}

	public void exibir() {
		for (int i = 0; i < tamanho; i++) {
			System.out.println(info[i]);
		}
	}

	public int buscar(int valor) {
		for (int i = 0; i < tamanho; i++) {
			if (info[i] == valor) {
				return i;
			}
		}
		return -1;
	}

	public void retirar(int valor) {
		int posicao = buscar(valor);
		if (posicao > -1) {
			for (int i = posicao; i < tamanho - 1; i++) {
				info[i] = info[i + 1];
			}
			tamanho--;
		}
	}

	public void liberar() {
		info = new int[10];
		tamanho = 0;
	}

	public int obterElemento(int posicao) {
		if (posicao >= 0 && (posicao < tamanho)) {
			return info[posicao];
		} else {
			throw new IndexOutOfBoundsException();
		}
	}

	public boolean estaVazia() {
		return tamanho == 0;
	}
	
	public int getTamanho() {
		return tamanho;
	}

	public String toString() {
		String resultado = "";
		for ( int i = 0; i< tamanho; i++) {
			if ( i>0)
				resultado += ",";
			resultado += info [i];
		}
		return resultado;
	}

}
