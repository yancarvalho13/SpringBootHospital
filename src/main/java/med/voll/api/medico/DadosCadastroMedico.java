package med.voll.api.medico;

import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, Long crm, Especialidade especialidade, DadosEndereco endereco) {
}
