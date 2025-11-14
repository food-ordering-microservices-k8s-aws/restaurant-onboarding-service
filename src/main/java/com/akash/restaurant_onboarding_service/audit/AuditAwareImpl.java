package com.akash.restaurant_onboarding_service.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Author: akash
 * Date: 14/11/25
 */
@Component("auditAwareImpl")
public class AuditAwareImpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("restaurant-onboarding-service");
    }
}
