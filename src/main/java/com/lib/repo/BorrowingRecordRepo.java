package com.lib.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lib.entity.BorrowingRecord;

public interface BorrowingRecordRepo  extends JpaRepository<BorrowingRecord,Long>{

}
