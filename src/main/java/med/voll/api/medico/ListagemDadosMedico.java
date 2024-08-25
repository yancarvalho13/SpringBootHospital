package med.voll.api.medico;

public record ListagemDadosMedico(Long id, String nome, String email, String crm, Especialidade especialidade) {

    public ListagemDadosMedico(Medico medico){
        this(medico.getId(),medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
