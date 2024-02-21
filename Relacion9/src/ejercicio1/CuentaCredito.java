package ejercicio1;

public class CuentaCredito extends Cuenta {
	
	private static final int CREDITO_MAXIMO = 300;
	private static final int CREDITO_DEFAULT = 100;
	private double credito;

	public CuentaCredito(double saldo, String titular, double credito) throws CuentaException {
		super(saldo, titular);
		setCredito(credito);
	}
	
	public CuentaCredito(double saldo, String titular) throws CuentaException {
		super(saldo, titular);
		setCredito(CREDITO_DEFAULT);
	}
	
	public CuentaCredito(String titular, double credito) throws CuentaException {
		super(titular);
		setCredito(credito);
	}
	
	public CuentaCredito(String titular) throws CuentaException {
		super(titular);
		setCredito(CREDITO_DEFAULT);
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) throws CuentaException {
		if(credito>CREDITO_MAXIMO || credito<0) {
			throw new CuentaException("El credito debe ser un numero positivo como maximo 300");
		}
		if(super.getSaldo()<-credito) {
			throw new CuentaException("No puedes poner un credito menor a la cantidad negativa");
		}
		this.credito=credito;
	}
	
	public void realizarReintegro(double reintegro) throws CuentaException {
		if (reintegro <= 0){
			throw new CuentaException("El reintegro solo puede realizarse con cantidades positivas.");
		}
		if (reintegro > super.saldo+credito) {
			throw new CuentaException("No tienes suficiente saldo.");
		} 
			
		super.saldo = super.saldo - reintegro;
		super.contadorReintegros++;
	}

	@Override
	public String toString() {
		return super.toString()+"  Credito=" + credito;
	}
	

}
