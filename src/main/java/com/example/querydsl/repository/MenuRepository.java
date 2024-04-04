package com.example.querydsl.repository;

import com.example.querydsl.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * packageName    : com.example.querydsl.repository
 * fileName       : MenuRepository
 * author         : hj
 * date           : 2023-05-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-05-24        hj       최초 생성
 */
public interface MenuRepository extends JpaRepository<Menu, Long> {

}
