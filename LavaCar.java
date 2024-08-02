import java.util.ArrayList;
import java.util.List;

public class LavaCar {
    private List<Cliente> clientes;

    public LavaCar() {
        this.clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void listarClientes() {
        System.out.println("Carros Cadastrados no LavaCar do Enrico:");
        System.out.println("=======================================");
        for (Cliente cliente : clientes) {
            System.out.println("Cliente: " + cliente.getNome() + ", Carro: " + cliente.getCarro().getModelo() + ", Placa: " + cliente.getCarro().getPlaca());
            System.out.println("----------------------------------------");
        }
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro("Fiat Uno", "ABC-1234");
        Cliente cliente1 = new Cliente("João", carro1);

        Carro carro2 = new Carro("Ford Ka", "XYZ-5678");
        Cliente cliente2 = new Cliente("Maria", carro2);

        LavaCar lavaCar = new LavaCar();
        lavaCar.adicionarCliente(cliente1);
        lavaCar.adicionarCliente(cliente2);

        lavaCar.listarClientes();
    }
}

