package com.grupo03.Lambda_Voyage.api.models.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TourFlyRequest implements Serializable {

    public Long id;
}
