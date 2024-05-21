package it.aulab.progettoblog.utils.mappings;

import org.modelmapper.AbstractConverter;
import java.util.Collection;

public class CollectionToIntegerConverter extends AbstractConverter<Collection<?>, Integer> {

    @Override
    protected Integer convert(Collection<?> source) {
        return source.size();
    }
    
}
