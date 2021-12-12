package topekabank;

public class TestedeOperacoesPix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=========================================");
		//1º Conta - Criação
		Conta contaErmesson = new Conta();
	
		
		contaErmesson.setAgencia(50);
		contaErmesson.setNumero(5);
		
		
		Cliente ermesson = new Cliente();
		
		ermesson.setNome("Ermesson Lima");
		ermesson.setCpf("093.123.456-28");
		ermesson.setProfissao("Desenvolvedor - FullStack");
		
		Endereco enderecoErmesson = new Endereco();
		
		enderecoErmesson.setRua("Rua Nossa Senhora Auxiliadora");
		enderecoErmesson.setBairro("Dom Constantino");
		enderecoErmesson.setNum(110);
		
		ermesson.setEndereco(enderecoErmesson);
		contaErmesson.setNome(ermesson);
		contaErmesson.setChavePix(ermesson.getCpf());
		//1º Imprimir dados
		
		System.out.print("Nome: ");
		System.out.println(contaErmesson.getNome().getNome());
		System.out.print("CPF: ");
		System.out.println(contaErmesson.getNome().getCpf());
		System.out.print("Profissão: ");
		System.out.println(contaErmesson.getNome().getProfissao());
		System.out.println("Endereço");
		System.out.print("Rua: ");
		System.out.println(ermesson.getEndereco().getRua());
		System.out.print("Bairro: ");
		System.out.println(ermesson.getEndereco().getBairro());
		System.out.print("Número: ");
		System.out.println(ermesson.getEndereco().getNum());
		System.out.print("Saldo em conta: R$ ");
		System.out.println(contaErmesson.getSaldo());
		System.out.print("Chave Pix: ");
		System.out.println(contaErmesson.getChavePix());
	
		System.out.println("\n");
		
		//Operações
		System.out.print("Operações: \n");
		//Deposito
		System.out.print("Deposito de R$ 5000,00: \n");
		contaErmesson.deposito(5000);
		System.out.print("Saldo atual Ermesson: R$ ");
		System.out.println(contaErmesson.getSaldo());
		System.out.print("\n\n");
		
		//Saque
		System.out.print("Saque de R$ 1000,00: \n");
		contaErmesson.saque(1000);
		System.out.print("Saldo atual Ermesson: R$ ");
		System.out.println(contaErmesson.getSaldo());
		System.out.print("\n\n");
		
		//============================== separação =====================
		System.out.println("=========================================");
		//2º Conta - Criação
		Conta contaAna = new Conta();
		
		contaAna.setAgencia(50);
		contaAna.setNumero(5);
	
		
		Cliente ana = new Cliente();
		
		ana.setNome("Ana Beatriz");
		ana.setCpf("093.987.235-14");
		ana.setProfissao("Estagiaria - Redes");
		
		Endereco enderecoAna = new Endereco();
		
		enderecoAna.setRua("Rua do Flamengo");
		enderecoAna.setBairro("Rua Santa Luzia");
		enderecoAna.setNum(15);
		
		ana.setEndereco(enderecoAna);
		contaAna.setNome(ana);
		contaAna.setChavePix(ana.getCpf());

		//2º Imprimir dados
		System.out.print("Nome: ");
		System.out.println(contaAna.getNome().getNome());
		System.out.print("CPF: ");
		System.out.println(contaAna.getNome().getCpf());
		System.out.print("Profissão: ");
		System.out.println(contaAna.getNome().getProfissao());
		System.out.println("Endereço");
		System.out.print("Rua: ");
		System.out.println(ana.getEndereco().getRua());
		System.out.print("Bairro: ");
		System.out.println(ana.getEndereco().getBairro());
		System.out.print("Número: ");
		System.out.println(ana.getEndereco().getNum());
		System.out.print("Saldo em conta: R$ ");
		System.out.println(contaAna.getSaldo());
		System.out.print("Chave Pix: ");
		System.out.println(contaAna.getChavePix());
	
		System.out.println("\n");
		
		//Operações
		System.out.print("Operações: \n");
		//Deposito
		System.out.print("Deposito de R$ 800,00: \n");
		contaAna.deposito(800);
		System.out.print("Saldo Atual da Ana: R$ ");
		System.out.println(contaAna.getSaldo());
		System.out.print("\n\n");
		
		//Saque
		System.out.print("Saque de R$ 400,00: \n");
		contaAna.saque(400);
		System.out.print("Saldo atual da Ana: R$ ");
		System.out.println(contaAna.getSaldo());
		System.out.print("\n\n");
		
		
		//Transferencia
		System.out.print("Transferencia de R$ 1.300,00  de Ermesson para Ana: \n");
		contaErmesson.transferencia(1300, contaAna, "093.987.235-14" );
		System.out.print("Saldo atual da Ana: R$ ");
		System.out.println(contaAna.getSaldo());
		System.out.print("Saldo atual do Ermesson: R$ ");
		System.out.println(contaErmesson.getSaldo());
		System.out.print("\n\n");
		
		
	//============================== separação =====================
		System.out.println("=========================================");
		//3º Conta - Criação
		Conta contaJoanderson = new Conta();
		

		contaJoanderson.setAgencia(50);
		contaJoanderson.setNumero(5);
	
		
		Cliente joanderson = new Cliente();
		
		joanderson.setNome("Joanderson Silva");
		joanderson.setCpf("773.777.235-14");
		joanderson.setProfissao("Musico - Rap");
		
		Endereco enderecoJoanderson = new Endereco();
		
		enderecoJoanderson.setRua("Frei Damião");
		enderecoJoanderson.setBairro("Dom Constantino");
		enderecoJoanderson.setNum(12);
		
		joanderson.setEndereco(enderecoJoanderson);
		contaJoanderson.setNome(joanderson);
		contaJoanderson.setChavePix(joanderson.getCpf());

		//3º Imprimir dados
		System.out.print("Nome: ");
		System.out.println(contaJoanderson.getNome().getNome());
		System.out.print("CPF: ");
		System.out.println(contaJoanderson.getNome().getCpf());
		System.out.print("Profissão: ");
		System.out.println(contaJoanderson.getNome().getProfissao());
		System.out.println("Endereço");
		System.out.print("Rua: ");
		System.out.println(joanderson.getEndereco().getRua());
		System.out.print("Bairro: ");
		System.out.println(joanderson.getEndereco().getBairro());
		System.out.print("Número: ");
		System.out.println(joanderson.getEndereco().getNum());
		System.out.print("Saldo em conta: R$ ");
		System.out.println(contaJoanderson.getSaldo());
		System.out.print("Chave Pix: ");
		System.out.println(contaJoanderson.getChavePix());
	
		System.out.println("\n");
		
		//Operações
		System.out.print("Operações: \n");
		//Deposito
		System.out.print("Deposito de R$ 80,00: \n");
		contaJoanderson.deposito(80);
		System.out.print("Saldo Atual do Joanderson: R$ ");
		System.out.println(contaJoanderson.getSaldo());
		System.out.print("\n\n");
		
		//Saque
		System.out.print("Saque de R$ 1500,00: \n");
		contaJoanderson.saque(1500);
		System.out.print("Saldo atual do Joanderson: R$ ");
		System.out.println(contaJoanderson.getSaldo());
		System.out.print("\n\n");

	//============================== separação =====================
		System.out.println("=========================================");
		//4º Conta - Criação
		Conta contaNeto = new Conta();
		

		contaNeto.setAgencia(50);
		contaNeto.setNumero(5);
	
		
		Cliente neto = new Cliente();
		
		neto.setNome("Neto Silva");
		neto.setCpf("773.777.235-14");
		neto.setProfissao("T.I");
		
		Endereco enderecoNeto = new Endereco();
		
		enderecoNeto.setRua("Frei Damião");
		enderecoNeto.setBairro("Dom Constantino");
		enderecoNeto.setNum(12);
		
		neto.setEndereco(enderecoNeto);
		contaNeto.setNome(neto);
		contaNeto.setChavePix(neto.getCpf());

		//4º Imprimir dados
		System.out.print("Nome: ");
		System.out.println(contaNeto.getNome().getNome());
		System.out.print("CPF: ");
		System.out.println(contaNeto.getNome().getCpf());
		System.out.print("Profissão: ");
		System.out.println(contaNeto.getNome().getProfissao());
		System.out.println("Endereço");
		System.out.print("Rua: ");
		System.out.println(neto.getEndereco().getRua());
		System.out.print("Bairro: ");
		System.out.println(neto.getEndereco().getBairro());
		System.out.print("Número: ");
		System.out.println(neto.getEndereco().getNum());
		System.out.print("Saldo em conta: R$ ");
		System.out.println(contaNeto.getSaldo());
		System.out.print("Chave Pix: ");
		System.out.println(contaNeto.getChavePix());
	
		System.out.println("\n");
		
		//Operações
		System.out.print("Operações: \n");
		//Deposito
		System.out.print("Deposito de R$ 70,00: \n");
		contaNeto.deposito(70);
		System.out.print("Saldo Atual do Neto: R$ ");
		System.out.println(contaNeto.getSaldo());
		System.out.print("\n\n");
		
		//Saque
		System.out.print("Saque de R$ 200,00: \n");
		contaNeto.saque(200);
		System.out.print("Saldo atual do Neto: R$ ");
		System.out.println(contaNeto.getSaldo());
		System.out.print("\n\n");

		//============================== separação =====================
				System.out.println("=========================================");
				//5º Conta - Criação
				Conta contaJuarez = new Conta();
				

				contaJuarez.setAgencia(50);
				contaJuarez.setNumero(5);
			
				
				Cliente juarez = new Cliente();
				
				juarez.setNome("Juarez Barbosa");
				juarez.setCpf("993.778.235-14");
				juarez.setProfissao("Advogado");
				
				Endereco enderecoJuarez = new Endereco();
				
				enderecoJuarez.setRua("Brasilia");
				enderecoJuarez.setBairro("Palmeira Alta");
				enderecoJuarez.setNum(88);
				
				juarez.setEndereco(enderecoJuarez);
				contaJuarez.setNome(juarez);
				contaJuarez.setChavePix(juarez.getCpf());

				//5º Imprimir dados
				System.out.print("Nome: ");
				System.out.println(contaJuarez.getNome().getNome());
				System.out.print("CPF: ");
				System.out.println(contaJuarez.getNome().getCpf());
				System.out.print("Profissão: ");
				System.out.println(contaJuarez.getNome().getProfissao());
				System.out.println("Endereço");
				System.out.print("Rua: ");
				System.out.println(juarez.getEndereco().getRua());
				System.out.print("Bairro: ");
				System.out.println(juarez.getEndereco().getBairro());
				System.out.print("Número: ");
				System.out.println(juarez.getEndereco().getNum());
				System.out.print("Saldo em conta: R$ ");
				System.out.println(contaJuarez.getSaldo());
				System.out.print("Chave Pix: ");
				System.out.println(contaJuarez.getChavePix());
			
				System.out.println("\n");
				
				//Operações
				System.out.print("Operações: \n");
				//Deposito
				System.out.print("Deposito de R$ 2500,00: \n");
				contaJuarez.deposito(2500);
				System.out.print("Saldo Atual do Juarez: R$ ");
				System.out.println(contaJuarez.getSaldo());
				System.out.print("\n\n");
				
				//Saque
				System.out.print("Saque de R$ 800,00: \n");
				contaJuarez.saque(800);
				System.out.print("Saldo atual do Juarez: R$ ");
				System.out.println(contaJuarez.getSaldo());
				System.out.print("\n\n");

				//============================== separação =====================
				System.out.println("=========================================");
				//6º Conta - Criação
				Conta contaCirilo = new Conta();
				
				contaCirilo.setAgencia(50);
				contaCirilo.setNumero(5);
			
				
				Cliente cirilo = new Cliente();
				
				cirilo.setNome("Matheus Cirilo");
				cirilo.setCpf("093.987.488-14");
				cirilo.setProfissao("Designer - dispositivos moveis");
				
				Endereco enderecoCirilo = new Endereco();
				
				enderecoCirilo.setRua("Rua Santa Catarina");
				enderecoCirilo.setBairro("Tocatins");
				enderecoCirilo.setNum(15);
				
				cirilo.setEndereco(enderecoCirilo);
				contaCirilo.setNome(cirilo);
				contaCirilo.setChavePix(cirilo.getCpf());

				//6º Imprimir dados
				System.out.print("Nome: ");
				System.out.println(contaCirilo.getNome().getNome());
				System.out.print("CPF: ");
				System.out.println(contaCirilo.getNome().getCpf());
				System.out.print("Profissão: ");
				System.out.println(contaCirilo.getNome().getProfissao());
				System.out.println("Endereço");
				System.out.print("Rua: ");
				System.out.println(cirilo.getEndereco().getRua());
				System.out.print("Bairro: ");
				System.out.println(cirilo.getEndereco().getBairro());
				System.out.print("Número: ");
				System.out.println(cirilo.getEndereco().getNum());
				System.out.print("Saldo em conta: R$ ");
				System.out.println(contaCirilo.getSaldo());
				System.out.print("Chave Pix: ");
				System.out.println(contaCirilo.getChavePix());
			
				System.out.println("\n");
				
				//Operações
				System.out.print("Operações: \n");
				//Deposito
				System.out.print("Deposito de R$ 1000,00: \n");
				contaCirilo.deposito(1000);
				System.out.print("Saldo Atual da Ana: R$ ");
				System.out.println(contaCirilo.getSaldo());
				System.out.print("\n\n");
				
				//Saque
				System.out.print("Saque de R$ 300,00: \n");
				contaCirilo.saque(300);
				System.out.print("Saldo atual do Cirilo: R$ ");
				System.out.println(contaCirilo.getSaldo());
				System.out.print("\n\n");
				
				
				//Transferencia
				System.out.print("Transferencia de R$ 2000,00  de Juarez para Cirilo: \n");
				contaJuarez.transferencia(2000, contaCirilo, "093.987.488-14" );
				System.out.print("Saldo atual do Cirilo: R$ ");
				System.out.println(contaCirilo.getSaldo());
				System.out.print("Saldo atual do Juarez: R$ ");
				System.out.println(contaJuarez.getSaldo());
				System.out.print("\n\n");
				
		
		
		}

}
