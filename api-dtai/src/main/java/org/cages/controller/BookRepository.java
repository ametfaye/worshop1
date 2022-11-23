package org.cages.controller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<AgentCAGES, Long> {
}
