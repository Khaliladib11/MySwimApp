
package mini.project.java;


public class Client {
    private int clientId;
    private String clientName;
    private String clientNumber;
    private String clientAddress;
    private String clientEmail;

    public Client(){}
    public Client(int clientId, String clientName, String clientNumber, String clientAddress, String clientEmail) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.clientNumber = clientNumber;
        this.clientAddress = clientAddress;
        this.clientEmail = clientEmail;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(String clientNumber) {
        this.clientNumber = clientNumber;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    @Override
    public String toString() {
        return "Client{" + "clientId=" + clientId + ", clientName=" + clientName + ", clientNumber=" + clientNumber + ", clientAddress=" + clientAddress + ", clientEmail=" + clientEmail + '}';
    }
    
    
    
}
