package com.br.ProjetoCrudWildfly.Controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.br.ProjetoCrudWildfly.Entity.User;
import com.br.ProjetoCrudWildfly.Repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<User> lista()throws Exception{
		return this.userRepository.findAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable Long id)throws Exception{
		this.userRepository.deleteById(id);
		return "deletado com sucesso";
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public String salvar(@RequestBody User user)throws Exception {
		this.userRepository.save(user);
		return "salvo com sucesso";
	}

	@RequestMapping(value = "", method = RequestMethod.PUT)
	public String alterar(@RequestBody User user)throws Exception {
		this.userRepository.save(user);
		return "alterado com sucesso";
	}
}
