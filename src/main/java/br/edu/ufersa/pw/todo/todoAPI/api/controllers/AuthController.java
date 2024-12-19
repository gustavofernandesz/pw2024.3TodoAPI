//package br.edu.ufersa.pw.todo.todoAPI.api.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api/v1/login")
//public class AuthController {
//
//
//        @Autowired
//        private AuthenticationManager authenticationManager;
//
//        @Autowired
//        private JwtTokenUtil jwtTokenUtil; // Classe para gerar o token JWT
//
//        @PostMapping("/login")
//        public ResponseEntity<?> authenticate(@RequestBody LoginRequest loginRequest) {
//            try {
//                // Autentica o usuário
//                Authentication authentication = authenticationManager.authenticate(
//                        new UsernamePasswordAuthenticationToken(
//                                loginRequest.getUsername(),
//                                loginRequest.getPassword()
//                        )
//                );
//
//                SecurityContextHolder.getContext().setAuthentication(authentication);
//
//                // Gera o token JWT
//                String jwtToken = jwtTokenUtil.generateToken(authentication);
//
//                return ResponseEntity.ok(new JwtResponse(jwtToken));
//            } catch (Exception e) {
//                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
//            }
//        }
//    }
//
//}
