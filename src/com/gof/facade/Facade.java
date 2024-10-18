package com.gof.facade;

import Subsystem1.crm.CRMService;
import subsystem2.cep.CepApi;

public class Facade {

    public void migrate(String name, String cep){
        String city = CepApi.getInstance().getCity(cep);
        String state = CepApi.getInstance().getState(cep);

        CRMService.saveClient(name, cep, city, state);



    }


}
