package it.aulab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.aulab.models.Arm;
import it.aulab.models.Jeeg;
import it.aulab.models.Leg;
import it.aulab.repositories.JeegRepository;

@Component("jeegService")
public class JeegServiceImpl implements JeegService{

    public JeegServiceImpl() {
        System.out.println("Create service");
    }


    @Autowired
    private JeegRepository repository;

    public JeegRepository getRepository() {
        return repository;
    }
   
    public void setRepository(JeegRepository repository) {
        this.repository = repository;
    }

    @Override
    public void attack() {
        if(this.repository.getJeeg() != null){
            Jeeg jeeg = this.repository.getJeeg();
            Arm armSx = jeeg.getArmSx();
            Arm armDx = jeeg.getArmDx();

            armSx.attack();
            armDx.attack();
    
            //System.out.println("Jeeg attacca!");
        }
    }

    @Override
    public void move() {
        if(this.repository.getJeeg() != null){
            Jeeg jeeg = this.repository.getJeeg();
            Leg legSx = jeeg.getLegSx();
            Leg legDx = jeeg.getLegDx();

            legSx.walkBackward();
            legDx.walkForward();

            //System.out.println("Jeeg si muove!");
        }
    }
    
}
