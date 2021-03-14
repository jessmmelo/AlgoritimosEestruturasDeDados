package lista03;

public class ListaEncadeada<T> {

	private NoLista primeiro;

	public ListaEncadeada() {
		primeiro = null;
	}

	// public NoLista<T> getPrimeiro(){

	// }

	public void inserir(T info) {
		NoLista<T> novo = new NoLista();
		novo.getInfo = info;
		novo.setProximo(primeiro);
		this.primeiro = novo;
	}

	// public boolean estaVazia() {
//	if(this.primeiro)
//
//	{
//		return true;
//	}else
//	{
//		return false;
//	}
//
//	}

	 public NoLista<T> buscar(T info, T v){
		 NoLista<T> p = primeiro;
		 while (p != null) {
			 if(p.getInfo == v) {
				 return p;
			 }
			 p = p.getProximo();
		 }
		 return null;
		 
	 }

	public void retirar(T info) {
		
	}

	public int obterComprimento() {
		return obterComprimento();
	}

	// public NoLista<T> obterNo(int idx){
	// return obterComprimento();
	// }

	public String toString() {
		return toString();
	}
}
