package com.patternpedia.api.entities.pattern.language;

import java.net.URL;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.patternpedia.api.entities.PatternSchema;
import com.patternpedia.api.entities.edge.DirectedEdge;
import com.patternpedia.api.entities.edge.UndirectedEdge;
import com.patternpedia.api.entities.pattern.graph.PatternGraph;
import com.patternpedia.api.entities.pattern.pattern.Pattern;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class PatternLanguage extends PatternGraph {

    private URL logo;

    @JsonIgnore
    @OneToMany(mappedBy = "patternLanguage")
    private List<Pattern> patterns;

    @OneToOne(mappedBy = "patternLanguage", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private PatternSchema patternSchema;

    @JsonIgnore
    @OneToMany(mappedBy = "patternLanguage", fetch = FetchType.LAZY)
    private List<DirectedEdge> directedEdges;

    @JsonIgnore
    @OneToMany(mappedBy = "patternLanguage", fetch = FetchType.LAZY)
    private List<UndirectedEdge> undirectedEdges;
}