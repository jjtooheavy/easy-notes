package com.example.easynotes.repository;

import com.example.easynotes.model.Note;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class NoteRepository extends SimpleJpaRepository<Note, Long>
{
    public NoteRepository( JpaEntityInformation<Note, ?> entityInformation, EntityManager entityManager )
    {
        super( entityInformation, entityManager );
    }
}
