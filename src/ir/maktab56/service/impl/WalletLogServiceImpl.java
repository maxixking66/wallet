package ir.maktab56.service.impl;

import ir.maktab56.base.service.impl.BaseServiceImpl;
import ir.maktab56.domain.WalletLog;
import ir.maktab56.repository.WalletLogRepository;
import ir.maktab56.service.WalletLogService;

public class WalletLogServiceImpl extends BaseServiceImpl<WalletLog, Long, WalletLogRepository>
        implements WalletLogService {

    public WalletLogServiceImpl(WalletLogRepository repository) {
        super(repository);
    }

}
