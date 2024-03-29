package youcode.security.service;

import org.springframework.stereotype.Component;
import youcode.security.domain.Authority;
import youcode.security.domain.enums.AuthorityEnum;

import java.util.List;
import java.util.Optional;

@Component
public interface AuthorityService {
    List<Authority> getAllByName(List<AuthorityEnum> authorities);
    Optional<Authority> getByName(AuthorityEnum authorityEnum);

    Optional<Authority> getById(Long id);
}

