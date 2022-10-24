package com.example.authenticationmicroservice.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserTokens {
    @Id
    @Column(name = "user_id")
    private Long userId;
    String refreshToken;
    String accessToken;
    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;
}
