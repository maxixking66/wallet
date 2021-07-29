package ir.maktab56.base.repository;

import ir.maktab56.base.domain.BaseEntity;

public interface BaseRepository<E extends BaseEntity<ID>, ID> {

    E save(E e);

    E update(E e);

    E[] findAll();

    E[] findAllById(ID[] ids);

//    List<E> findAll();

//    List<E> findAllById(Collection<ID> ids);

    void deleteById(ID id);

    E findById(ID id);

    Boolean existsById(ID id);
}
