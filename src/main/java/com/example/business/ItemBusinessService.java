package com.example.business;

import com.example.data.ItemRepository;
import com.example.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ItemBusinessService {

    @Autowired
    private ItemRepository itemRepository;
    public Item retrieveHardCodedItem() {
        return new Item(1, "Ball", 10, 100);
    }

    public List<Item> retrieveAllItems(){
        List<Item> items = itemRepository.findAll();
        for(Item item : items) {
            item.setValue(item.getPrice() * item.getQuantity());
        }
        return items;
    }
}
