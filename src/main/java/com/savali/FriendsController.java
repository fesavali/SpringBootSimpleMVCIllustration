package com.savali;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class FriendsController {
    @GetMapping("/friends")
	public String getCustomers(Model model) {
        model.addAttribute("friends", FriendDao.getFriends());
        return "friends";
	}

    /**
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/friend/{id}")
    public ResponseEntity findCustomer(@PathVariable(value = "id") int id, Model model) {
        Friend slect = FriendDao.getfriendById(id);
        if (slect == null) {
			return new ResponseEntity("No friend with ID: " + id, HttpStatus.NOT_FOUND);
		}
        return new ResponseEntity(slect, HttpStatus.OK);
    }   
}
