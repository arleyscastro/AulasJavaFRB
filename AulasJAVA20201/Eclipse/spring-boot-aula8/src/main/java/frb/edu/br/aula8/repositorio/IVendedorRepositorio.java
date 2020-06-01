package frb.edu.br.aula8.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import frb.edu.br.aula8.model.Vendedor;

@Repository
public interface IVendedorRepositorio extends JpaRepository<Vendedor, Long>{

}
