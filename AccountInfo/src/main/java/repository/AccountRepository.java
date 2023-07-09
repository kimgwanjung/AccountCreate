package repository;

public interface AccountRepository {
    void createAccount(String memberId, String accountPassword, String nickname, int accountType);
}
