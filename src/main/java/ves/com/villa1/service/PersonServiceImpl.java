package ves.com.villa1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ves.com.villa1.entity.Persona;
import ves.com.villa1.exception.ResourceNotFoundException;
import ves.com.villa1.repository.PersonaRepository;

@Service
public class PersonServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository repository;

    @Override
    public Persona findById(int id) {
        this.existPerson(id);
        return repository.findById(id).get();
    }

    @Override
    public List<Persona> findAll() {
        return repository.findAll();
    }

    @Override
    public Boolean deleteById(int id) {
        var response = existPerson(id);
        if (response) {
            repository.deleteById(id);
        }
        return response;
    }

    @Override
    public Persona updateById(int id, Persona t) {
        var person = new Persona();
        if (existPerson(id)) {
            person = repository.findById(id).get();
            person.setApellidoMaterno(t.getApellidoMaterno());
            person.setApellidoPaterno(t.getApellidoMaterno());
            person.setCelular(t.getCelular());
            person.setDireccion(t.getDireccion());
            person.setDocumentoIdentidad(t.getDocumentoIdentidad());
            person.setEmail(t.getEmail());
            person.setEstadoCivil(t.getEstadoCivil());
            person.setFechNacimiento(t.getFechNacimiento());
            person.setGradoInstruccion(t.getGradoInstruccion());
            person.setNombre(t.getNombre());
            person.setSexo(t.getSexo());
            person.setTelefono(t.getTelefono());
            person.setTipoDocumentoIdentidad(t.getTipoDocumentoIdentidad());
            repository.save(person);
        }
        return repository.save(person);
    }

    @Override
    public Persona save(Persona t) {
        return repository.save(t);
    }

    private boolean existPerson(int id) {
        var response = repository.existsById(id);
        if (!response) {
            throw new ResourceNotFoundException("No found person with id " + id);
        }
        return response;
    }

}
