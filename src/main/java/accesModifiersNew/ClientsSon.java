package accesModifiersNew;

import accessModifiers.Client;

public class ClientsSon extends Client{
    public static void main(String[] args) {

        Client client = new Client();
        System.out.println(client.name);

        ClientsSon cs = new ClientsSon();
        System.out.println(cs.isMarried);

        payMoney();
        giveGift();

        System.out.println(isHappy);
    }
}
