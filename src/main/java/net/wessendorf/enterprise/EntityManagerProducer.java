package net.wessendorf.enterprise;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ApplicationScoped
public class EntityManagerProducer {
  
  private EntityManagerFactory entityManagerFactory;

  @PostConstruct
  public void createEntityManagerFactory() {
    entityManagerFactory = Persistence.createEntityManagerFactory("simpleModernEEApplication");
  }
  
  @Produces
  @RequestScoped
  public EntityManager createEntityManager() {
    return entityManagerFactory.createEntityManager();
  }
  
  public void closeEntityManager(@Disposes EntityManager entityManager) {
    if(entityManager != null && entityManager.isOpen()) {
      entityManager.close();
    }
  }

  
}
