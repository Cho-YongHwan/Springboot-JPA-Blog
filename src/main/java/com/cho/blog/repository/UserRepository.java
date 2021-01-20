package com.cho.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cho.blog.model.User;

// DAO
// 자동으로 bean등록이 된다.
// @Repository // 생략가능함
public interface UserRepository extends JpaRepository<User, Integer>{

}
