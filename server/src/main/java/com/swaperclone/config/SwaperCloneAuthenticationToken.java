package com.swaperclone.config;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class SwaperCloneAuthenticationToken extends UsernamePasswordAuthenticationToken {

    private Long userId;

    public SwaperCloneAuthenticationToken(Object principal, Object credentials, Collection<? extends GrantedAuthority> authorities, Long userId) {
        super(principal, credentials, authorities);
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }
}
