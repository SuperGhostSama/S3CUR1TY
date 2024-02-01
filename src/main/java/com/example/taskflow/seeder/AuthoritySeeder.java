package com.example.taskflow.seeder;
import com.example.taskflow.domain.Authority;
import com.example.taskflow.domain.enums.AuthorityEnum;
import com.example.taskflow.repositories.AuthorityRepository;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class AuthoritySeeder {

    private final AuthorityRepository authorityRepository;

    public void seedAuthorities() {
        List<Authority> authorities = new ArrayList<>();
        for (AuthorityEnum authorityName : AuthorityEnum.values()) {
            Authority authority = Authority.builder()
                    .name(authorityName)
                    .build();
            authorities.add(authority);
        }
        authorityRepository.saveAll(authorities);
    }
}
