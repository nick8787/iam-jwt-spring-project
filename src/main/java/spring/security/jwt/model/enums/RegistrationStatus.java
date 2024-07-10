package spring.security.jwt.model.enums;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public enum RegistrationStatus {
    PENDING_CONFIRMATION, ACTIVE, INACTIVE

}
