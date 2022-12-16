package org.bedu.activemq_sesion6.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

// Annotation
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GreetingMessage implements Serializable {
    // Class data members
    static final long serialVersionUID
            = -7462433555964441775L;
    private UUID id;
    private String message;
}
