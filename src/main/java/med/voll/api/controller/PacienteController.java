package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.paciente.DadosCadastroPaciente;
import med.voll.api.paciente.ListagemDadosPaciente;
import med.voll.api.paciente.Paciente;
import med.voll.api.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Stream;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarPaciente(@RequestBody @Valid DadosCadastroPaciente dados){

        repository.save(new Paciente(dados));
        System.out.println("Paciente adicionado com sucesso!! \n" + dados);
    }

    @GetMapping
    public Page<ListagemDadosPaciente> listar(@PageableDefault (size = 10, sort = {"nome"}) Pageable paginacao){
        return repository.findAll(paginacao).map(ListagemDadosPaciente::new);
    }
}
