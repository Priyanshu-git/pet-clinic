package spring.framework.petclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import spring.framework.petclinic.model.Owner;
import spring.framework.petclinic.model.Pet;
import spring.framework.petclinic.model.PetType;
import spring.framework.petclinic.services.OwnerService;
import spring.framework.petclinic.services.PetService;
import spring.framework.petclinic.services.PetTypeService;

import java.util.HashSet;
import java.util.Set;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(MockitoExtension.class)
class PetTypeTest {

    @Mock
    PetService petService;

    @Mock
    OwnerService ownerService;

    @Mock
    PetTypeService petTypeService;

    @InjectMocks
    PetController petController;

    MockMvc mockMvc;
    Owner owner;
    Set<PetType> petTypes;


    @BeforeEach
    void setUp() {
        owner = Owner.builder().id(1L).build();

        petTypes = new HashSet<>();
        petTypes.add(PetType.builder().id(1L).name("Dog").build());
        petTypes.add(PetType.builder().id(2L).name("Cat").build());

        mockMvc = MockMvcBuilders.standaloneSetup(petController).build();
    }

//    @Test
//    void initCreationForm() throws Exception {
//        when(ownerService.findById(anyLong())).thenReturn(owner);
//        when(petTypeService.findAll()).thenReturn(petTypes);
//
//        mockMvc.perform(get("/owners/1/pets/new"))
//                .andExpect(status().isOk())
//                .andExpect(model().attributeExists("owner"))
//                .andExpect(model().attributeExists("pet"))
//                .andExpect(view().name("pets/createOrUpdatePetForm"));
//    }
//
//    @Test
//    void processCreationForm() throws Exception {
//        when(ownerService.findById(anyLong())).thenReturn(owner);
//        when(petTypeService.findAll()).thenReturn(petTypes);
//
//        mockMvc.perform(post("/owners/1/pets/new"))
//                .andExpect(status().is3xxRedirection())
//                .andExpect(view().name("redirect:/owners/1"));
//
//        verify(petService).save(any());
//    }

    @Test
    void initUpdateForm() throws Exception {
        Pet pet = new Pet();
        pet.setId(2L);

        when(ownerService.findById(anyLong())).thenReturn(owner);
        when(petTypeService.findAll()).thenReturn(petTypes);
        when(petService.findById(anyLong())).thenReturn(pet);

        mockMvc.perform(get("/owners/1/pets/2/edit"))
                .andExpect(status().isOk())
                .andExpect(model().attributeExists("owner"))
                .andExpect(model().attributeExists("pet"))
                .andExpect(view().name("pets/createOrUpdatePetForm"));
    }

//    @Test
//    void processUpdateForm() throws Exception {
//        when(ownerService.findById(anyLong())).thenReturn(owner);
//        when(petTypeService.findAll()).thenReturn(petTypes);
//
//        mockMvc.perform(post("/owners/1/pets/2/edit"))
//                .andExpect(status().is3xxRedirection())
//                .andExpect(view().name("redirect:/owners/1"));
//
//        verify(petService).save(any());
//    }

}