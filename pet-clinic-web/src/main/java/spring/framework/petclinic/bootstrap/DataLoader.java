package spring.framework.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring.framework.petclinic.model.Owner;
import spring.framework.petclinic.model.Vet;
import spring.framework.petclinic.services.OwnerService;
import spring.framework.petclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final VetService vetService;
    private final OwnerService ownerService;

    public DataLoader(VetService vetService, OwnerService ownerService) {
        this.vetService = vetService;
        this.ownerService = ownerService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1=new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setSecondName("Westeon");
        ownerService.save(owner1);
        
        Owner owner2=new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setSecondName("Glennane");
        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1=new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setSecondName("Axe");
        vetService.save(vet1);
        
        Vet vet2=new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jessie");
        vet2.setSecondName("Porter");
        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
