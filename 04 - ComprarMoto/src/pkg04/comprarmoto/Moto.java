package pkg04.comprarmoto;
public class Moto {
	double precoFinal, valorParcela, valor;
	int qtdParcela;
	
	public Moto() {}
	
	
	public Moto( double valor, int qtdParcela) {
		super();
		this.valor = valor;
		this.qtdParcela = qtdParcela;
	}

	public void mostrarParcelas() {
		System.out.println("Valor: R$" + this.getPrecoFinal());
		System.out.println("Valor por parcela: R$" + this.getValorParcela());
		System.out.println("Parcelas: " + this.getQtdParcela());
	}
	
	public void comprar(int parcelas) {
		if(parcelas == 0) 
		{			
			this.setPrecoFinal(getValor() - (getValor() * 0.30)); 
		}
		else if(parcelas == 5)
		{
			this.setPrecoFinal(getValor() + (getValor() * 0.04));
			this.setValorParcela(this.getPrecoFinal() / 5);
		}
		else if(parcelas == 11)
		{
			this.setPrecoFinal(getValor() + (getValor() * 0.07));
			this.setValorParcela(this.getPrecoFinal() / 11);
		}
		else if(parcelas == 17)
		{
			this.setPrecoFinal(getValor() + (getValor() * 0.10));
			this.setValorParcela(this.getPrecoFinal() / 17);
		}
		else if(parcelas == 23)
		{
			this.setPrecoFinal(getValor() + (getValor() * 0.13));
			this.setValorParcela(this.getPrecoFinal() / 23);
		}
		else if(parcelas == 29)
		{
			this.setPrecoFinal(getValor() + (getValor() * 0.16));
			this.setValorParcela(this.getPrecoFinal() / 29);
		}
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getPrecoFinal() {
		return precoFinal;
	}
	public void setPrecoFinal(double precoFinal) {
		this.precoFinal = precoFinal;
	}
	public double getValorParcela() {
		return valorParcela;
	}
	public void setValorParcela(double valorParcela) {
		this.valorParcela = valorParcela;
	}
	public int getQtdParcela() {
		return qtdParcela;
	}
	public void setQtdParcela(int qtdParcela) {
		this.qtdParcela = qtdParcela;
	}
}
