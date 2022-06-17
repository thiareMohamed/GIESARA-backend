package sn.thiare.GIESARA.backend.service;

import org.springframework.stereotype.Service;

@Service
public class CommonService {

    private CommonService commonService;

    public CommonService(CommonService commonService) {
        this.commonService = commonService;
    }

}
