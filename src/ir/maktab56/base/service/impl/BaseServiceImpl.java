package ir.maktab56.base.service.impl;

import ir.maktab56.base.domain.BaseEntity;
import ir.maktab56.base.repository.BaseRepository;
import ir.maktab56.base.service.BaseService;

public class BaseServiceImpl<E extends BaseEntity<ID>, ID, Repository extends BaseRepository<E, ID>>
        implements BaseService<E, ID> {

    protected final Repository repository;

    public BaseServiceImpl(Repository repository) {
        this.repository = repository;
    }

    @Override
    public E save(E e) {
        return repository.save(e);
    }

    @Override
    public E update(E e) {
        return repository.update(e);
    }

    @Override
    public E[] findAll() {
        return repository.findAll();
    }

    @Override
    public E[] findAllById(ID[] ids) {
        return repository.findAllById(ids);
    }

    @Override
    public void deleteById(ID id) {
        repository.deleteById(id);
    }

    @Override
    public E findById(ID id) {
        return repository.findById(id);
    }
}
