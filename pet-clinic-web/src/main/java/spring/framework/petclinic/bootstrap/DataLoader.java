package spring.framework.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring.framework.petclinic.model.Owner;
import spring.framework.petclinic.model.Pet;
import spring.framework.petclinic.model.PetType;
import spring.framework.petclinic.model.Vet;
import spring.framework.petclinic.services.OwnerService;
import spring.framework.petclinic.services.PetTypeService;
import spring.framework.petclinic.services.VetService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final VetService vetService;
    private final OwnerService ownerService;
    private final PetTypeService petTypeService;

    public DataLoader(VetService vetService, OwnerService ownerService, PetTypeService petTypeService) {
        this.vetService = vetService;
        this.ownerService = ownerService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog=new PetType();
        dog.setName("Dog");
        PetType savedDogPetType=petTypeService.save(dog);

        PetType cat=new PetType();
        cat.setName("Cat");
        PetType savedCatPetType=petTypeService.save(cat);

        Owner owner1=new Owner();
        owner1.setFirstName("Michael");
        owner1.setSecondName("Westeon");
        owner1.setAddress("123 Brick Street");
        owner1.setCity("Miami");
        owner1.setTelephone("1234567890");

        Pet mikesPet=new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);
        ownerService.save(owner1);
        
        Owner owner2=new Owner();
        owner2.setFirstName("Fiona");
        owner2.setSecondName("Glennane");
        owner1.setAddress("123 Brick Street");
        owner1.setCity("Miami");
        owner1.setTelephone("9876543210");

        Pet fionasCat=new Pet();
        fionasCat.setPetType(savedCatPetType);
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setName("Just Cat");
        owner2.getPets().add(fionasCat);
        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1=new Vet();
        vet1.setFirstName("Sam");
        vet1.setSecondName("Axe");
        vetService.save(vet1);
        
        Vet vet2=new Vet();
        vet2.setFirstName("Jessie");
        vet2.setSecondName("Porter");
        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
