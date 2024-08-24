package med.voll.api.medico;

public record ListagemDadosMedico(String nome, String email, String crm, Especialidade especialidade) {

    public ListagemDadosMedico(Medico medico){
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
