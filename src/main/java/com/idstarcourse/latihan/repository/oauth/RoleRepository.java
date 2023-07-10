package com.idstarcourse.latihan.repository.oauth;

import com.idstarcourse.latihan.model.oauth.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface RoleRepository extends PagingAndSortingRepository<Role,Long> {
    Role findOneByName(String name);
    List<Role> findByNameIn(String[] names);
}
