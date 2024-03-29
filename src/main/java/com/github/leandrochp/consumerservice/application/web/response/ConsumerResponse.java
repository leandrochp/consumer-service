package com.github.leandrochp.consumerservice.application.web.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
public class ConsumerResponse {
    private Integer id;
    private String name;

    @JsonProperty("document_number")
    private String documentNumber;
    @JsonProperty("birth_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate birthDate;

    private ContactResponse contact;
    private AddressResponse address;
    private List<CardResponse> cards;
}
