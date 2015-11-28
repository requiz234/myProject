package com.springapp.mvc.clDao;

import com.springapp.mvc.cl.Client;

/**
 * Created by User on 13.10.2015.
 */
public interface ClientDao {
    public void insert(Client client);
    public Client find(int client_id);
}
