//package org.example.companymanagement.model.entity;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.io.Serializable;
//import java.time.LocalDate;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.Date;
//import java.util.List;
//
//@Data
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//public class User implements UserDetails{
//
//    private Long id;
//    private String name;
//    private String surname;
//    private String email;
//    private String username;
//    private String password;
//    private int status;
//    private LocalDate created_at;
//    private LocalDate updated_at;
//
//
//
//    //Todo getPassword and username not exist --------------------------
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return Collections.emptyList();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}
