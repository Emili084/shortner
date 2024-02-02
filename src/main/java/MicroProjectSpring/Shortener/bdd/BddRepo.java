package MicroProjectSpring.Shortener.bdd;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BddRepo extends JpaRepository<Url,Integer>  {

} 