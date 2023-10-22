package interface_adapter.clear_users;

// TODO Complete me

public class ClearState {
    private String deletedUsers;

    public ClearState(ClearState copy) {
        this.deletedUsers = copy.deletedUsers;
    }
    public ClearState() {}

    public String getDeletedUsers() {
        return deletedUsers;
    }

    public void setDeletedUsers(String deletedUsers) {
        this.deletedUsers = deletedUsers;
    }

}