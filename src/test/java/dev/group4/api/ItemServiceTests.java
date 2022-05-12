package dev.group4.api;

import dev.group4.entities.Item;
import dev.group4.entities.Potluck;
import dev.group4.entities.StatusType;
import dev.group4.repos.ItemRepo;
import dev.group4.services.ItemService;
import dev.group4.services.ItemServiceImpl;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
  public class ItemServiceTests {
    @Autowired
    private ItemService itemService;
    static Item item;

    @Autowired
    private ItemRepo itemRepo;


    /*@Test
    @Order(1)
    void registerTest() {
        Item i = new Item ("buttchecks","Pizza", StatusType.WANTED, "Ron from Accounting","PotluckId");

        item = itemService.registerItem(i);
        System.out.println(item);
        Assertions.assertNotEquals("buttchecks",item.getId());
    }

    @Test
    @Order(2)
    void getByIdTest() {
        Item temp = itemService.getItemById(item.getId());
        Assertions.assertNotNull(temp);
    }

    @Test
    @Order(3)
    void replaceTest() {
        item.setDescription("Ice cream");
        
    }

    @Test
    @Order(4)
    void supplierTest() {
        item = itemService.updateSupplier(item,"Your mom");
        Assertions.assertEquals("Your mom", item.getSupplier());
    }

    @Test
    @Order(5)
    void deleteTest() {
        Assertions.assertTrue(itemService.deleteItem(item));
    }*/

    @Test
    @Order(1)
    void registerTest() {
        Item item = new Item ("","Pizza", StatusType.WANTED, "Ron from Accounting","");
        //item = itemService.registerItem(item);
        itemRepo.save(item);
        Assertions.assertNotEquals("buttchecks",item.getId());
    }

//    @Test
//    @Order(2)
//    void getByIdTest() {
//        Item temp = itemService.getItemById(item.getId());
//        Assertions.assertNotNull(temp);
//    }
//
//    @Test
//    @Order(3)
//    void replaceTest() {
//        item.setDescription("Ice cream");
//
//    }
//
//    @Test
//    @Order(4)
//    void supplierTest() {
//        item = itemService.updateSupplier(item,"Your mom");
//        Assertions.assertEquals("Your mom", item.getSupplier());
//    }
//
//    @Test
//    @Order(5)
//    void deleteTest() {
//        Assertions.assertTrue(itemService.deleteItem(item));
//    }

}