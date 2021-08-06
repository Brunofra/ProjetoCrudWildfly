package com.br.ProjetoCrudWildfly.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.ProjetoCrudWildfly.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
