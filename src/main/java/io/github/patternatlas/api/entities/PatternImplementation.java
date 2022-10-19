package io.github.patternatlas.api.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class PatternImplementation {

    @Id
    @GeneratedValue(generator = "pg-uuid")
    private UUID id;

    private String type;

    private String link;

    @JsonIgnore
    @ToString.Exclude
    @ManyToOne
    private Pattern pattern;
}
