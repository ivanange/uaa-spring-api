package uaa.spring.server;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class CFUAAOAuth2ResourceServerRestController {

    //@GetMapping("/")
    //public String index(@AuthenticationPrincipal JwtAuthenticationToken jwt) {
    //    return String.format("Hello, %s!", jwt.getSubject());
    //}

    @GetMapping("/api/read")
    public String read(JwtAuthenticationToken jwtAuthenticationToken) {
        return "Hello read: " + jwtAuthenticationToken.getTokenAttributes();
    }

    @GetMapping("/api/write")
    public String write(Principal principal) {
        return "Hello write: " + principal.getName();
    }
}
