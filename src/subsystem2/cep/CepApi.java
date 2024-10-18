package subsystem2.cep;

public class CepApi {

    private static CepApi instance = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instance;
    }


    public String getCity(String cep){
        return "Beverly Hills";
    }


    public String getState(String cep){
        return "California";
    }



}
