package it.aulab.showcasehub.services;

import java.util.List;

public interface CrudService<ReadDto, Model, Key> {
    List<ReadDto> readAll(); 
    ReadDto read(Key key);
    ReadDto create(Model model);
    ReadDto update(Key key, Model model);
    void delete(Key key);
}