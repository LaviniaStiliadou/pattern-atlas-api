package com.patternpedia.api.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Table(indexes = {
        @Index(name = "sourcePatternIdx", columnList = "source_id"),
        @Index(name = "targetPatternIdx", columnList = "target_id")
})
public class DirectedEdge extends PatternRelationDescriptor {

    @JsonIgnore
    @ManyToOne(optional = false)
    private Pattern source;

    @JsonIgnore
    @ManyToOne(optional = false)
    private Pattern target;

    @JsonIgnore
    @ToString.Exclude
    @ManyToOne
    private PatternLanguage patternLanguage;

    @JsonIgnore
    @ToString.Exclude
    @OneToMany(mappedBy = "directedEdge")
    private List<PatternViewDirectedEdge> patternViews;
}