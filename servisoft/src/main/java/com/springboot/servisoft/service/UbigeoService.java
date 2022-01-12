package com.springboot.servisoft.service;

import com.springboot.servisoft.model.Ubigeo;
import com.springboot.servisoft.repository.UbigeoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class UbigeoService implements UbigeoRepository {

    @Autowired
    private UbigeoRepository ubirep;

    @Override
    public List<Ubigeo> findAll() {
        return ubirep.findAll();
    }

    @Override
    public List<Ubigeo> findAll(Sort sort) {
        return ubirep.findAll(sort);
    }

    @Override
    public Page<Ubigeo> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Ubigeo> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(Ubigeo entity) {
        ubirep.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Ubigeo> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Ubigeo> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Ubigeo> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Ubigeo> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Ubigeo> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Ubigeo> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Ubigeo> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Ubigeo getOne(String s) {
        return null;
    }

    @Override
    public Ubigeo getById(String s) {
        return null;
    }

    @Override
    public <S extends Ubigeo> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Ubigeo> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Ubigeo> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Ubigeo> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Ubigeo> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Ubigeo> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Ubigeo, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}