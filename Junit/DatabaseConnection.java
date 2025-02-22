class DatabaseConnection {
    boolean connected;

    void connect() {
        connected = true;
    }

    void disconnect() {
        connected = false;
    }
}