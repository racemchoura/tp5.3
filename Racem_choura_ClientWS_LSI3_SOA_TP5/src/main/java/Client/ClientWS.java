package Client;

import proxy.BanqueService;
import proxy.BanqueServiceService;

public class ClientWS {
    public static void main(String[] args) {
        // Création d'une instance de BanqueService en utilisant le service généré BanqueServiceService
        // getBanqueServicePort() pour acceder au port de service
        BanqueService BanqueService = new BanqueServiceService().getBanqueServicePort();
        // Appel à la méthode "conversion" du service web avec l'argument 5
        System.out.println(BanqueService.conversion(5));
        // Appel à la methode "getCompte" du service web
        System.out.println(BanqueService.getComptes());
    }
}
