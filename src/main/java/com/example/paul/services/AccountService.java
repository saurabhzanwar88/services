package com.example.paul.services;

import com.example.paul.models.Account;
import com.example.paul.models.Transaction;
import com.example.paul.repositories.AccountRepository;
import com.example.paul.repositories.TransactionRepository;
import com.example.paul.utils.AccountInput;
import com.example.paul.utils.TransactionInput;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    public Account getAccount(String sortCode, String accountNumber) {
        Optional<Account> account = accountRepository
                .findBySortCodeAndAccountNumber(sortCode, accountNumber);

        account.ifPresent(value ->
                value.setTransactions(transactionRepository
                        .findBySourceAccountIdOrderByInitiationDate(value.getId())));

        return account.orElse(null);
    }
    
    public boolean addAccount(AccountInput accountinput) {
      
        

        
            
                var account = new Account();
                account.setId(accountinput.getId());
                account.setSortCode(accountinput.getSortCode());
                account.setAccountNumber(accountinput.getAccountNumber());
                account.setCurrentBalance(accountinput.getCurrentBalance());
                account.setBankName(accountinput.getBankName());
                account.setOwnerName(accountinput.getOwnerName());
                
                
                accountRepository.save(account);

                return true;
            
        
        
    }
    
}
