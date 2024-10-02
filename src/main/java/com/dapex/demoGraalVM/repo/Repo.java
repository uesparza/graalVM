package com.dapex.demoGraalVM.repo;

import com.dapex.demoGraalVM.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Client, Integer> {
}
