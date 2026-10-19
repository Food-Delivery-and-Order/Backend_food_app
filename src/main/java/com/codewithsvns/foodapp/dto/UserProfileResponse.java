
package com.codewithsvns.foodapp.dto;

import com.codewithsvns.foodapp.model.AccountStatus;
import com.codewithsvns.foodapp.model.UserRole;

import java.time.Instant;
import java.util.UUID;

public record UserProfileResponse(
        UUID id,
        String fullName,
        UserRole role,
        AccountStatus accountStatus,
        Instant createdAt
) {
}
