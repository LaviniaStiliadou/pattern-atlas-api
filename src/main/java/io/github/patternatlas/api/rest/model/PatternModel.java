package io.github.patternatlas.api.rest.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.github.patternatlas.api.entities.Pattern;
import io.github.patternatlas.api.entities.PatternImplementation;
import io.github.patternatlas.api.entities.PatternLanguage;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
public class PatternModel {

    protected UUID id;

    protected String uri;

    protected String name;

    protected String iconUrl;

    protected UUID patternLanguageId;

    protected String patternLanguageName;

    protected List<PatternImplementationModel> patternImplementations;

    protected String category;

    protected String tags;

    @JsonIgnore
    protected Pattern pattern;

    private PatternModel(Pattern pattern) {
        this.pattern = pattern;
        this.id = pattern.getId();
        this.uri = pattern.getUri();
        this.name = pattern.getName();
        this.iconUrl = pattern.getIconUrl();
        PatternLanguage patternLanguage = pattern.getPatternLanguage();
        this.patternLanguageId = patternLanguage.getId();
        this.patternLanguageName = patternLanguage.getName();
        this.patternImplementations = pattern.getPatternImplementations().stream().map(PatternImplementationModel::toModel).collect(Collectors.toList());
        this.category = pattern.getCategory();
        this.tags = pattern.getTags();
    }

    public static PatternModel from(Pattern pattern) {
        return new PatternModel(pattern);
    }
}
