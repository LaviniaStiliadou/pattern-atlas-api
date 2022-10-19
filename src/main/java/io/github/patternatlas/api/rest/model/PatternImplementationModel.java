package io.github.patternatlas.api.rest.model;

import io.github.patternatlas.api.entities.PatternImplementation;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@Data
public class PatternImplementationModel {

    protected UUID id;

    protected String type;

    protected String link;

    public static PatternImplementationModel toModel(PatternImplementation patternImplementation) {
        PatternImplementationModel model = new PatternImplementationModel();
        model.id = patternImplementation.getId();
        model.type = patternImplementation.getType();
        model.link = patternImplementation.getLink();
        return model;
    }

}
