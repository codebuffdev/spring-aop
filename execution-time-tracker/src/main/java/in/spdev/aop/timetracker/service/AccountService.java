package in.spdev.aop.timetracker.service;

import in.spdev.aop.timetracker.aspect.TrackExecutionTime;
import in.spdev.aop.timetracker.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AccountService {
    @Autowired
    private AccountDao accountDao;

    @TrackExecutionTime //custom-aop-anno
    public List<Map<String, Object>> getAllEmployee(){
        return accountDao.getAll();
    }
}
