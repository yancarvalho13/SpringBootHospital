package med.voll.api.paciente;

public record ListagemDadosPaciente(Long id,String nome, String email, String cpf) {

    public ListagemDadosPaciente(Paciente paciente){
        this(paciente.getId(),paciente.getNome(), paciente.getEmail(), paciente.getCpf());
    }
}
