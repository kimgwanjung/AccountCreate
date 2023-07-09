package model;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repository.AccountRepository;
import repository.AccountRepositoryImpl;


public class accountCreateCommand implements accountCommand {
    private AccountRepository accountRepository;
    
    public accountCreateCommand() {
        this.accountRepository = new AccountRepositoryImpl();
    }
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        String memberId = request.getParameter("memberId");
        String accountPassword = request.getParameter("accountPassword");
        String nickname = request.getParameter("nickname");
        int accountType = Integer.parseInt(request.getParameter("accountType"));
        accountRepository.createAccount(memberId, accountPassword, nickname, accountType);
    }
}
