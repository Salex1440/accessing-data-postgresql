package com.example.accessingdatapostgresql;

import org.springframework.data.repository.CrudRepository;

import com.example.accessingdatapostgresql.MyTable;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface TableRepository extends CrudRepository<MyTable, Integer> {

}
