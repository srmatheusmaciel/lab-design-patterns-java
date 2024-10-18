package Subsystem1.crm;

public class CRMService {

    private CRMService() {
        super();
    }



    public static void saveClient(String name, String cep,String city, String state){
        System.out.println("Saving client in the system: " + name + " | CEP: " + cep + " | City: " + city + " | State: " + state);
    }



}
