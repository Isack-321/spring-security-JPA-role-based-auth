package com.ituwei.roleBaesdAuth.repository;

import com.ituwei.roleBaesdAuth.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post,Integer> {
}
