package it.aulab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import it.aulab.models.Arm;
import it.aulab.models.Jeeg;
import it.aulab.models.Leg;
import it.aulab.models.Side;

@Configuration
@ComponentScan("it.aulab")
public class AppConfig {
    @Bean(name = "jeeg")
    public Jeeg getJeeg(){
        System.out.println("Sto creando un jeeg");
        return new Jeeg(getArmSx(), getArmDx(), getLegSx(), getLegDx());
    }

    @Bean(name = "armSx")
    @Scope("prototype")
    public Arm getArmSx(){
        System.out.println("Sto creando un armSx");
        return new Arm(Side.Sx);
    }
   
    @Bean(name = "armDx")
    public Arm getArmDx(){
        System.out.println("Sto creando un armDx");
        return new Arm(Side.Dx);
    }

    @Bean(name = "legSx")
    public Leg getLegSx(){
        System.out.println("Sto creando un legSx");
        return new Leg(Side.Sx);
    }
   
    @Bean(name = "legDx")
    public Leg getLegDx(){
        System.out.println("Sto creando un legDx");
        return new Leg(Side.Dx);
    }

}
