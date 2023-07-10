package com.idstarcourse.latihan.repository.oauth;

import com.idstarcourse.latihan.model.oauth.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ClientRepository extends PagingAndSortingRepository<Client,Long> {
    Client findOneByClientId(String clientId);
}
