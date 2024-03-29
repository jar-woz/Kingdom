package pl.cule.kingdom.utils;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class RoleRepository {

    @PersistenceContext
    EntityManager em;

    @Transactional
    public void persistRole(Role role) {
        em.persist(role);
    }

    public List<Role> getAll() {
        return em.createQuery("from Role", Role.class).getResultList();
    }
}
