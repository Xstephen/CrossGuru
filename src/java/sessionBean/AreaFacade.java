/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBean;

<<<<<<< HEAD
import entity.Area;
import entity.Police;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJBException;
=======
import entityBean.Area;
>>>>>>> origin/qiuli
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
<<<<<<< HEAD
 * @author Nicole Yang
=======
 * @author QIULI
>>>>>>> origin/qiuli
 */
@Stateless
public class AreaFacade extends AbstractFacade<Area> {

    @PersistenceContext(unitName = "crossguruPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AreaFacade() {
        super(Area.class);
    }
<<<<<<< HEAD

    public List<String> findExistedAreas() {
        List<String> areas = new ArrayList<>();
        try {
            List<Area> s = em.createNamedQuery("Area.findAll").getResultList();
            s.forEach((area) -> {
                areas.add(area.getId());
            });
        } catch (Exception e) {
            throw new EJBException(e.getMessage());
        }
        return areas;
    }

=======
    
>>>>>>> origin/qiuli
}
