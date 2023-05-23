package gcumsa.infra;

import gcumsa.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class WordHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Word>> {

    @Override
    public EntityModel<Word> process(EntityModel<Word> model) {
        return model;
    }
}
