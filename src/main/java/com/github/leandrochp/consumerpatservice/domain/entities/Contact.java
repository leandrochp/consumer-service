package com.github.leandrochp.consumerpatservice.domain.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Contact {
    private String mobilePhoneNumber;
    private String residencePhoneNumber;
    private String workPhoneNumber;
    private String email;
}
