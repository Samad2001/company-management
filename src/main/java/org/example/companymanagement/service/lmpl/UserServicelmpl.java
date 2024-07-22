//package org.example.companymanagement.service.lmpl;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.example.companymanagement.exception.CommonException;
//import org.example.companymanagement.mapper.UserMapper;
//import org.example.companymanagement.model.dto.request.LoginRequest;
//import org.example.companymanagement.model.dto.request.RegisterRequest;
//import org.example.companymanagement.model.dto.response.LoginResponse;
//import org.example.companymanagement.model.dto.response.RegisterResponse;
//import org.example.companymanagement.model.entity.User;
//import org.example.companymanagement.repository.UserRepository;
//import org.example.companymanagement.service.UserService;
//import org.springframework.http.HttpStatus;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.Objects;
//import java.util.Optional;
//
//
//@Slf4j
//@Service
//@RequiredArgsConstructor
//public class UserServicelmpl implements UserService {
//    // TODO ERORRRRR
//
//        private final AuthenticationManager authenticationManager;
//        private final UserRepository repository;
//        private final UserMapper mapper;
////        private final JwtProvider jwtProvider;
//        private final PasswordEncoder passwordEncoder;
//    private final UserMapper userMapper;
//
//    private UserRepository userRepository;
//
//    @Override
//    public LoginResponse login(LoginRequest loginRequest) {
//        Optional<User> userOptional = getByUsername(loginRequest.getUsername);
//
//        if (userRepository.iEmpty()) {
//            throw new CommonException("1000","user not exist in database", HttpStatus.BAD_REQUEST);
//        }
//
//        UsernamePasswordAuthenticationToken authenticationToken =
//                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword());
//        authenticationManager.authenticate(authenticationToken);
//
//        String token = jwtProvider.generateToken(userOptional.get());
//
//        return loginRequest.withToken(token);
//    }
//
//    @Override
//    public RegisterResponse register(RegisterRequest registerRequest) {
//
//        if (!Objects.equals(registerRequest.getPassword(), registerRequest.getConfirmPassword())) {
//            throw new CommonException("1001","password and confirmPassword not matched", HttpStatus.BAD_REQUEST);
//        }
//
//        Optional<User> userOptional = userRepository.findByUsername(registerRequest.getUsername());
//        if (userOptional.isPresent()) {
//            return new RegisterResponse("duplicate_username");
//        }
//
//        User user = userMapper.toUser(registerRequest);
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//
//        userRepository.insert(user);
//        return new RegisterResponse("register success");
//
//    }
//
//    @Override
//    public Optional<User> getByUsername(String username) {
//        return userRepository.findByUsername(username);
//    }
//}
