package sn.thiare.GIESARA.backend.service;

import org.springframework.stereotype.Service;
import sn.thiare.GIESARA.backend.repository.TownRepository;

@Service
public class TownService {

    private TownRepository townRepository;

    public TownService(TownRepository townRepository) {
        this.townRepository = townRepository;
    }
}
