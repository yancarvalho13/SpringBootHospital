package med.voll.api.paciente;

public record ListagemDadosPaciente(String nome, String email, String cpf) {

    public ListagemDadosPaciente(Paciente paciente){
        this(paciente.getNome(), paciente.getEmail(), paciente.getCpf());
    }
}
