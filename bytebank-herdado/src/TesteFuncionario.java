
public class TesteFuncionario {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
				
		Gerente nico = new Gerente();
		nico.setNome("Nico");
		nico.setCpf("091.665.157.69");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
//		nico.salario = 300.0;
		
	}

}
